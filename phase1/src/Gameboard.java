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


    }

    public void addObstacles() {


    }

    /*
        public boolean is_touching_reward(){

            List<Double> player_located = GamePlayer.getLocation();
            List<Integer> reward_located = Rewards.get_Rewards_location();

            if (player_located.get(0) == reward_located.get(0) && player_located.get(1) == reward_located.get(1)){

            }

     */
    public Obstacle randomizeObstacle() {
        List<Obstacle> obstacleList = new ArrayList<>();
        obstacleList.add(new Obstacle(100, 50));
        obstacleList.add(new Obstacle(50, 100));
        obstacleList.add(new Obstacle(75, 75));
        Random rand = new Random();
        int index = rand.nextInt(obstacleList.size());
        return obstacleList.get(index);
    }
}


    // public Reward randomizeReward(){
    //  similar to above, just need reward class to be completed




