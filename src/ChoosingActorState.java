import java.util.List;
import java.util.Optional;

public class ChoosingActorState implements State {
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

    @Override
    public void makeMoves() {
        //Nothing
    }

    public String toString()
    {
        return "Choosing Actor";
    }

}
