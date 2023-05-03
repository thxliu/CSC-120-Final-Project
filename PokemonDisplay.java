import java.awt.*;
import javax.swing.JFrame;
import java.awt.Canvas;

public class PokemonDisplay extends Canvas {

    public void paint(Graphics g) {
        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("FairyEvolutionResized.jpg");
        g.drawImage(i,0,0,this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Pokemon Type Display");
        Canvas canvas = new PokemonDisplay();
        canvas.setSize(400,400);
        frame.add(canvas);
        frame.setVisible(true);
    }

}