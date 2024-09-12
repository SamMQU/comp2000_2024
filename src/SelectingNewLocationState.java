import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SelectingNewLocationState implements State {
    Stage stage;

    SelectingNewLocationState(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void mouseClicked(int x, int y) {
        Optional<Cell> clicked = Optional.empty();
        for (Cell c : stage.cellOverlay) {
            if (c.contains(x, y)) {
                clicked = Optional.of(c);
            }
        }
        stage.cellOverlay = new ArrayList<Cell>();
        if (clicked.isPresent() && stage.actorInAction.isPresent()) {
            stage.actorInAction.get().setLocation(clicked.get());
            stage.actorInAction.get().turns--;
            int humansWithMovesLeft = 0;
            for (Actor a : stage.actors) {
                if (a.isHuman() && a.turns > 0) {
                    humansWithMovesLeft++;
                }
            }
            if (humansWithMovesLeft > 0) {
                stage.currentState = stage.choosingActor;
            } else {
                stage.currentState = stage.botMoving;
            }
        }
    }

    @Override
    public void makeMoves() {
        //Nothing
    }

    public String toString()
    {
        return "Selecting New Location";
    }

}
