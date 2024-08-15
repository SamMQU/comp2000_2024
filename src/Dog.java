import java.awt.Color;

public class Dog extends ActorMiddleWare {
    static Color color = Color.YELLOW;

    Dog(Cell cell) {
        super(cell, color);
    }
}
