import java.awt.*;
import java.util.List;
public class Rewards {


    private Point rewardLocation;
    private final Dimension dimensions = new Dimension(5, 5);


    public Rewards(double start_x, double start_y){
        rewardLocation.x = (int) start_x;
        rewardLocation.y = (int) start_y;
    }

    public List<Double> getRewardsLocation(){

        List<Double> coordinates = null;
        coordinates.add((double) rewardLocation.x);
        coordinates.add((double) rewardLocation.y);
        return coordinates;
    }



}