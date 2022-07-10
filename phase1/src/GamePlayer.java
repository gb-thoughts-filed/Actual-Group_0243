import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class GamePlayer{
    private int totalScore;
    private String name;
    private final Point location;

    private boolean deadEnd;

    public GamePlayer(String name){
        this.totalScore = 0;
        deadEnd = false;
        // this.name = username from account
        location = new Point(0, 0);

    }

    public void setTotalScore(int score){
        this.totalScore = score;
    }

    public int getTotoalScore(){
        return this.totalScore;
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
        return "GAME OVER";
    }


}
