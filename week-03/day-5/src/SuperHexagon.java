import javax.swing.*;

import java.awt.*;
import java.util.Random;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class SuperHexagon {
    public static void mainDraw(Graphics graphics) {
        int x = 40;
        int y = 270;
        int sideLength = 15;
        int height = (int)(Math.sqrt(3)*sideLength);
        int numberOfHex = 3;
        int a = numberOfHex - 1;
        int xshift = sideLength + sideLength/2;
        int yshift = height + height/2;

        for (int i = 0; i < a; i++){
            for (int j = 0; j < numberOfHex; j++){                           //draws the given number of hexagon column
                drawHexagon(graphics, height, sideLength, x, y);
                y-= height;
            }
            numberOfHex++;                                                   //after drawing a column it increases the number of hexagons in the next column
            x += sideLength + sideLength/2;                                  //shifting x coords of next column
            y += (numberOfHex - 1) * height + height/2;                      //shifting y coords of next column
        }
        y -= (numberOfHex - 1) * height;                             //setting new source point for the other side of th structure
        a++;
        for (int i = 0; i < a; i++){
            for (int j = numberOfHex; j > 0; j--){
                drawHexagon(graphics, height, sideLength, x, y);
                y+= height;
            }
            numberOfHex--;
            x += sideLength + sideLength/2;                                 //shift x
            y -= numberOfHex * height + height/2;                            //shift y
        }
    }
    public static Color randomColor() {
        Random random = new Random();
        int r = random.nextInt(255);
        int g = random.nextInt(255);
        int b = random.nextInt(255);
        return new Color(r,g, b);
    }

    public static void drawCircle(Graphics graphics, int size, int x, int y){
        graphics.drawOval(x - (int)(Math.sqrt(3)*size)/5, y - (int)(Math.sqrt(3)*size), (int)(Math.sqrt(3)*size), (int)(Math.sqrt(3)*size));
    }

    public static void drawHexagon(Graphics graphics, int height, int size, int x, int y)
    {
        graphics.drawLine(x, y, x + size, y);                                                            //6 sides -> 6 drawLine()
        graphics.drawLine(x + size, y, x + (size/2) + size, y - height/2);
        graphics.drawLine(x + size + size/2, y - height/2, x + size, y - height/2 * 2);
        graphics.drawLine(x + size, y - height, x, y - height);
        graphics.drawLine(x, y - height, x - size/2, y - height/2);
        graphics.drawLine(x - size/2, y - height/2, x, y);

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

