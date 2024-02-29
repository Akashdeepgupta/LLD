package projects.machine_coding.tic_tac_toe.service.replay;

import projects.machine_coding.tic_tac_toe.models.Board;
import projects.machine_coding.tic_tac_toe.models.Game;

public class Replay {
    public static void replayGame(Game game){
        int counter =1;
        for(Board board : game.getBoardstates()){
            System.out.println("After the " + counter++ + " step");
            board.displayBoard();
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
