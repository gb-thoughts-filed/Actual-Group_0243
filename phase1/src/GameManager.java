import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class GameManager{
    private Stopwatch timer;

    private List<GoldenApple> total_golden_apples;

    private GamePlayer player;
    int score;
    public GameManager(){
        player = new GamePlayer(UserAccount.getUsername());
        score = 0;
    }

    public void startGame(){
        // if we don't want to make player an instance variable, call it here
        // GamePlayer newPlayer = new GamePlayer(UserAccount username insert here)
        timer.start();
    }

    public void endGame(){
        Leaderboard scoreBoard = new Leaderboard();
        if (!scoreBoard.updateExistingScore(player.getUsername(), score)){
            scoreBoard.addNewScore(player.getUsername(), score);
        }else{
            scoreBoard.updateExistingScore(player.getUsername(), score);
        }
        timer.stop();
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

    public void updateScore(){
        while(timer.isStopWatchRunning()) {
            score = (int)timer.getElapsedSeconds();
        }
    }

    public void generateRewardScore(){
        score = (int)timer.getElapsedSeconds() + total_golden_apples.size() * 10;
    }

    public int getScore(){
        return score;
    }

    public GamePlayer getPlayer() { return player; }




    // public Reward randomizeReward(){
    //  similar to above, just need reward class to be completed

}
