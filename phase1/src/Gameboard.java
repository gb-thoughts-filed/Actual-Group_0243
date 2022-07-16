import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gameboard {

    private final int width = 300;

    private final int height = 600;

    private final List<Rewards> rewardsList = new ArrayList<>();

    private final List<Obstacle> obstacleList = new ArrayList<>();

    private final String player_username = UserAccount.getUsername();

    public Gameboard() {
    }

    public boolean isTouchingObstacle(GamePlayer player) {
        for (Obstacle o : obstacleList) {
            int oLocation = o.getLocation();
            int blank = o.getBottomObstacleHeight();
            List<Double> playerPosition = player.getLocation();
            int width = player.getWidth();
            int height = player.getHeight();
            if (playerPosition.get(0) - width <= oLocation && oLocation <= playerPosition.get(0)) {
                return playerPosition.get(1) <= blank && playerPosition.get(1) + height >= blank + 40;
            } else { return false; }
        }
        return false;
    }

    public boolean isTouchingBottom(GamePlayer player) {
        List<Double> playerPosition = player.getLocation();
        return playerPosition.get(1) < 0;
    }

    public boolean isTouchingReward(GamePlayer player) {
        List<Double> playerPosition = player.getLocation();
        Double xPos = playerPosition.get(0);
        Double yPos = playerPosition.get(1);
        for (Rewards r : rewardsList) {
            List<Double> rewardPosition = r.getRewardsLocation();
            if (xPos > rewardPosition.get(0) && xPos - player.getHeight() < rewardPosition.get(0) + r.getWidth()) {
                return yPos + player.getHeight() > rewardPosition.get(1) && yPos < rewardPosition.get(1) + r.getHeight();
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
        obstacleList.add(new Obstacle(160, 80, this.width));
        obstacleList.add(new Obstacle(80, 160, this.width));
        obstacleList.add(new Obstacle(120, 120, this.width));
        Random rand = new Random();
        int index = rand.nextInt(obstacleList.size());
        return obstacleList.get(index);
    }

    public Rewards randomizeReward() {
        List<Rewards> reward = new ArrayList<>();
        Random rand = new Random();
        reward.add(new PoisonApple(this.width + 70, rand.nextInt(this.height - 20) + 5));
        reward.add(new GoldenApple(this.width + 70, rand.nextInt(this.height - 20) + 5));
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







