import java.util.*;

public class Leaderboard {
    private Map<String, Integer> scoreMap;

    public Leaderboard(){
        scoreMap = new HashMap<>();
    }

    public void setScoreMap(String username, int score){
        IntegerComparator n = new IntegerComparator(scoreMap);
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(n);
        this.scoreMap = sorted;

    }

    public Map<String, Integer> getAllTimeScores(){
        IntegerComparator n = new IntegerComparator(scoreMap);
        TreeMap<String, Integer> sorted = new TreeMap<String, Integer>(n);
        return sorted;
    }

    public void addNewScore(String username, int score){
        scoreMap.put(username, score);
        new IntegerComparator(scoreMap);
    }

    public boolean updateExistingScore(String username, int score){
        if (!scoreMap.containsKey(username)){
            return false;
        }
        scoreMap.replace(username, scoreMap.get(username), score);
        return true;
    }



}

