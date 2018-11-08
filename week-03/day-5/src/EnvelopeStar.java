import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class EnvelopeStar{
    public static void mainDraw(Graphics graphics) {
        int db = 32;
        int space = WIDTH/db;
        for (int i = 0; i <= WIDTH/2 -space; i += space){
            for (int j = 0; j < WIDTH/2; j += space){
                graphics.drawLine(j ,WIDTH/2,WIDTH/2, WIDTH/2 - (j + space));
                graphics.drawLine(WIDTH/2 + j + space,WIDTH/2,WIDTH/2, j);
                graphics.drawLine(WIDTH/2 ,WIDTH/2 + j + space,WIDTH - j, WIDTH/2);
                graphics.drawLine(j ,WIDTH/2,WIDTH/2, WIDTH/2 + (j + space));

            }
        }


    }
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
