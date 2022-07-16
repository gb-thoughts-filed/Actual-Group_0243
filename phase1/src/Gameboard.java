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

}
*/