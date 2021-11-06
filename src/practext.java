import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class practext {

    public static void main(String args[]) throws FileNotFoundException {

        Utility utils = new Utility();

        TxtParse parser = new TxtParse();
        List<Warrior> listWarrior = parser.parseWarrior();
        List<Sorcerer> listSorcerer = parser.parseSorcerer();
        List<Paladin> listPaladin = parser.parsePaladin();
        List<Hero> heroesList = new ArrayList<>();
        List<Hero> chosenHeroesList = new ArrayList<>();

        System.out.println("CHOOSE YOUR HERO (*smash narrator voice*)");
        System.out.println("");

        System.out.println("Warriors:");
        for (int i = 0; i < listWarrior.size(); i++) {
            System.out.println("'"+(i+1)+"'" + " = " + listWarrior.get(i).toString());
            heroesList.add(i, listWarrior.get(i));
        }
        System.out.println("");

        System.out.println("Sorcerers:");
        for (int i = 0; i < listSorcerer.size(); i++) {
            System.out.println("'"+(i+7)+"'" + " = " + listSorcerer.get(i).toString());
            heroesList.add(i, listSorcerer.get(i));
        }
        System.out.println("");

        System.out.println("Paladins:");
        for (int i = 0; i < listPaladin.size(); i++) {
            System.out.println("'"+(i+13)+"'" + " = " + listPaladin.get(i).toString());
            heroesList.add(i, listPaladin.get(i));
        }
        System.out.println("");

        System.out.println("^^^ Choose Hero from above. ^^^");

        int getNumHeroes = 3;

        for (int j = 0; j < getNumHeroes; j++) {
            int choice = utils.getInt("Type in number shown on the left of your choice and hit Enter:");
            System.out.println("Great choice! You've chosen " + heroesList.get(choice-1).getName().toString());
            chosenHeroesList.add(heroesList.get(choice-1));
            System.out.println("");
        }
    }
}

