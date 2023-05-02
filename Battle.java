// import java.time.Duration;
import java.util.ArrayList;

public class Battle extends Trainer {
    int shields;
    Pokemon opponent;
    int trainer_damage;
    int opponent_damage;
    static Trainer myTrainer;

    public Battle() {
        this.shields = 2;
    }

    // public void generateOpponent() {
    //     String[] opponent_list = ["Pikachu", "Charmander"];
    //     System.out.println("Generating an opponent...");
    // }

    public int defend() {
        this.shields -= 1;
        if (this.shields == 0) {
            throw new RuntimeException("You have no more shields left.");
        }
        return this.shields;
    }

    public void attack() {
        System.out.println(opponent + " is attacking! \n" + "You have " + this.shields + " left. \n" + "Do you want to use a shield? (Type yes or no)");
        String shield_use = Input.getScanner().nextLine();
        if (shield_use.equalsIgnoreCase("yes")) {
            defend();
        }
        else {
            System.out.println("Do you wish to counterattack?");
            String counter_attack = Input.getScanner().nextLine();
            if (counter_attack.equalsIgnoreCase("yes")) {
                System.out.println("How would you like to attack? Here are your options: ");
                System.out.println(Trainer.learned_attacks);
                // if typed in less than 5 seconds, power of attack stays same, if more, attack is less powerful 
        }

    }   
    // public void startBattle() {
    //     myTrainer.learn();
    // }
    }
    public static void main(String[] args) {
        Battle myBattle = new Battle();
        myBattle.learn();
        myBattle.attack();
    }
}

// What user should see

// Generates opponent
// Opponent is throwing an attack! You have # shields left. Do you want to use a shield? (Type yes or no)
// if yes, hp stays the same
// if not using shields or have 0 shields; type in attack; 
// if typed in less than 5 (or some #) seconds, power of attack stays same, if more, attack is less powerful 