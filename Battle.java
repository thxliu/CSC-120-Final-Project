import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Random;

/**
 * Represents a Battle
 */
public class Battle {
  /** The number of shields the Trainer has */
  int shields;
  /** The Pokemon that is the opponent of the Trainer's Pokemon */
  Pokemon opponent;
  /** The name of the Pokemon opponent */
  String opponentName;
  /** The number of experience points (XP) the opponent has */
  private int opponentXP;
  /** The Trainer that the user is playing as */
  static Trainer trainer;
  /** The Trainer's pokemon */
  // static Pokemon pokemon;
  /** The name of the Trainer's pokemon*/
  String pokemonName;
  /** Hashtable listing opponent name and XP */
  static Hashtable<String, Integer> opponent_list;
  /** Amount of damage caused by an attack  */
  int attackDamage;
  /** The XP of the Trainer's pokemon */
  int pokemonXP;

  /**
   * Constructor for Battle class.
   * Uses start() method from Trainer class to create Trainer.
   * Creates new Pokemon.
   * Sets Trainer's number of shields = 2.
   * Initializes list of Pokemon opponents.
   */
  public Battle() {
    Trainer.start();
    Trainer.pokemon = new Pokemon();
    this.shields = 2;
    Battle.opponent_list = new Hashtable<String, Integer>();
  }

  /**
   * Accessor for Pokemon opponent's XP.
   * @return The Pokemon opponent's XP
   */
  public int getOpponentXP() {
    return this.opponentXP;
  }

  /**
   * Generates a random Pokemon opponent.
   * @return The random Pokemon opponent's XP
   */
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
    this.opponentXP = opponent_list.get(opponentName);
    System.out.println("Generated opponent: " + this.opponentName + " of XP " + this.opponentXP + ".");
    return this.opponentXP;
  }

  /**
   * Method allowing user to defend using a shield or state they have no shields left.
   * @return The number of shields the Trainer has
   */
  public int defend() {
    this.shields -= 1;
    if (this.shields == 0) {
      System.out.print("You have no more shields left.");
    }
    return this.shields;
  }

  /**
   * Creates battle between Trainer's pokemon and generated opponent.
   * Checks pokemon and opponent's XP.
   * Asks user if they want to use a shield use and calls defend().
   * If a shield is not used, program performs counterattack and times user response, calculating damage accordingly.
   * Determines winner of Battle.
   * Asks user if they want to battle again or end the game.
   */
  public void attack() {
    this.generateOpponent();
    while (Trainer.pokemon.getXp() > 0 && this.opponentXP > 0) {
      System.out.println(this.opponentName + " is attacking! \n" + "You have " + this.shields + " left. \n" + "Do you want to use a shield? (Type yes or no)");
      String shield_use = Input.getScanner().nextLine();
      if (shield_use.equalsIgnoreCase("yes")) {
        defend();
        if (this.shields <= 0) {
          throw new RuntimeException("NO MORE SHIELDS LEFT. You have lost the battle.");
        }
      } else {
        System.out.println("Do you wish to counterattack? Type yes or no.");
        String counter_attack = Input.getScanner().nextLine();
        if (counter_attack.equalsIgnoreCase("yes")) {
          System.out.println("How would you like to attack? Here are your options: ");
          for (int i = 0; i < Trainer.learned_attacks.size(); i++) {
            System.out.println(Trainer.learned_attacks.get(i));
          }
          long startTime = System.currentTimeMillis();
          String chosenAttack = Input.getScanner().nextLine();
          System.out.println("Please choose an attack. Type of the name of your attack to fight.");
          long endTime = System.currentTimeMillis();
          long time = (endTime - startTime) / 1000;
          System.out.println(time);
          if (time <= 5) {
            attackDamage = 50;
            System.out.println("Attacking " + opponentName + " with " + chosenAttack + " with " + attackDamage + "xp");
            opponentXP -= 50;
            System.out.println(opponentName + " now has " + opponentXP + " XP.");
          } else if (5 < time && time <= 10) {
            attackDamage = 25;
            System.out.println("Attacking " + opponentName + " with " + chosenAttack + " with " + attackDamage + "xp");
            System.out.println(opponentName + " now has " + opponentXP + " XP.");
            opponentXP -= 25;
          } else {
            attackDamage = 10;
            opponentXP -= 10;
            System.out.println(opponentName + " now has " + opponentXP + " XP.");
          }
          System.out.println("Attacking " + opponentName + " with " + chosenAttack + " with " + attackDamage + "xp");
          System.out.println(opponentName + " now has " + opponentXP + " XP.");
        } else if (counter_attack.equalsIgnoreCase("no")) {
          System.out.println("You have chosen not to counterattack. " + opponentName + "'s attack had 50 xp damage.");
          pokemonXP -= 50;
          System.out.println("Your pokemon " + pokemonName + " now has " + pokemonXP + " XP.");
          System.out.println(opponentName + " now has " + opponentXP + " XP.");
        } else {
          throw new RuntimeException("Not a valid option. You must start over.");
        }
      }
    }
    if (opponentXP > 0) {
      System.out.println("Sorry, Trainer " + Trainer.getTrainerName() + ", you have lost the battle. ");
      System.out.println("Good effort! " + Pokemon.chosenStarter
          + " is stronger now but better luck next time. Your pokemon has gained 15 XP for their efforts.");
      pokemonXP += 15;
    } else {
      System.out.println("Congratulations, Trainer " + Trainer.getTrainerName() + " you have won the battle!");
      pokemonXP += 100;
      System.out.println("As a reward, your pokemon has gained 100 XP! " + " Pokemon " + Pokemon.chosenStarter + " now has "
          + pokemonXP + " XP.");
    }
    System.out.println("Would you like to battle again? Type Y for yes or N for no.");
    String another_battle = Input.getScanner().nextLine();
    if (another_battle.equalsIgnoreCase("Y")) {
      attack();
    } else {
      System.out.println("Thank you " + Trainer.getTrainerName() + "for playing!");
    }
  }

  /**
   * Starts battle by calling attack() method.
   */
  public void startBattle() {
    attack();
  }

  /**
   * Main method used to test methods in Battle class
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Battle myBattle = new Battle();
    myBattle.startBattle();
  }
}