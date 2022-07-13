import java.awt.*;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.Timer;

public class MainTest extends Point {
    public static void main(String[] args) {

        Point mark = new Point();
        mark.x = 0;
        mark.y = 0;
        System.out.println(mark.toString());
        mark.x += 10;
        System.out.println(mark.toString());
        System.out.println(mark.getX());

        Map<String, Integer> scoreMap = new HashMap<String, Integer>();
        IntegerComparator n = new IntegerComparator(scoreMap);
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(n);
        scoreMap.put("jean", 223);
        scoreMap.put("molly", 56);
        scoreMap.put("vannah", 12);
        sorted.putAll(scoreMap);

        System.out.println(sorted);

        Dimension d = new Dimension(3, 4);
        System.out.println(d.toString());

        Stopwatch stopwatch1 = new Stopwatch();
        stopwatch1.start();
        stopwatch1.stop();

        System.out.println("Elapsed time in seconds: "
                + stopwatch1.getElapsedSeconds());

    }
}
