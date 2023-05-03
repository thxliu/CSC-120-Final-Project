import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.ArrayList;

public class GUI extends Frame implements ActionListener {

    JLabel l;
    JButton b;
    JButton rightArrow;
    JLabel pokemonImage;


    public GUI() {

        ArrayList<String> pokemonImages = new ArrayList<>(null);
        pokemonImages.add("DRAGON.png");
        pokemonImages.add("FAIRY.png");
        pokemonImages.add("FIRE.png");
        pokemonImages.add("GRASS.png");
        pokemonImages.add("NORMAL.png");
        pokemonImages.add("WATER.png");


        l = new JLabel();
        l.setBounds(100, 600, 500, 20);
        l.setText("Welcome! Click the arrow button to choose your starter Pokemon and see their evolution.");

        b = new JButton("Press here to choose this starter Pokemon.");
        b.setBounds(100, 650, 400, 30);
        b.addActionListener(this);

        rightArrow = new JButton("-->");
        rightArrow.setBounds(500, 450, 50, 30);
        rightArrow.addActionListener(this);

        add(l);
        add(b);
        add(rightArrow);


        setSize(600, 300);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        try {
           ;
            String ip = java.net.InetAddress.getByName(host).getHostAddress();
            l.setText("IP address of " + host + " is: " + ip); String host = tf.getText()
        } catch (Exception e) {
            l.setText(e.getMessage());
        }
    }
    public static void main(String[] args) {
        new GUI();
    }
}