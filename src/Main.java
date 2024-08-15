import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
  Point[] pointArr = new Point[100];

  public static void main(String[] args) throws Exception {
    Main window = new Main();
    window.run();
  }

  class Canvas extends JPanel {
    Grid grid = new Grid();

    public Canvas() {
      setPreferredSize(new Dimension(720, 720));
    }

    @Override
    public void paint(Graphics g) {
      grid.paint(g, getMousePosition());

      for (int i = 0; i < pointArr.length; i++) {
        if (pointArr[i] != null) {
          g.setColor(Color.BLACK);
          g.fillOval(pointArr[i].x - 15, pointArr[i].y - 15, 15, 15);
        }
      }

    }
  }

  private Main() {
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Canvas();
    this.setContentPane(canvas);
    this.pack();
    this.setVisible(true);

    for (int i = 0; i < pointArr.length; i++) {
      pointArr[i] = null;
    }
  }

  public void run() {
    Point prevMousePos = null;

    while (true) {
      Point currMousePos = getMousePosition();

      if (currMousePos != null) {
        if (!currMousePos.equals(prevMousePos)) {
          for (int i = pointArr.length - 1; i > 0; i--) {
            pointArr[i] = pointArr[i - 1];
          }
          pointArr[0] = currMousePos;
          // head++;
          prevMousePos = currMousePos;
        }
      }

      repaint();
    }
  }
}
