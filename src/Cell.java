import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
  // fields
  int x;
  int y;
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    super(inX, inY, size, size);
    x = inX;
    y = inY;
  }

  // methods
  public void paint(Graphics g, Point mousePos) {
    try {
      if (contains(mousePos)) {
        g.setColor(Color.GRAY);
      } else {
        g.setColor(Color.WHITE);
      }

      g.fillRect(x, y, size, size);
      g.setColor(Color.BLACK);
      g.drawRect(x, y, size, size);
    } catch (NullPointerException ex) {
      g.setColor(Color.WHITE);
      g.fillRect(x, y, size, size);
      g.setColor(Color.BLACK);
      g.drawRect(x, y, size, size);
    }
  }

  // public boolean contains(Point p) {
  // if (p != null) {
  // return width < p.x && width + size > p.x && height < p.y && height + size >
  // p.y;
  // } else {
  // return false;
  // }
  // }
}
