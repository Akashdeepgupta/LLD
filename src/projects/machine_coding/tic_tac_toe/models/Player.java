package projects.machine_coding.tic_tac_toe.models;

import java.util.Scanner;

public class Player {
    private int id;
    private String name;
    private char symbol;
    private  PlayerType playerType;

    public Player() {
    }

    public Player(int id, String name, char symbol, PlayerType playerType) {
        this.id = id;
        this.name = name;
        this.symbol = symbol;
        this.playerType = playerType;
    }

    public Move makeMove(Board board){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row for target cell");
        int row = sc.nextInt();
        System.out.println("Enter the col for target cell");
        int col = sc.nextInt();
        //TODO: validate the row,col->inbound, filled or empty
        Cell cell = board.getCells().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);
        return new Move(cell,this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }
}
