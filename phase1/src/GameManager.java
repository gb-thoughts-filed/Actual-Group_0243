import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManager{
    private Stopwatch timer;

    // private Gameplayer player;
    int score;
    public GameManager(){
        // player = new GamePlayer(UserAccount username here)
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

    public Obstacle randomizeObstacle(){
        List<Obstacle> obstacleList = new ArrayList<>();
        obstacleList.add(new Obstacle(100, 50, 20));
        obstacleList.add(new Obstacle(50, 100, 20));
        obstacleList.add(new Obstacle(75, 75, 20));
        Random rand = new Random();
        int index = rand.nextInt(obstacleList.size());
        return obstacleList.get(index);
    }

    // public Reward randomizeReward(){
    //  similar to above, just need reward class to be completed

}
