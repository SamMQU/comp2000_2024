import java.util.List;

public class BotMovingState implements State {
    Stage stage;

    BotMovingState(Stage stage) {
        this.stage = stage;
    }

    @Override
    public void mouseClicked(int x, int y) {
        //Nothing
    }

    @Override
    public void makeMoves() {
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

    public String toString()
    {
        return "Bot Moving";
    }

}
