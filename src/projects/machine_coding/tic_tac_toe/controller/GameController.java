package projects.machine_coding.tic_tac_toe.controller;

import projects.machine_coding.tic_tac_toe.models.*;
import projects.machine_coding.tic_tac_toe.service.bot_playing_strategy.LinearBotPlayingStrategy;
import projects.machine_coding.tic_tac_toe.service.undo.Undo;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.OrderOneWinningStrategy;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategy;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategyFactory;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategyName;

import java.util.List;

public class GameController {

    public Game createGame(int dimension, List<Player> players, WinningStrategyName winningStrategyName){
        return Game.builder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategy(WinningStrategyFactory.getWinningStrategy(winningStrategyName,dimension))
                .build();
    }

    public void displayBoard(Game game){
        game.getBoard().displayBoard();
    }

    public void getGameState(Game game){
        game.getGamestate();
    }

    public Move makeMove(Game game,Player player){
        return player.makeMove(game.getBoard());
    }



    public Player checkWinner(Game game, Move lastPlayedmove){
        return game.getWinningStrategy().checkWinner(game.getBoard(),lastPlayedmove);
    }

    public Board undo(Game game){
        return Undo.undo(game);
    }

    public void replay(Game game){

    }

}
