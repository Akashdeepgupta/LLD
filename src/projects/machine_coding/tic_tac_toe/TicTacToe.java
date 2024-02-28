package projects.machine_coding.tic_tac_toe;

import projects.machine_coding.tic_tac_toe.controller.GameController;
import projects.machine_coding.tic_tac_toe.models.*;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategy;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategyName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GameController gameController = new GameController();
        List<Player> players = new ArrayList<>();
        int id = 1;

        System.out.println("Welcome to the TicTacToe Game");
        System.out.println("Enter the dimension");
        int dimension = sc.nextInt();
        System.out.println("Do you want BOT in the game: Y or N");
        String ans = sc.next();
        if(ans.equalsIgnoreCase("Y")){
            Player player = new Bot(id++,'$',BotDifficultyLevel.HARD);
            players.add(player);
        }

        while (id<dimension){
            System.out.println("enter the " + id + "player name");
            String name = sc.next();
            System.out.println("enter the symbol for "+ name);
            char symbol = sc.next().charAt(0);
            Player player = new Player(id++,name,symbol,PlayerType.HUMAN);
            players.add(player);
        }
        Collections.shuffle(players);

        Game game = gameController.createGame(3,players, WinningStrategyName.ORDERONEWINNINGSTRATEGY);
        int playerIndex = -1;
        while (game.getGamestate().equals(GameState.IN_PROGRESS)){
            game.getBoard().displayBoard();
            playerIndex++;
            playerIndex = playerIndex %players.size();
            Move playedMove = gameController.makeMove(game,players.get(playerIndex));
            //store moves and board states.......
            game.getMoves().add(playedMove);
            game.getBoardstates().add(game.getBoard());


            // checking winner
            Player winner = gameController.checkWinner(game,playedMove);
            if(winner != null){
                System.out.println("The Winner is " + players.get(playerIndex).getName());
                game.getBoard().displayBoard();
                break;
            }
            //checking for draw
            if(game.getMoves().size() == game.getBoard().getDimension()*game.getBoard().getDimension()){
                System.out.println("games is draw");
            }

        }

    }
}
