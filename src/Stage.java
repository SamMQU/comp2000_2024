import java.awt.Graphics;
import java.awt.Point;

public class Stage {
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
}
