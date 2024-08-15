import java.awt.Color;

<<<<<<< HEAD
public class Dog extends ActorMiddleWare {
    static Color color = Color.YELLOW;

    Dog(Cell cell) {
        super(cell, color);
    }
=======
public class Dog extends Actor {
  public Dog(Cell inLoc) {
    loc = inLoc;
    color = Color.YELLOW;
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
