package projects.machine_coding.tic_tac_toe.service.winning_strategy;

import projects.machine_coding.tic_tac_toe.models.Board;
import projects.machine_coding.tic_tac_toe.models.Move;
import projects.machine_coding.tic_tac_toe.models.Player;

public interface WinningStrategy {
    Player checkWinner(Board board, Move lastMove);
}
