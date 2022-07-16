import java.util.List;
import java.util.Map;

public class MenuSystem {
    public MenuSystem(){}

    public void selectOption(String menuOption){
        char[] option = menuOption.toCharArray();
        if(option[0] == 1) {
            //start the game
        } else if (option[0] == 2) {
            displayLeaderboard();
        } else if (option[0] == 3) {
            // print a how to play
        }
        // quit
    }

    public Map displayLeaderboard(){
        Leaderboard scoreBoard = new Leaderboard();
        return scoreBoard.getAllTimeScores();
    }

    public void runGame(){
        GameManager manage = new GameManager();
        manage.startGame();
    }
}
