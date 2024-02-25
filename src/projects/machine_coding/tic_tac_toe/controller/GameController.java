package projects.machine_coding.tic_tac_toe.controller;

import projects.machine_coding.tic_tac_toe.models.*;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategy;

import java.util.List;

public class GameController {

    public Game createGame(Board board,int dimension, List<Player> players, WinningStrategy winningStrategy){
        return Game.builder().setDimension(dimension)
                .setPlayers(players)
                .setWinningStrategy(winningStrategy)
                .setBoard(board)
                .build();
    }

    public void displayBoard(Game game){

    }

    public void getGameState(Game game){

    }

    public Board makeMove(){
//        return new Board();
        return null;
    }
    public Player getWinner(Game game){
        return null;
    }

    public Move executeMove(Game game,Player player){
        return null;
    }

    public Player checkWinner(Game game){
        return null;
    }

    public Board undo(){
        return null;
    }

}
