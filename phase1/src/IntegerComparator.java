import java.util.Comparator;
import java.util.Map;

public class IntegerComparator implements Comparator<String> {
    private Map<String, Integer> scoreMap;

    public IntegerComparator(Map<String, Integer> scoreMap){
        this.scoreMap = scoreMap;
    }


    @Override
    public int compare(String o1, String o2) {
        if (scoreMap.get(o1) >= scoreMap.get(o2)){
            return -1;
        }
        return 1;
    }
}
