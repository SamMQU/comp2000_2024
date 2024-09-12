import java.awt.Graphics;
import java.awt.Point;
import java.util.List;
import java.util.Optional;

public class ChoosingActorState implements GameState {
    Stage stage;

    ChoosingActorState(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void mouseClicked(int x, int y) {
        stage.actorInAction = Optional.empty();
        for (Actor a : stage.actors) {
            if (a.loc.contains(x, y) && a.isHuman()) {
                stage.cellOverlay = stage.grid.getRadius(a.loc, a.moves);
                stage.actorInAction = Optional.of(a);
                stage.currentState = stage.selectingNewLocation;
            }
        }
    }

    public String toString()
    {
        return "Choosing Actor";
    }

    @Override
    public void paint(Graphics g, Point mouseLoc) {
        // TODO Auto-generated method stub
    }

}
