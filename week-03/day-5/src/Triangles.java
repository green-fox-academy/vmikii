import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles{
    public static void mainDraw(Graphics graphics) {
        int db = 5;

//        for (int i = 0; i < (db * 20); i += 20 ){
//            for (int j = 0; j < (db * 20); j += 20){
//                graphics.drawLine(j, 300,WIDTH/2 + 20, j + 10);
//            }
//        }
        int k = 0;
        int a = db;
         for (int i = 320; i > 320 - a * 15; i-= 15){
             for (int j = k; j < db*20 + k; j +=20){
                 Tri(graphics,j, i);
             }
             db--;
             k +=10;
         }

    }

    public static void Tri(Graphics graphics,int x, int y){
        for (int i = 0; i < 3; i++){
            graphics.drawLine(x, y, x + 20, y);
            graphics.drawLine(x + 20, y, x + 10,y - 15);
            graphics.drawLine(x + 10, y - 15, x,y);
        }
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
