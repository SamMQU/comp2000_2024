import java.awt.Graphics;
import java.awt.Point;
import java.util.List;

public class BotMovingState implements GameState {
    Stage stage;

    BotMovingState(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void mouseClicked(int x, int y) {
        // Nothing
    }

    public String toString() {
        return "Bot Moving";
    }

    @Override
    public void paint(Graphics g, Point mouseLoc) {
        for (Actor a : stage.actors) {
            if (!a.isHuman()) {
                List<Cell> possibleLocs = stage.getClearRadius(a.loc, a.moves);
                Cell nextLoc = a.strat.chooseNextLoc(possibleLocs);
                a.setLocation(nextLoc);
            }
        }
        stage.currentState = stage.choosingActor;
        for (Actor a : stage.actors) {
            a.turns = 1;
        }
    }

}
