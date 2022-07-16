import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gameboard {

    private final int width = 160;

    private final int height = 190;

    private final GamePlayer player;

    private List<Rewards> rewardsList = new ArrayList<>();

    private List<Obstacle> obstacleList = new ArrayList<>();

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

    public void addObstacle() {
        obstacleList.add(randomizeObstacle());
    }

    public void addReward() {
        rewardsList.add(randomizeReward());
    }

    public Obstacle randomizeObstacle() {
        List<Obstacle> obstacleList = new ArrayList<>();
        obstacleList.add(new Obstacle(100, 50, this.width));
        obstacleList.add(new Obstacle(50, 100, this.width));
        obstacleList.add(new Obstacle(75, 75, this.width));
        Random rand = new Random();
        int index = rand.nextInt(obstacleList.size());
        return obstacleList.get(index);
    }

    public Rewards randomizeReward() {
        List<Rewards> reward = new ArrayList<>();
        Random rand = new Random();
        reward.add(new PoisonApple(this.width + 48, rand.nextInt(this.height - 10) + 5));
        reward.add(new GoldenApple(this.width + 208, rand.nextInt(this.height - 10) + 5));
        int index = rand.nextInt(reward.size());
        return reward.get(index);
    }

    public void moveObjects() {
        for (Obstacle o : obstacleList) {
            o.moveLeft();
        }
        for (Rewards r : rewardsList) {
            r.moveLeft();
        }
    }
}







