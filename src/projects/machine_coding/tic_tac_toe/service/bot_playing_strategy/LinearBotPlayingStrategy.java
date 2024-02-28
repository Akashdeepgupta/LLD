package projects.machine_coding.tic_tac_toe.service.bot_playing_strategy;

import projects.machine_coding.tic_tac_toe.exception_handling.GameOverException;
import projects.machine_coding.tic_tac_toe.models.*;

import java.util.List;

public class LinearBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board, Player player) {
        List<List<Cell>>matrix = board.getCells();
        int dimension = board.getDimension();
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if(matrix.get(i).get(j).getCellState().equals(CellState.EMPTY)){
                    Cell cell = board.getCells().get(i).get(j);
                    cell.setPlayer(player);
                    cell.setCellState(CellState.FILLED);
                    return new Move(new Cell(i,j),player);
                }
            }
        }
        throw new GameOverException("the game is over as there no empty cells to fill");
    }
}
