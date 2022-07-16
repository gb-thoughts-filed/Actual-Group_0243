public class Score {

    private int score;

    public void getScoreFromGame(GameManager game1){
        score = game1.getScore();
    }

    public int getScore(){
        return score;
    }

    }
