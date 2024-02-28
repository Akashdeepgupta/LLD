package projects.machine_coding.tic_tac_toe.service.bot_playing_strategy;

import projects.machine_coding.tic_tac_toe.models.Board;
import projects.machine_coding.tic_tac_toe.models.Move;
import projects.machine_coding.tic_tac_toe.models.Player;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
