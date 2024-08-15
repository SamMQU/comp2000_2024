import java.awt.Color;

<<<<<<< HEAD
public class Bird extends ActorMiddleWare {
    static Color color = Color.GREEN;

    Bird(Cell cell) {
        super(cell, color);
    }
=======
public class Bird extends Actor {
  public Bird(Cell inLoc) {
    loc = inLoc;
    color = Color.GREEN;
  }
>>>>>>> 0985c5edb34441b608e9fd62d9ed0881c67a58c5
}
