import java.util.ArrayList;

public class Pokemon {
    protected final Pokemon_Types type;
    private final ArrayList<String> fairy = new ArrayList<>();
    private final ArrayList<String> normal = new ArrayList<>();
    private final ArrayList<String> fire = new ArrayList<>();
    private final ArrayList<String> water = new ArrayList<>();
    private final ArrayList<String> dragon = new ArrayList<>();
    private final ArrayList<String> grass = new ArrayList<>();
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

    public void evolve() {
        if (GUI.chosenStarter.equals("fairy")) {
            if (xp >= 150 && xp < 200) {
                GUI.chosenStarter = fairy.get(1);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                GUI.chosenStarter = fairy.get(2);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(GUI.chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (GUI.chosenStarter.equals("normal")) {
            if (xp >= 150 && xp < 200) {
                GUI.chosenStarter = normal.get(1);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                GUI.chosenStarter = fairy.get(2);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(GUI.chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (GUI.chosenStarter.equals("fire")) {
            if (xp >= 150 && xp < 200) {
                GUI.chosenStarter = fire.get(1);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                GUI.chosenStarter = fire.get(2);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(GUI.chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (GUI.chosenStarter.equals("water")) {
            if (xp >= 150 && xp < 200) {
                GUI.chosenStarter = water.get(1);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                GUI.chosenStarter = water.get(2);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(GUI.chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (GUI.chosenStarter.equals("dragon")) {
            if (xp >= 150 && xp < 200) {
                GUI.chosenStarter = dragon.get(1);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                GUI.chosenStarter = dragon.get(2);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(GUI.chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
        if (GUI.chosenStarter.equals("grass")) {
            if (xp >= 150 && xp < 200) {
                GUI.chosenStarter = grass.get(1);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else if (xp >= 200) {
                GUI.chosenStarter = grass.get(2);
                System.out.println("Your pokemon has successfully evolved into " + GUI.chosenStarter + " with XP of " + xp
                        + ". Congratulations!");
            } else {
                System.out.println(GUI.chosenStarter
                        + " does not have enough XP to evolve. Please continue training and try again later.");
            }
        }
    }

}