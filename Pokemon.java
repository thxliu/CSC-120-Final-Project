import java.util.ArrayList;

public class Pokemon {
  private final ArrayList<String> fairy = new ArrayList<>();
  private final ArrayList<String> normal = new ArrayList<>();
  private final ArrayList<String> fire = new ArrayList<>();
  private final ArrayList<String> water = new ArrayList<>();
  private final ArrayList<String> dragon = new ArrayList<>();;
  private final ArrayList<String> grass = new ArrayList<>();;
  protected static String chosenStarter;
  private int xp;
  private String chosenType;

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

  public String chooseStarterType() {
    System.out.println("Choose your Pokemon type: dragon, fairy, fire, grass, normal, water.");
    chosenType = Input.getScanner().nextLine();
    System.out.println("Generating starter Pokemon...");
    if (this.chosenType.equals("fairy")) {
      chosenStarter = fairy.get(0);
    } else if (this.chosenType.equals("normal")) {
      chosenStarter = normal.get(0);
    } else if (this.chosenType.equals("fire")) {
      chosenStarter = fire.get(0);
    } else if (this.chosenType.equals("water")) {
      chosenStarter = water.get(0);
    } else if (this.chosenType.equals("dragon")) {
      chosenStarter = dragon.get(0);
    } else if (this.chosenType.equals("grass")) {
      chosenStarter = grass.get(0);
    } else {
      throw new RuntimeException("That is not a valid Pokemon type. Please try again.");
    }
    System.out.println("Here is your starter Pokemon: " + chosenStarter + " with 100 XP! ");
    return chosenStarter;
  }

  public int getXp() {
    return this.xp;
  }

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

  public static void main(String[] args) {
    Pokemon myPokemon = new Pokemon();
    myPokemon.chooseStarterType();
  }
}