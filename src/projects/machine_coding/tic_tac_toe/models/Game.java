package projects.machine_coding.tic_tac_toe.models;

import projects.machine_coding.tic_tac_toe.exception_handling.InvalidBotCountException;
import projects.machine_coding.tic_tac_toe.exception_handling.InvalidPlayerSizeException;
import projects.machine_coding.tic_tac_toe.exception_handling.InvalidSymbolException;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategy;
import projects.machine_coding.tic_tac_toe.service.winning_strategy.WinningStrategyFactory;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//builder pattern for Game class
public class Game {
    private Board board;
    private int dimension;
    private List<Player> players;
    private List<Move> moves;
    private List<Board> boardstates;
    private WinningStrategy winningStrategy;
    private Player winner;
    private GameState gamestate;
    private int numberOfSymbols;

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public List<Board> getBoardstates() {
        return boardstates;
    }

    public void setBoardstates(List<Board> boardstates) {
        this.boardstates = boardstates;
    }

    public WinningStrategy getWinningStrategy() {
        return winningStrategy;
    }

    public void setWinningStrategy(WinningStrategy winningStrategy) {
        this.winningStrategy = winningStrategy;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public GameState getGamestate() {
        return gamestate;
    }

    public void setGamestate(GameState gamestate) {
        this.gamestate = gamestate;
    }

    public int getNumberOfSymbols() {
        return numberOfSymbols;
    }

    public void setNumberOfSymbols(int numberOfSymbols) {
        this.numberOfSymbols = numberOfSymbols;
    }

    private Game(Board board, int dimension, List<Player> players, WinningStrategy winningStrategy, Player winner) {
        this.board = board;
        this.dimension = dimension;
        this.players = null;
        this.moves = new ArrayList<>();
        this.boardstates = new ArrayList<>();
        this.winningStrategy = winningStrategy;
        this.winner = winner;
        this.gamestate = GameState.IN_PROGRESS;
        this.numberOfSymbols = players.size();
    }

    public static Builder builder(){
        return new Builder();
    }

    public static class Builder{
        private Board board;
        private int dimension;
        private List<Player> players;
        private WinningStrategy winningStrategy;
        private List<Move> moves;
        private List<Board> boards;
        private Bot bot;
        private Player winner;
        private GameState gamestate;

        //getters
        public Board getBoard() {
            return board;
        }

        public int getDimension() {
            return dimension;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public WinningStrategy getWinningStrategy() {
            return winningStrategy;
        }

        public List<Move> getMoves() {
            return moves;
        }

        public List<Board> getBoards() {
            return boards;
        }

        public Bot getBot() {
            return bot;
        }

        public Player getWinner() {
            return winner;
        }

        public GameState getGamestate() {
            return gamestate;
        }

        //setters
        public Builder setBoard(Board board) {
            this.board = board;
            return this;
        }

        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }
        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setWinningStrategy(WinningStrategy winningStrategy) {
            this.winningStrategy = winningStrategy;
            return this;
        }

        public Builder setMoves(List<Move> moves) {
            this.moves = moves;
            return this;
        }

        public Builder setBoards(List<Board> boards) {
            this.boards = boards;
            return this;
        }

        public Builder setBot(Bot bot) {
            this.bot = bot;
            return this;
        }

        public Builder setWinner(Player winner) {
            this.winner = winner;
            return this;
        }

        public Builder setGamestate(GameState gamestate) {
            this.gamestate = gamestate;
            return this;
        }

        //validations
        private void validateNumberofPlayers(){
            // N players if no bot then -> n-1 players
            // N players if bot present -> n-2 players
            if(players.size() < dimension-2 || players.size() >= dimension){
                throw new InvalidPlayerSizeException("Player size should be n-1 or n-2 as per board size n");
            }
        }

        private void validateNumberOfBots(){
            int botCount = 0;
            for(Player player : players){
                if(player.getPlayerType().equals("BOT")){
                    botCount++;
                }
            }
            if(botCount < 0 || botCount >1){
                throw new InvalidBotCountException("There can be maximum 1 bot int he game");
            }
        }

        private void validPlayerSymbol(){
            //TODO: use lambdas and streams to do this

//            long count = players.stream().distinct().count();
//            if(count != players.size()){
//                throw new InvalidSymbolException("Every Player should have different symbol");
//            }

            HashSet<Character> hs = new HashSet<>();
            for(Player player : players){
                hs.add(player.getSymbol());
            }
            if(hs.size()!= players.size()){
                throw new InvalidSymbolException("Every Player should have different symbol");
            }
        }

        public void validate(){
            validateNumberofPlayers();
            validateNumberOfBots();
            validPlayerSymbol();
        }

        public Game build(){
            validate();
            return new Game(new Board(dimension),dimension,players,winningStrategy,winner);
        }
    }
}
