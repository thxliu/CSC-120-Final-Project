import java.time.Duration;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Battle {
    int shields;
    Pokemon opponent;
    int trainer_damage;
    int opponent_damage;
    Trainer myTrainer;
    Pokemon myPokemon;
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
        Random random = new Random();
        int randomInt = random.nextInt(opponent_list.size());
        ArrayList<String> opponentNames = new ArrayList<>(opponent_list.keySet()); 
        String randomOpponentName = opponentNames.get(randomInt);
        int opponentXP = opponent_list.get(randomOpponentName);
        System.out.println("Generated opponent: " + randomOpponentName + " of XP " + opponentXP + ".");
    }

    public int defend() {
        this.shields -= 1;
        if (this.shields == 0) {
            throw new RuntimeException("You have no more shields left.");
        }
        return this.shields;
    }

    public int attack() {
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
                System.out.println(myTrainer.learned_attacks);
                long startTime = System.currentTimeMillis();
                String chosenAttack =  Input.getScanner().nextLine();
                System.out.println("Please choose an attack. Type of the name of your attack to fight.");
                long endTime = System.currentTimeMillis();
                long time = (endTime - startTime)/1000; 
                System.out.println(time);
                if (time <= 5) {
                    int attack_damage = 50;
                    System.out.println("Attacking " + opponent + " with " + chosenAttack + " with " + attack_damage + "xp");
                } else if (5 < time && time <= 10) {
                    int attack_damage = 25;
                } else {
                    int attack_damage = 10;
                }
                int attack_damage;
                System.out.println("Attacking " + opponent + " with " + chosenAttack + " with " + attack_damage + "xp");
            } else {
                System.out.println("You have chosen not to counterattack. " + opponent);
            }

        }
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