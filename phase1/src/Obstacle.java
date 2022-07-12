import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Obstacle {
    private Dimension topObstacle;
    private Dimension bottomObstacle;

    public Obstacle(int topHeight, int bottomHeight, int width){
        topObstacle = new Dimension(width, topHeight);
        bottomObstacle = new Dimension(width, bottomHeight);

    }

    public void setObstacleSize(int topHeight, int bottomHeight, int width){
        topObstacle.setSize(width, topHeight);
        bottomObstacle.setSize(width, bottomHeight);
    }

    public Set<Integer> getTopObstacleSize(){
        Set<Integer> hwTop = new HashSet<Integer>();
        hwTop.add(topObstacle.height);
        hwTop.add(topObstacle.width);
        return hwTop;
    }

    public Set<Integer> getBottomObstacleSize(){
        Set<Integer> hwBottom = new HashSet<Integer>();
        hwBottom.add(bottomObstacle.height);
        hwBottom.add(bottomObstacle.width);
        return hwBottom;
    }

}
