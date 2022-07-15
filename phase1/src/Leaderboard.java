import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Leaderboard {
    private ArrayList<GamePlayer> scoreboard;

    public Leaderboard() {
        scoreboard = new ArrayList<GamePlayer>();
    }

    public void resetLeaderboard() {
        scoreboard.clear();
    }

    public boolean addToScoreBoard(GamePlayer player) {
        if (scoreboard.contains(player)) {
            return false;
        } else {
            scoreboard.add(player);
            return true;
        }
    }

    public void refreshScoreBoard() {
        Collections.sort(scoreboard);
    }
}
