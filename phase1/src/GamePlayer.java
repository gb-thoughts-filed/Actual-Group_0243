import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GamePlayer{
    private String name;
    private Point location;

    private boolean deadEnd;


    public GamePlayer(String name){
        deadEnd = false;
        // this.name = username from account
        location = new Point(40, 85);

    }

    public void setLocation(double xPos, double yPos){
        this.location.setLocation(xPos, yPos);
    }

    public boolean isDead(){
        return this.deadEnd;
    }

    public List<Double> getLocation(){
        List<Double> coordinates = new ArrayList<Double>();
        double xPos = this.location.getX();
        double yPos = this.location.getY();
        coordinates.add(xPos);
        coordinates.add(yPos);

        return coordinates;
    }

    public void moveUp(){
        double newLocation = location.getY() + 2.0;
        location.move(location.x, (int) newLocation);
    }

    public void moveDown(){
        double newLocation = location.getY() - 2.0;
        location.move(location.x, (int) newLocation);
    }

    public String toString(){
        if (deadEnd) {
            return "GAME OVER";
        }
        else {
            return "GAME ON";
        }
    }

}
