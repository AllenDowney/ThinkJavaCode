import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;


public class Moire extends Canvas {

    // this is here to suppress a warning; you can read about it at
    // http://docs.oracle.com/javase/7/docs/api/java/io/Serializable.html
    static final long serialVersionUID = 1;

    public void paint(Graphics g) {
        int i = 90;
        while (i < getWidth()) {
            g.drawOval (0, 0, i, i);
            i = i + 3;
        }
    }

    public static void main(String[] args) {
        // make the frame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add the canvas
        Canvas canvas = new Moire();
        canvas.setSize(400, 400);
        canvas.setBackground(Color.white);
        frame.getContentPane().add(canvas);
        
        // show the frame
        frame.pack();
        frame.setVisible(true);
    }
}
