import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Drawing extends Canvas {

    // this is here to suppress a warning; you can read about it at
    // http://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html
    static final long serialVersionUID = 1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas drawing = new Drawing();
        drawing.setSize(400, 400);
        frame.add(drawing);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
        g.fillOval(100, 100, 200, 200);
    }
}
