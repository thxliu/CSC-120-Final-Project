import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

public class Battle extends Trainer {
  int shields;
  Pokemon opponent;
  String opponentName;
  private int opponentXP;
  Trainer trainer;
  Pokemon pokemon;
  String pokemonName;
  static Hashtable<String, Integer> opponent_list;
  int attack_damage;
  int pokemonXP;

  public Battle() {
    // trainer = new Trainer();
    Trainer.start();
    pokemon = new Pokemon();
    // this.pokemon = new Pokemon();
    // this.pokemonXP = pokemon.getXp();
    this.shields = 2;
    Battle.opponent_list = new Hashtable<String, Integer>();
    this.attack_damage = 0;
  }

  public int getOpponentXP() {
    return this.opponentXP;
  }

  public int generateOpponent() {
    opponent_list = new Hashtable<String, Integer>();
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
    this.opponentName = opponentName;
    // int opponentXP = opponent_list.get(opponentName);
    this.opponentXP = opponent_list.get(opponentName);
    System.out.println("Generated opponent: " + this.opponentName + " of XP " + this.opponentXP + ".");
    return this.opponentXP;
  }

  public int defend() {
    this.shields -= 1;
    if (this.shields == 0) {
      System.out.print("You have no more shields left.");
    }
    return this.shields;
  }

  public void attack() {
    // generate opponent
    this.generateOpponent();
    // while both players are still alive
    // again
    while (pokemon.getXp() > 0 && this.opponentXP > 0) {
      // asks user if they want to use shields
      System.out.println(this.opponentName + " is attacking! \n" + "You have " + this.shields + " left. \n" +
          "Do you want to use a shield? (Type yes or no)");
      String shield_use = Input.getScanner().nextLine();
      // if user wants to use shields, then defend-- xp stays the same
      if (shield_use.equalsIgnoreCase("yes")) {
        defend();
        if (this.shields >= 0) {
          throw new RuntimeException("NO MORE SHIELDS LEFT");
        }
        // otherwise, asks if the player wants to counterattack
      } else {
        System.out.println("Do you wish to counterattack? Type yes or no.");
        String counter_attack = Input.getScanner().nextLine();
        if (counter_attack.equalsIgnoreCase("yes")) {
          System.out.println("How would you like to attack? Here are your options: ");
          // gathers trainer's learned attacks
          for (int i = 0; i < learned_attacks.size(); i++) {
            System.out.println(learned_attacks.get(i));
          }
          long startTime = System.currentTimeMillis();
          String chosenAttack = Input.getScanner().nextLine();
          // times user response to calculate damage
          System.out.println("Please choose an attack. Type of the name of your attack to fight.");
          long endTime = System.currentTimeMillis();
          long time = (endTime - startTime) / 1000;
          System.out.println(time);
          if (time <= 5) {
            attack_damage = 50;
            System.out.println("Attacking " + opponentName + " with " + chosenAttack + " with " + attack_damage + "xp");
            opponentXP -= 50;
          } else if (5 < time && time <= 10) {
            attack_damage = 25;
            System.out.println("Attacking " + opponentName + " with " + chosenAttack + " with " + attack_damage + "xp");
            opponentXP -= 25;
          } else {
            attack_damage = 10;
            opponentXP -= 10;
          }
          System.out.println("Attacking " + opponentName + " with " + chosenAttack + " with " + attack_damage + "xp");
          // choose not to counterattack
        } else if (counter_attack.equalsIgnoreCase("no")) {
          System.out.println(
              "You have chosen not to counterattack. " + opponentName + "'s attack had 50 xp damage.");
          pokemonXP -= 50;
        } else {
          throw new RuntimeException("Not a valid option. You must start over.");
        }
      }
    }
    // if opponent wins
    if (opponentXP > 0) {
      System.out.println("Sorry, Trainer " + getTrainerName() + ", you have lost the battle. ");
      System.out.println("Good effort! " + chosenStarter
          + " is stronger now but better luck next time. Your pokemon has gained 15 XP for their efforts.");
      pokemonXP += 15;
      // if user wins
    } else {
      System.out.println("Congratulations, Trainer " + this.name + " you have won the battle!");
      pokemonXP += 100;
      System.out.println("As a reward, your pokemon has gained 100 XP! " + " Pokemon " + chosenStarter + " now has "
          + pokemonXP + " XP.");
    }
    // asks user if they want to battle again
    System.out.println("Would you like to battle again? Type Y for yes or N for no.");
    String another_battle = Input.getScanner().nextLine();
    if (another_battle.equalsIgnoreCase("Y")) {
      attack();
    } else {
      System.out.println("Thank you " + trainer.getTrainerName() + "for playing!");
    }
  }

  public void startBattle() {
    attack();
  }

  public static void main(String[] args) {
    Battle myBattle = new Battle();
    myBattle.startBattle();
  }
}