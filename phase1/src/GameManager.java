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
    public void moveUp(){
        Double xCoord = player.getLocation().get(0);
        Double yCoord = player.getLocation().get(1);
        double newY = yCoord + 1.0;
        player.setLocation(xCoord, newY);
    }

    public void moveDown(){
        Double xCoord = player.getLocation().get(0);
        Double yCoord = player.getLocation().get(1);
        double newY = yCoord - 1.0;
        player.setLocation(xCoord, newY);
    }

    public boolean runGame(){
        // if we don't want to make player an instance variable, call it here
        // GamePlayer newPlayer = new GamePlayer(UserAccount username insert here)
        Gameboard grid = new Gameboard();
        timer.start();
        if(grid.isTouchingBottom() || grid.isTouchingObstacle()){
            return endGame();
        }
        return true;
    }

    public boolean endGame(){
        Leaderboard scoreBoard = new Leaderboard();
        timer.stop();
        score = (int)timer.getElapsedSeconds();
        if (!scoreBoard.updateExistingScore(player.getUsername(), score)){
            scoreBoard.addNewScore(player.getUsername(), score);
        }else{
            scoreBoard.updateExistingScore(player.getUsername(), score);
        }
        return false;
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
