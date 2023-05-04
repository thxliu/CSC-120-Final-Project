import java.util.ArrayList;

public class Pokemon {
    protected final Pokemon_Types type;
    private final ArrayList<String> fairy;
    private final ArrayList<String> normal;
    private final ArrayList<String> fire;
    private final ArrayList<String> water;
    private final ArrayList<String> dragon;
    private final ArrayList<String> grass;
    private static String chosenStarter;

    public Pokemon(String name, int xp) {
        this.name = name;
        this.xp = 0;
        ArrayList<String> fairy = new ArrayList<>();
        fairy.add("Togepi");
        fairy.add("Togetic");
        fairy.add("Togekiss");
        ArrayList<String> normal = new ArrayList<>();
        normal.add("Lillipup");
        normal.add("Herdier");
        normal.add("Stoutland");
        ArrayList<String> fire = new ArrayList<>();
        fire.add("Cyndaquil");
        fire.add("Quilava");
        fire.add("Typhlosion");
        ArrayList<String> water = new ArrayList<>();
        water.add("Poliwag");
        water.add("Poliwhirl");
        water.add("Poliwrath");
        ArrayList<String> dragon = new ArrayList<>();
        dragon.add("Dratini");
        dragon.add("Dragonair");
        dragon.add("Dragonite");
        ArrayList<String> grass = new ArrayList<>();
        grass.add("Chikorita");
        grass.add("Bayleef");
        grass.add("Meganium");
    }

    public void evolve() {
        if (GUI.chosenType.equals("fairy")) {
            if (this.xp >= 150 && xp < 200) {
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
        if (GUI.chosenType.equals("normal")) {
            if (xp >= 150 && xp < 200) {
                chosenStarter = normal.get(1);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                chosenStarter = normal.get(2);
                System.out.println("Your pokemon has successfully evolved into " + chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (GUI.chosenType.equals("fire")) {
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
        if (GUI.chosenType.equals("water")) {
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
        if (GUI.chosenType.equals("dragon")) {
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
        if (GUI.chosenType.equals("grass")) {
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

    public static void main(String[] args) {
        System.out.println(chosenStarter);
    }
}