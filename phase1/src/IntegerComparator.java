import java.util.Comparator;
import java.util.Map;

public class IntegerComparator implements Comparator<String> {
    Map<String, Integer> scoreMap;

    public IntegerComparator(Map<String, Integer> base) {
        this.scoreMap = base;
    }

    // Note: this comparator imposes orderings that are inconsistent with
    // equals.
    public int compare(String o1, String o2) {
        if (scoreMap.get(o1) >= scoreMap.get(o2)) {
            return -1;
        } else {
            return 1;
        }
    }
}
