import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class StarryNight {
    public static void mainDraw(Graphics graphics) {
        // Draw the night sky:
        //  - The background should be black
        //  - The stars can be small squares
        //  - The stars should have random positions on the canvas
        //  - The stars should have random color (some shade of grey)
        int[] xPoints = {0, WIDTH, WIDTH, 0 };
        int[] yPoints = {0, 0, WIDTH, WIDTH};
        graphics.drawPolygon(xPoints, yPoints, 4);
        graphics.setColor(Color.BLACK);
        graphics.fillPolygon(xPoints, yPoints, 4);
        for (int i = 0; i < 50; i++){
            drawSquare(graphics);
        }



    }

    public static void drawSquare(Graphics graphics){
        Random rnd = new Random();
        graphics.setColor(randomColor());
        int x = rnd.nextInt(310);
        int y = rnd.nextInt(310);
        graphics.fillRect(x, y, 10, 10);
        graphics.drawRect(x, y,10,10);
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
