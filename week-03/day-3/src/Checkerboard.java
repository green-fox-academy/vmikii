import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Checkerboard {
    public static void mainDraw(Graphics graphics) {
        // Fill the canvas with a checkerboard pattern.
        int div = 8;
        int width = WIDTH/div;
        int x = 0;
        int y = 0;
        for (int i = 0; i < div; i++){
            for (int j = 0; j < div; j++){
                if (i % 2 == 0 ){
                    if (j % 2 == 0){
                        graphics.setColor(Color.BLACK);
                        graphics.drawRect(x, y, width, width);
                        graphics.fillRect(x, y, width, width);
                    }
                    else{
                        graphics.setColor(Color.WHITE);
                        graphics.drawRect(x, y, width, width);
                        graphics.fillRect(x, y, width, width);
                    }
                }
                else {
                    if (j % 2 != 0){
                        graphics.setColor(Color.BLACK);
                        graphics.drawRect(x, y, width, width);
                        graphics.fillRect(x, y, width, width);
                    }
                    else{
                        graphics.setColor(Color.WHITE);
                        graphics.drawRect(x, y, width, width);
                        graphics.fillRect(x, y, width, width);
                    }
                }
                x += width;
            }
            x = 0;
            y += width;
        }


    }

    public static void drawRect(Graphics graphics, int x, int y, int width){
        graphics.fillRect(x, y , width, width);
        graphics.drawRect(x, y, width, width);
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
