import java.awt.*;

public class MainTest extends Point {
    public static void main(String[] args) {
        Point mark = new Point();
        mark.x = 0;
        mark.y = 0;
        System.out.println(mark.toString());
        mark.x += 10;
        System.out.println(mark.toString());
        System.out.println(mark.getX());
    }
}
