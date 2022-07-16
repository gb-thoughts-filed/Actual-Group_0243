import java.awt.event.KeyEvent;
import java.util.Map;
import java.awt.event.KeyListener;

public class PlayGame {
    private KeyListener listener;

    private boolean up, down;
    GameManager manager = new GameManager();
    public PlayGame(){}

    public void selectOption(String menuOption){
        char[] option = menuOption.toCharArray();
        if(option[0] == 1) {
            //start the game
        } else if (option[0] == 2) {

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
        manager.runGame();
        while(manager.runGame()) {
            if (up) {
                manager.moveUp();
            } else if (down) {
                manager.moveDown();
            }
        }
    }

    public void move(){
        //https://stackoverflow.com/questions/65374511/how-to-move-object-with-keylistener-in-java source to help make this
        listener = new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DOWN -> down = true;
                    case KeyEvent.VK_UP -> up = true;
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {
                switch (e.getKeyCode()) {
                    case KeyEvent.VK_DOWN -> down = false;
                    case KeyEvent.VK_UP -> up = false;
                }

            }
        };


    }
}
