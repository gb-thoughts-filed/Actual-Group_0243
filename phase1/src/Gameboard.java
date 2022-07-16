import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Gameboard {

    private int length = 999;

    private int width = 20;

    private List<Rewards> rewards_list;

    private String player_username = UserAccount.getUsername();

    public Gameboard() {

        GamePlayer Player = new GamePlayer(player_username);

    }
}
/*
    public boolean is_touching_reward(){

        List<Double> player_located = GamePlayer.getLocation();
        List<Integer> reward_located = Rewards.get_Rewards_location();

        if (player_located.get(0) == reward_located.get(0) && player_located.get(1) == reward_located.get(1)){

        }
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
*/