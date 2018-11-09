import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {


//        for (int i = 0; i <= WIDTH; i += space){
//            for (int j = 20; j <= WIDTH; j += space){
//                graphics.drawLine(0, i, i + space, 320 );
//                graphics.drawLine(i, 0, 320, i + space );
//            }
//        }
        int x = 40;
        int y = 230;
        int size = 20;
        int oszlopDb = 4;
        //drawHexagon(graphics, 30, 300);
//        for (int i = 0; i < 5; i++){
//            drawHexagon(graphics, x, y);
//            y-= (int)(Math.sqrt(3)*30);
//        }
        int db = 3;
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < oszlopDb; j++){
                drawHexagon(graphics, x, y);
                y-= (int)(Math.sqrt(3)*size);
            }
            db++;
            oszlopDb++;
            x += size + size/2;
            y += db * (int)(Math.sqrt(3)*size) + (int)(Math.sqrt(3)*size)/2;
        }
        y -= db * (int)(Math.sqrt(3)*size);
        for (int i = 0; i < 4; i++){
            for (int j = oszlopDb; j > 0; j--){
                drawHexagon(graphics, x, y);
                y+= (int)(Math.sqrt(3)*size);
            }
            oszlopDb--;
            x += size + size/2;
            y -= oszlopDb * (int)(Math.sqrt(3)*size) + (int)(Math.sqrt(3)*size)/2;
        }

    }
    public static Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g, b);
    }


    public static void drawHexagon(Graphics graphics, int x, int y)
    {
        int size = 40;
        graphics.setColor(randomColor());
        graphics.drawLine(x, y, x + size, y);
        graphics.drawLine(x + size, y, x + (size/2) + size, y - (int)(Math.sqrt(3)*size/2));
        graphics.drawLine(x + size + size/2, y - (int)(Math.sqrt(3)*size/2), x + size, y - (int)((Math.sqrt(3)*size/2) * 2));
        graphics.drawLine(x + size, y - (int)((Math.sqrt(3)*size/2) * 2), x, y - (int)((Math.sqrt(3)*size/2) * 2));
        graphics.drawLine(x, y - (int)((Math.sqrt(3)*size/2) * 2), x - size/2, y - (int)(Math.sqrt(3)*size/2));
        graphics.drawLine(x - size/2, y - (int)(Math.sqrt(3)*size/2), x, y);

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

