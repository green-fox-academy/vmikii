import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class FunctionToCenter {
    public static void mainDraw(Graphics graphics) {
        // Create a line drawing function that takes 2 parameters:
        // The x and y coordinates of the line's starting point
        // and draws a line from that point to the center of the canvas.
        // Fill the canvas with lines from the edges, every 20 px, to the center.

        int ker = (4 * WIDTH / 20);
        int x = 0;
        int y = 0;

//        for (int i = 0; i < 4; i++) {
//            if (x == 0) {
//                for (int j = 0; j < 16; j++){
//                    F(graphics, x, y);
//                    x+=20;
//                }
//            }
//            if (y == 0){
//                for (int j = 0; j < 16; j++){
//                    F(graphics, x, y);
//                    y += 20;
//                }
//            }
//            if (x == 320) {
//                for (int j = 0; j < 16; j++){
//                    F(graphics, x, y);
//                    x-=20;
//                }
//            }
//            if (y == 320){
//                for (int j = 0; j < 16; j++){
//                    F(graphics, x, y);
//                    y -=20;
//                }
//            }
//        }

        for (int i = 0; i < WIDTH; i+=20){
            for (int j = 0; j < WIDTH; j +=20){
                if (i == 0 || i == 320 && j == 0 || j == 320)
                    F(graphics, i, j);
            }
        }
    }

    public static void F(Graphics graphics, int x , int y){
        graphics.setColor(randomColor());
        graphics.drawLine(x, y, WIDTH/2, WIDTH/2 );
    }

    public static Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g, b);
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
