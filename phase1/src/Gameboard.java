import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gameboard {

    private int width = 160;

    private int height = 190;

    private GamePlayer player;

    private List<Rewards> rewardsList;

    private List<Obstacle> obstacleList;

    private String player_username = UserAccount.getUsername();

    public Gameboard() {
        this.player = new GamePlayer(player_username);
    }

    public boolean isTouchingObstacle() {
        for (Obstacle o : obstacleList) {
            int oLocation = o.getLocation();
            int blank = o.getBottomObstacleSize();
            List<Double> playerPosition = player.getLocation();
            if (20 <= oLocation && oLocation <= 40) {
                return playerPosition.get(1) <= blank && playerPosition.get(1) + 10 >= blank + 40;
            } else { return false; }
        }
        return false;
    }

    public boolean isTouchingBottom() {
        List<Double> playerPosition = player.getLocation();
        return playerPosition.get(1) < 0;
    }

    public boolean isTouchingReward() {
        List<Double> playerPosition = player.getLocation();
        Double xPos = playerPosition.get(0);
        Double yPos = playerPosition.get(1);
        for (Rewards r : rewardsList) {
            List<Double> rewardPosition = r.getRewardsLocation();
            if (xPos > rewardPosition.get(0) && xPos - 20 < rewardPosition.get(0) + 5) {
                return yPos + 10 > rewardPosition.get(1) && yPos < rewardPosition.get(1) + 5;
            } else { return false; }
        }
        return false;
    }

    public void addObstacles() {
        obstacleList.add(randomizeObstacle());
    }

    public Obstacle randomizeObstacle() {
        List<Obstacle> obstacleList = new ArrayList<>();
        obstacleList.add(new Obstacle(100, 50, 160));
        obstacleList.add(new Obstacle(50, 100, 160));
        obstacleList.add(new Obstacle(75, 75, 160));
        Random rand = new Random();
        int index = rand.nextInt(obstacleList.size());
        return obstacleList.get(index);
    }
}


    // public Reward randomizeReward(){
    //  similar to above, just need reward class to be completed




