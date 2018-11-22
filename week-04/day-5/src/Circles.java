import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Circles {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int a = 5;
    int width = WIDTH;
    Circles(x, y, width, 1, graphics);
  }
  // Don't touch the code below
  static int WIDTH = 740;
  static int HEIGHT = 740;

  public static void Circles (int x, int y, int width, int a, Graphics graphics) {
    if (a == 1) {
      graphics.drawOval(x, y, width, width);
    }
    else {
      int w = width/2;
      Circles(x + w, y, w, a - 1, graphics);
      Circles(x + 2*w/3, y, w/2, a - 1, graphics);
      Circles(x + w/2, y, w/2, a - 1, graphics);

    }
  }
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

