import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public class Rewards {

    private static int x_coord;

    private static int y_coord;

    private Point reward_location = new Point(x_coord, y_coord);


    public Rewards(int start_x, int start_y){
        this.x_coord = start_x;
        this.y_coord = start_y;
    }

}