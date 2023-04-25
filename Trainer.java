import java.util.ArrayList;
import java.util.Scanner;

public class Trainer {

    String name;
    int trainer_level;
    ArrayList<String> Attacks;

    public Trainer(String name, int trainer_level) {
        this.name = name;
        this.trainer_level = 1;
        ArrayList<String> Attacks = ;
    }

    public void learn() {

    }

    public Pokemon chooseStarter(Pokemon starter) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        return starter;
    }
}