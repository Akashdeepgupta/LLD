package projects.machine_coding.tic_tac_toe.models;

import projects.machine_coding.tic_tac_toe.exception_handling.InvalidCellException;
import projects.machine_coding.tic_tac_toe.exception_handling.InvalidRowColException;

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
        validateMove(board,row,col);
        Cell cell = board.getCells().get(row).get(col);
        cell.setCellState(CellState.FILLED);
        cell.setPlayer(this);
        return new Move(cell,this);
    }

    public boolean validateMove(Board board,int row, int col){
        if(board.cells.get(row).get(col).getCellState().equals(CellState.FILLED)){
            throw new InvalidCellException("The cell is already filled");
        }
        if(row<0 || col > board.dimension){
            throw new InvalidRowColException("This is an invalid cell, choose the correct row and col");
        }
        return true;
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
