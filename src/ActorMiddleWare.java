import java.awt.Color;
import java.awt.Graphics;

class ActorMiddleWare implements Actor {
    Color color;
    Cell positionCell;

    ActorMiddleWare(Cell positionCell, Color color) {
        this.color = color;
        this.positionCell = positionCell;
    }

    @Override
    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(positionCell.x, positionCell.y, Cell.size, Cell.size);
        g.setColor(Color.BLACK);
        g.drawRect(positionCell.x, positionCell.y, Cell.size, Cell.size);
    }
}
