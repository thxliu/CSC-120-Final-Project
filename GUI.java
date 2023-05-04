import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends Frame implements ActionListener {

    JLabel messageLabel;
    JButton selectButton;
    JButton rightArrow;
    JLabel pokemonLabel;
    int index;
    ImageIcon selectedPokemon;
    ArrayList<String> pokemonImages;
    public static String chosenType;

    public GUI() {
        // Make sure we have nice window decorations.
        JFrame.setDefaultLookAndFeelDecorated(true);
        // Create and set up the windows.
        JFrame frame = new JFrame("Choose your Pokemon!");
        try {
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } catch (Exception e) {} 
        // Add the viewer: 
        frame.getContentPane().setLayout(new FlowLayout());

        pokemonLabel = new JLabel();
        add(pokemonLabel, BorderLayout.CENTER);

        messageLabel = new JLabel();
        messageLabel.setText("Welcome! Click the arrow button to choose your starter Pokemon and see their evolution.");
        add(messageLabel, BorderLayout.SOUTH);

        selectButton = new JButton("Press here to choose this starter Pokemon.");
        selectButton.addActionListener(this);
        add(selectButton, BorderLayout.NORTH);

        rightArrow = new JButton("-->");
        rightArrow.addActionListener(this);
        add(rightArrow, BorderLayout.EAST);

        pokemonImages = new ArrayList<String>();
        pokemonImages.add("DRAGON.png");
        pokemonImages.add("FAIRY.jpg");
        pokemonImages.add("FIRE.png");
        pokemonImages.add("GRASS.png");
        pokemonImages.add("NORMAL.jpg");
        pokemonImages.add("WATER.png");

        // Display the window:
        DisplayImage();
        setSize(550, 550);
        setVisible(true);
    }
    
    public void DisplayImage() {
        ImageIcon smallerPokemonImage = new ImageIcon(new ImageIcon(this.pokemonImages.get(index)).getImage().getScaledInstance(400,400, java.awt.Image.SCALE_SMOOTH));
        pokemonLabel.setIcon(smallerPokemonImage);
   
    }
    public void actionPerformed(ActionEvent evt) {
        if (evt.getActionCommand().equals("-->")) {
            index++;
            if (index == pokemonImages.size()) {
                index = 0;
            }
        } else if (evt.getActionCommand().equals("Press here to choose this starter Pokemon.")) {
            selectedPokemon = new ImageIcon(pokemonImages.get(index));
            String starter = pokemonImages.get(index);
            if (starter.equals("DRAGON.png")) {
                chosenType = "dragon";
            } else if (starter.equals("FAIRY.jpg")) {
                chosenType = "fairy";
            } else if (starter.equals("FIRE.png")) {
                chosenType = "fire";
            }  else if (starter.equals("GRASS.png")) {
                chosenType = "grass";
            } else if (starter.equals("NORMAL.jpg")) {
                chosenType = "normal";
            } else {
                chosenType = "water";
            }            
        }
        DisplayImage();

    }
    public static void main(String[] args) {
        new GUI();
    }
}