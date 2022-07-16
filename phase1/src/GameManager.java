import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManager{
    private Stopwatch timer;

    private List<GoldenApple> total_golden_apples;

    // private Gameplayer player;
    int score;
    public GameManager(){
        // player = new GamePlayer(UserAccount username here)
        score = 0;
    }

    public void startGame(){
        // if we don't want to make player an instance variable, call it here
        // GamePlayer newPlayer = new GamePlayer(UserAccount username insert here)
        timer.start();
    }

    public void endGame(){
        // Leaderboard scoreBoard = new Leaderboard();
        // scoreboard.put(Player.name, score)
        timer.stop();
        timer.getElapsedSeconds();
    }

    public boolean goThroughObstacle(){
        // from Gameboard, if the player entity successfully went through the obstacle hole,
        // increase the score by 1 and return true, all else false and call end game method
        score++;
        return true;
    }
}
