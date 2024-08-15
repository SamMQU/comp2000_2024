import java.awt.Color;

<<<<<<< HEAD
public class Cat extends ActorMiddleWare {
    static Color color = Color.BLUE;

    Cat(Cell cell) {
        super(cell, color);
    }
=======
public class Cat extends Actor {
  public Cat(Cell inLoc) {
    loc = inLoc;
    color = Color.BLUE;
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
