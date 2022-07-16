import java.awt.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Obstacle {
    private Dimension topObstacle;
    private Dimension bottomObstacle;

    private int xCoordinate;

    public Obstacle(int topHeight, int bottomHeight, int x) {
        topObstacle = new Dimension(30, topHeight);
        bottomObstacle = new Dimension(30, bottomHeight);
        xCoordinate = x;
    }

    public void setObstacleSize(int topHeight, int bottomHeight, int width){
        topObstacle.setSize(width, topHeight);
        bottomObstacle.setSize(width, bottomHeight);
    }

    public int getTopObstacleHeight(){
        return topObstacle.height;
    }

    public int getBottomObstacleHeight(){
        return bottomObstacle.height;
    }

    public int getWidth() { return bottomObstacle.width; }

    public int getLocation() {
        return xCoordinate;
    }

    public void moveLeft() {
        xCoordinate -= 1;
    }
}
