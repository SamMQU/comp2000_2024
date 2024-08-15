import java.awt.Color;

public class Bird extends ActorMiddleWare {
    static Color color = Color.GREEN;

    Bird(Cell cell) {
        super(cell, color);
    }
}
