import java.awt.Color;

public class Cat extends ActorMiddleWare {
    static Color color = Color.BLUE;

    Cat(Cell cell) {
        super(cell, color);
    }
}
