import java.util.ArrayList;

public class Trainer {

    private String name;
    private int trainer_level;
    protected ArrayList<String> learned_attacks = new ArrayList<>();
    private Pokemon chosenStarter;

    public Trainer() {
        System.out.println("Welcome new trainer! Please enter your Trainer name: ");
        this.name = Input.getScanner().nextLine();
        System.out.println("Hope you enjoy, " + name + "!");
        this.trainer_level = 1;
        this.learned_attacks = new ArrayList<>();
    }

    public String getTrainerName() {
        return this.name;
    }

    public int getTrainerLevel() {
        return this.trainer_level;
    }

    public String getStarterPokemon() {
        return chosenStarter;
    }


    public void learn() {
        ArrayList<String> full_attack_list = new ArrayList<>();
        full_attack_list.add("punch");
        full_attack_list.add("kick");
        full_attack_list.add("slam");
        full_attack_list.add("blast");
        while (true) {
            System.out.println("Which of the following attacks would you like to learn: punch, kick, slam, blast");
            String learn_attack = Input.getScanner().nextLine();
            if (learn_attack.equalsIgnoreCase("punch")) {
                learned_attacks.add("punch");
            } else if (learn_attack.equalsIgnoreCase("kick")) {
                learned_attacks.add("kick");
            } else if (learn_attack.equalsIgnoreCase("slam")) {
                learned_attacks.add("slam");
            } else if (learn_attack.equalsIgnoreCase("blast")) {
                learned_attacks.add("blast");
            } else {
                throw new RuntimeException(learn_attack + " is not a valid attack. Please enter one of the following: punch, kick, slam, blast.");
            }
            if (this.learned_attacks.containsAll(full_attack_list)) {
                this.xp += 50;
                System.out.println("You have unlocked all possible attacks!");
                break;
            }
            System.out.println("Do you want to continue learning attacks? Type Y for yes or N for no.");
            String userStopLearning = Input.getScanner().nextLine();
            if (userStopLearning.equals("Y")) {
                continue;
            } else if (userStopLearning.equals("N")) {
                System.out.println("Come back later to learn more attacks, have a great day!");
                break;
            } else {
                throw new RuntimeException("That was not a valid option. Please try again.");
            }
        }
        System.out.println("Here are the attacks you have learned:");
        for (int i = 0; i < learned_attacks.size(); i++) {
            System.out.println(learned_attacks.get(i));
        }
    }

    public static void start() {
        Trainer myTrainer = new Trainer();
        System.out.println("Would you like to learn new attacks? Enter Y for yes or N for no.");
        String user_learns = Input.getScanner().nextLine();
        if (user_learns.equalsIgnoreCase("Y")) {
            myTrainer.learn();
        } else if (user_learns.equalsIgnoreCase("N")) {
            System.out.println("Come back later, have a great day!");
        } else {
            throw new RuntimeException("That was not a valid option. Please try again.");
        }
    }

    public static void main(String[] args) {
        start();
    }
}