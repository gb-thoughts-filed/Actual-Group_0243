import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Obstacle {
    private Dimension topObstacle;
    private Dimension bottomObstacle;

    private int xCoordinate;

    public Obstacle(int topHeight, int bottomHeight, int x) {
        topObstacle = new Dimension(20, topHeight);
        bottomObstacle = new Dimension(20, bottomHeight);
        xCoordinate = x;
    }

    public void setObstacleSize(int topHeight, int bottomHeight, int width){
        topObstacle.setSize(width, topHeight);
        bottomObstacle.setSize(width, bottomHeight);
    }

    public int getTopObstacleSize(){
        return topObstacle.height;
    }

    public Set<Integer> getBottomObstacleSize(){
        Set<Integer> hwBottom = new HashSet<Integer>();
        hwBottom.add(bottomObstacle.height);
        hwBottom.add(bottomObstacle.width);
        return hwBottom;
    }

    public

}
