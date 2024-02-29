package projects.machine_coding.tic_tac_toe.service.undo;

import projects.machine_coding.tic_tac_toe.models.Board;
import projects.machine_coding.tic_tac_toe.models.Game;

public class Undo {
    public static Board undo(Game game){
        int idx = game.getBoardstates().size()-1;
        game.getBoardstates().remove(idx);
        game.getMoves().remove(idx);
        if(game.getBoardstates().size() >= 1){
            return game.getBoardstates().get(idx-1);
        }else{
            return new Board(game.getDimension());
        }

    }
}
