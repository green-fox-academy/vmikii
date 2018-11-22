import javax.sound.sampled.Line;
import javax.swing.*;

import java.awt.*;

import static java.awt.Frame.getFrames;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Yellow {
  public static void mainDraw(Graphics graphics) {
    int x = 0;
    int y = 0;
    int width = WIDTH;
//    Squares(graphics, x, y, width, 2);
    squares(graphics, x, y, width, width, 7);
  }

  public static void squares(Graphics graphics, int n) {
  }

  //  public static void Squares(Graphics graphics, int x, int y, int width, int a) {
//    if (a >= 0) {
//      square(graphics, x, y, width);
//      Squares(graphics,x + width/3, y, width/3, a - 1);
//    }
//
//    square(graphics, 0, 0, WIDTH);
//  }
  public static void squares(Graphics graphics, int x, int y, int width, int height, int a) {
    if (a == 1) {
      graphics.drawRect(x, y, width, width);
    }
    else {
      int w = width/3;
      graphics.drawRect(x, y, w, w);
      squares(graphics,x + w, y, w, w,a - 1);
      squares(graphics,x , y + w, w, w,a - 1);
      squares(graphics,x + 2*w, y + w, w/3,w, a - 1);
      squares(graphics,x + w, y + 2*w, w,w/3, a - 1);
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
