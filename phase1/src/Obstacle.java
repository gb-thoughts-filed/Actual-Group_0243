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

    public int getBottomObstacleSize(){
        return bottomObstacle.height;
    }

    public int getLocation() {
        return xCoordinate;
    }

    public void moveLeft() {
        xCoordinate -= 1;
    }
}
