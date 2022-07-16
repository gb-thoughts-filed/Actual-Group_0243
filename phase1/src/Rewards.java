import java.awt.*;
import java.util.List;
public class Rewards {


    private Point reward_location;


    public Rewards(double start_x, double start_y){

        reward_location.x = (int) start_x;
        reward_location.y = (int) start_y;
    }

    public List<Double> get_Rewards_location(){

        List<Double> coordinates = null;
        coordinates.add((double) reward_location.x);
        coordinates.add((double) reward_location.y);
        return coordinates;
    }

}