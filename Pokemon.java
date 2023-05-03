import java.util.ArrayList;

public class Pokemon {
    protected final Pokemon_Types type;
    private final ArrayList<String> fairy = new ArrayList<>();
    private final ArrayList<String> normal = new ArrayList<>();
    private final ArrayList<String> fire = new ArrayList<>();
    private final ArrayList<String> water = new ArrayList<>();
    private final ArrayList<String> dragon = new ArrayList<>();
    private final ArrayList<String> grass = new ArrayList<>();
    String chosenStarter;
    int xp;

    public Pokemon(Pokemon_Types type) {
        this.type = type;
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

    public String chooseStarter() {
        System.out.println("Choose your Pokemon type: ");
        for (Pokemon_Types type : Pokemon_Types.values()) {
            System.out.println(type);
        }
        String chosenStarter = Input.getScanner().nextLine();
        System.out.println("Here is your starter Pokemon of type " + chosenStarter);
        return chosenStarter;
    }

    public void evolve() {
        if (chosenStarter.equals("fairy")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = fairy.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = fairy.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (chosenStarter.equals("normal")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = normal.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = fairy.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (chosenStarter.equals("fire")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = fire.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = fire.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (chosenStarter.equals("water")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = water.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = water.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (chosenStarter.equals("dragon")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = dragon.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = dragon.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (chosenStarter.equals("grass")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = grass.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = grass.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
    }

}