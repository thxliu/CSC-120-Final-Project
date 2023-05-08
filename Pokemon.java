import java.util.ArrayList;

/**
 * Represents a Pokemon.
 */
public class Pokemon {
  /** Array list of fairy type Pokemon. */
  ArrayList<String> fairy = new ArrayList<>();
  /** Array list of normal type Pokemon. */
  ArrayList<String> normal = new ArrayList<>();
  /** Array list of fire type Pokemon. */
  ArrayList<String> fire = new ArrayList<>();
  /** Array list of water type Pokemon. */
  ArrayList<String> water = new ArrayList<>();
  /** Array list of dragon type Pokemon. */
  ArrayList<String> dragon = new ArrayList<>();
  /** Array list of grass type Pokemon. */
  ArrayList<String> grass = new ArrayList<>();
  /** User's chosenStarter Pokemon based on chosenType*/
  static String chosenStarter;
  /** Pokemon's XP (experience points) */
  private int xp;
  /** User's chosen type of Pokemon */
  private String chosenType;

  /**
   * Constructor for Pokemon.
   * Sets user's XP to 100.
   * Adds Pokemon to corresponding ArrayList based on type.
   */
  public Pokemon() {
    this.xp = 100;
    fairy.add("Togepi");
    fairy.add("Togetic");
    fairy.add("Togekiss");
    normal.add("Lillipup");
    normal.add("Herdier");
    normal.add("Stoutland");
    fire.add("Cyndaquil");
    fire.add("Quilava");
    fire.add("Typhlosion");
    water.add("Poliwag");
    water.add("Poliwhirl");
    water.add("Poliwrath");
    dragon.add("Dratini");
    dragon.add("Dragonair");
    dragon.add("Dragonite");
    grass.add("Chikorita");
    grass.add("Bayleef");
    grass.add("Meganium");
  }

  /**
   * Generates starter pokemon from user's chosenType in GUI.
   * @return chosenStarter The user's starter Pokemon
   */
  public String chooseStarterType() {
    System.out.println("Generating starter Pokemon...");
    if (GUI.chosenType.equals("fairy")) {
      chosenStarter = fairy.get(0);
    } else if (GUI.chosenType.equals("normal")) {
      chosenStarter = normal.get(0);
    } else if (GUI.chosenType.equals("fire")) {
      chosenStarter = fire.get(0);
    } else if (GUI.chosenType.equals("water")) {
      chosenStarter = water.get(0);
    } else if (GUI.chosenType.equals("dragon")) {
      chosenStarter = dragon.get(0);
    } else if (GUI.chosenType.equals("grass")) {
      chosenStarter = grass.get(0);
    } else {
      throw new RuntimeException("That is not a valid Pokemon type. Please try again.");
    }
    System.out.println("Here is your starter Pokemon: " + chosenStarter + " with 100 XP! ");
    return chosenStarter;
  }

  /**
   * Accessor for Pokemon's XP.
   * @return The Pokemon's XP
   */
  public int getXp() {
    return this.xp;
  }

  /**
   * Evolves Pokemon based on number of XP. 
   */
  public void evolve() {
    if (this.chosenType.equals("fairy")) {
      if (this.xp >= 150 && this.xp < 200) {
        chosenStarter = fairy.get(1);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else if (this.xp >= 200) {
        chosenStarter = fairy.get(2);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else {
        System.out.println(chosenStarter +
            " does not have enough XP to evolve. Please continue training and try again later.");
      }
    }
    if (this.chosenType.equals("normal")) {
      if (this.xp >= 150 && this.xp < 200) {
        chosenStarter = normal.get(1);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else if (this.xp >= 200) {
        chosenStarter = normal.get(2);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else {
        System.out.println(chosenStarter +
            " does not have enough XP to evolve. Please continue training and try again later.");
      }
    }
    if (this.chosenType.equals("fire")) {
      if (this.xp >= 150 && this.xp < 200) {
        chosenStarter = fire.get(1);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else if (xp >= 200) {
        chosenStarter = fire.get(2);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else {
        System.out.println(chosenStarter +
            " does not have enough XP to evolve. Please continue training and try again later.");
      }
    }
    if (this.chosenType.equals("water")) {
      if (this.xp >= 150 && this.xp < 200) {
        chosenStarter = water.get(1);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else if (this.xp >= 200) {
        chosenStarter = water.get(2);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else {
        System.out.println(chosenStarter +
            " does not have enough XP to evolve. Please continue training and try again later.");
      }
    }
    if (this.chosenType.equals("dragon")) {
      if (this.xp >= 150 && this.xp < 200) {
        chosenStarter = dragon.get(1);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else if (this.xp >= 200) {
        chosenStarter = dragon.get(2);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else {
        System.out.println(chosenStarter +
            " does not have enough XP to evolve. Please continue training and try again later.");
      }
    }
    if (this.chosenType.equals("grass")) {
      if (this.xp >= 150 && this.xp < 200) {
        chosenStarter = grass.get(1);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else if (this.xp >= 200) {
        chosenStarter = grass.get(2);
        System.out.println(
            "Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + this.xp +
                ". Congratulations!");
      } else {
        System.out.println(chosenStarter +
            " does not have enough XP to evolve. Please continue training and try again later.");
      }
    }
  }

  /**
   * Main method used to create new Pokemon and calls chooseStarterType() on that Pokemon.
   * @param args The command line arguments
   */
  public static void main(String[] args) {
    Pokemon myPokemon = new Pokemon();
    myPokemon.chooseStarterType();
  }
}