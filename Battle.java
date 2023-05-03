import java.time.Instant;
import java.time.temporal.ChronoField;
import java.time.Duration;
import java.util.Hashtable;
import java.util.Random;

public class Battle extends Trainer {
    int shields;
    Pokemon opponent;
    int trainer_damage;
    int opponent_damage;
    static Trainer myTrainer;
    Hashtable<String, Integer> opponent_list;

    public Battle() {
        this.shields = 2;
        this.opponent_list = new Hashtable<String, Integer>();
    }

    public void generateOpponent() {
        this.opponent_list = new Hashtable<String, Integer>();
        opponent_list.put("Pikachu", 100);
        opponent_list.put("Raichu", 250);
        opponent_list.put("Slowpoke", 150);
        opponent_list.put("Snorlax", 200);
        opponent_list.put("Eevee", 300);
        System.out.println("Generating an opponent...");
        Random random_opponent = new Random();
        int index = random_opponent.nextInt(opponent_list.size());
        String randomKey = (String) opponent_list.keySet().toArray()[index];
        Integer randomValue = opponent_list.get(randomKey);
        System.out.println("Generated opponent: " + randomKey + " of XP " + randomValue + ".");
    }

    public int defend() {
        this.shields -= 1;
        if (this.shields == 0) {
            throw new RuntimeException("You have no more shields left.");
        }
        return this.shields;
    }

    public void attack() {
        System.out.println(opponent + " is attacking! \n" + "You have " + this.shields + " left. \n"
                + "Do you want to use a shield? (Type yes or no)");
        String shield_use = Input.getScanner().nextLine();
        if (shield_use.equalsIgnoreCase("yes")) {
            defend();
        } else {
            System.out.println("Do you wish to counterattack? Type Y for yes or N for no.");
            String counter_attack = Input.getScanner().nextLine();
            if (counter_attack.equalsIgnoreCase("yes")) {
                System.out.println("How would you like to attack? Here are your options: ");
                System.out.println(this.learned_attacks);
                Instant startTime = Instant.now();
                int start = startTime.get(ChronoField.MILLI_OF_SECOND);
                System.out.println("Please choose an attack. Type of the name of your attack to fight.");
                Instant endTime = Instant.now();
                int end = endTime.get(ChronoField.MILLI_OF_SECOND);
                String typedAttack = Input.getScanner().nextLine();
                int time = end - start;
                System.out.println(time);
                // if typed in less than 5 seconds, power of attack stays same, if more, attack
                // is less powerful
            }

        }

        // public void startBattle() {
        // myTrainer.learn();
        // }
    }

    public static void main(String[] args) {
        Battle myBattle = new Battle();
        myBattle.learn();
        myBattle.attack();
        // myBattle.generateOpponent();
    }
}

// What user should see

// Generates opponent
// Opponent is throwing an attack! You have # shields left. Do you want to use a
// shield? (Type yes or no)
// if yes, hp stays the same
// if not using shields or have 0 shields; type in attack;
// if typed in less than 5 (or some #) seconds, power of attack stays same, if
// more, attack is less powerful