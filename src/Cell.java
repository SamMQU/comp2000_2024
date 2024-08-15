import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;

public class Cell extends Rectangle {
<<<<<<< HEAD
  // fields
  int x;
  int y;
  static int size = 35;

  // constructors
  public Cell(int inX, int inY) {
    super(inX, inY, size, size);
    x = inX;
    y = inY;
=======
  static int size = 35;

  public Cell(int x, int y) {
    super(x, y, size, size);
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
  }

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

<<<<<<< HEAD
  // public boolean contains(Point p) {
  // if (p != null) {
  // return width < p.x && width + size > p.x && height < p.y && height + size >
  // p.y;
  // } else {
  // return false;
  // }
  // }
=======
  public boolean contains(Point p) {
    if(p != null) {
      return super.contains(p);
    } else {
      return false;
    }
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
