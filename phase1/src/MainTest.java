import java.awt.*;
import java.util.*;

public class MainTest extends Point {
    public static void main(String[] args) {

        Point mark = new Point();
        mark.x = 0;
        mark.y = 0;
        System.out.println(mark.toString());
        mark.x += 10;
        System.out.println(mark.toString());
        System.out.println(mark.getX());

        Dimension d = new Dimension(3, 4);
        System.out.println(d.toString());

        HashMap<String, Integer> scoreMap = new HashMap<String, Integer>();
        IntegerComparator n = new IntegerComparator(scoreMap);
        TreeMap<String, Integer> sorted_map = new TreeMap<String, Integer>(n);

        scoreMap.put("A", 995);
        scoreMap.put("B", 609);
        scoreMap.put("C", 6);
        scoreMap.put("D", 66);

        System.out.println("unsorted map: " + scoreMap);
        sorted_map.putAll(scoreMap);
        System.out.println("results: " + sorted_map);

        Stopwatch stopwatch1 = new Stopwatch();
        stopwatch1.start();
        stopwatch1.stop();

        System.out.println("Elapsed time in seconds: "
                + stopwatch1.getElapsedSeconds());
    }
}
