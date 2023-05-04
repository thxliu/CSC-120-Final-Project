import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Battle extends Trainer{
    int shields;
    Pokemon opponent;
    int trainer_damage;
    int opponent_damage;
    Trainer trainer;
    Pokemon pokemon;
    Hashtable<String, Integer> opponent_list;
    int attack_damage;
    int opponentXP;

    public Battle() {
        this.shields = 2;
        this.opponent_list = new Hashtable<String, Integer>();
        this.attack_damage = 0;
    }

    public int generateOpponent() {
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
        String opponentName = opponentNames.get(randomInt);
        int opponentXP = opponent_list.get(opponentName);
        System.out.println("Generated opponent: " + opponentName + " of XP " + opponentXP + ".");
        return opponentXP;
    }

    public int defend() {
        this.shields -= 1;
        if (this.shields == 0) {
            throw new RuntimeException("You have no more shields left.");
        }
        return this.shields;
    }

    public void attack() {
        System.out.println(getStarterPokemon());
        generateOpponent();
        while (getStarterPokemon() >0 && opponentXP >0) {
            System.out.println("hi ");
        }

        // while (trainer.getXP()> 0 && opponent.xp >0){
        //     System.out.println(opponent + " is attacking! \n" + "You have " + this.shields + " left. \n" + "Do you want to use a shield? (Type yes or no)");
        //     String shield_use = Input.getScanner().nextLine();
        //     if (shield_use.equalsIgnoreCase("yes")) {
        //         defend();
        //     } else {
        //         System.out.println("Do you wish to counterattack? Type Y for yes or N for no.");
        //         String counter_attack = Input.getScanner().nextLine();
        //         if (counter_attack.equalsIgnoreCase("Y")) {
        //             System.out.println("How would you like to attack? Here are your options: ");
        //             System.out.println(trainer.learned_attacks);
        //             long startTime = System.currentTimeMillis();
        //             String chosenAttack =  Input.getScanner().nextLine();
        //             System.out.println("Please choose an attack. Type of the name of your attack to fight.");
        //             long endTime = System.currentTimeMillis();
        //             long time = (endTime - startTime)/1000; 
        //             System.out.println(time);
        //             if (time <= 5) {
        //                 attack_damage = 50;
        //                 System.out.println("Attacking " + opponent + " with " + chosenAttack + " with " + attack_damage + "xp");
        //             } else if (5 < time && time <= 10) {
        //                 attack_damage = 25;
        //             } else {
        //                 attack_damage = 10;
        //             } 
        //             System.out.println("Attacking " + opponent + " with " + chosenAttack + " with " + attack_damage + "xp");
                    
        //         } else {
        //             System.out.println("You have chosen not to counterattack. " + opponent);
        //         }
        //     }
        // }
        // // return winner;
    }

    public static void main(String[] args) {
        Battle myBattle = new Battle();
        myBattle.learn();
        myBattle.attack();
    }
}

