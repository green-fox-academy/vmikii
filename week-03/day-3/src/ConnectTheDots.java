import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ConnectTheDots {
    public static void mainDraw(Graphics graphics) {
        // Create a function that takes 1 parameter:
        // An array of {x, y} points
        // and connects them with green lines.
        // Connect these to get a box: {{10, 10}, {290,  10}, {290, 290}, {10, 290}}
        // Connect these: {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70},
        // {120, 100}, {85, 130}, {50, 100}}
        int[][] xy = {{50, 100}, {70, 70}, {80, 90}, {90, 90}, {100, 70}, {120, 100}, {85, 130}, {50, 100}};
        int[][] box = {{10, 10}, {290,  10}, {290, 290}, {10, 290}};

        Connect(graphics, xy);
        Connect(graphics, box);




    }
    public static void Connect(Graphics graphics, int[][] xy) {
        int[] x = new int[xy.length];
        int[] y = new int[xy.length];
        for (int i = 0; i < xy.length; i++){
            x[i] = xy[i][0];
            y[i] = xy[i][1];
        }
        graphics.setColor(Color.GREEN);
        for (int i = 0; i < x.length - 1; i++){
            graphics.drawLine(x[i], y[i], x[i + 1], y[i + 1]);
        }
        graphics.drawLine(x[0], y[0], x[x.length - 1], y[x.length - 1]);
    }
    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}