import java.awt.Graphics;
import java.awt.Point;

public class Stage {
<<<<<<< HEAD
    Grid grid;
    Dog dog;
    Cat cat;
    Bird bird;

    Stage(Grid grid) {
        this.grid = grid;
        dog = new Dog(grid.cells[10][10]);
        cat = new Cat(grid.cells[11][11]);
        bird = new Bird(grid.cells[12][12]);
    }

    public void paint(Graphics g, Point mousePos) {
        grid.paint(g, mousePos);
        dog.paint(g);
        cat.paint(g);
        bird.paint(g);
    }
=======
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;

  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    cat.paint(g);
    dog.paint(g);
    bird.paint(g);
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
