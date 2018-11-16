import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Triangles {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int width = WIDTH;
    int a = 8;
    Triangles(x, y, width, a, graphics);
  }

  // Don't touch the code below
  static int WIDTH = 740;
  static int HEIGHT = 740;

  public static void Triangle(int x, int y, int width, Graphics graphics) {
    graphics.drawLine(x, y, x + width, y);
    graphics.drawLine(x + width, y, x + width / 2, y + width);
    graphics.drawLine(x + width / 2, y + width, x, y);
  }
  public static void Triangles(int x, int y, int width, int a, Graphics graphics) {
    if (a == 1) {
      Triangle(x, y, width, graphics);
    }
    else {
      int w = width/2;
      Triangles(x, y, w, a -1, graphics);
      Triangles(x + w, y, w, a -1, graphics);
      Triangles(x + w/2, y + w, w, a -1, graphics);

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
