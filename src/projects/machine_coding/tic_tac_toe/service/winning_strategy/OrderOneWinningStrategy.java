package projects.machine_coding.tic_tac_toe.service.winning_strategy;

import projects.machine_coding.tic_tac_toe.models.Board;
import projects.machine_coding.tic_tac_toe.models.Cell;
import projects.machine_coding.tic_tac_toe.models.Move;
import projects.machine_coding.tic_tac_toe.models.Player;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class OrderOneWinningStrategy implements WinningStrategy{

    // n dimension board will require :
    // n hashmap for rows
    // n hashmaps for columns
    // 1 hashmap for left Diagonal
    // 1 hashmap for right diagonal
    // 1 hashmap for corner

    int dimension;
    List<HashMap<Character,Integer>> hashMapRowList = new ArrayList<>();
    List<HashMap<Character,Integer>> hashMapColList = new ArrayList<>();
    HashMap<Character,Integer> leftDiagonal = new HashMap<>();
    HashMap<Character,Integer> rightDiagonal = new HashMap<>();
    HashMap<Character,Integer> cornerCells = new HashMap<>();

    public OrderOneWinningStrategy(int dimension) {
        this.dimension = dimension;
        this.hashMapRowList = new ArrayList<>();
        this.hashMapColList = new ArrayList<>();
        this.leftDiagonal = new HashMap<>();
        this.rightDiagonal = new HashMap<>();
        this.cornerCells = new HashMap<>();
        for (int i = 0; i < dimension; i++) {
            hashMapRowList.add(new HashMap<>());
        }
        for (int i = 0; i < dimension; i++) {
            hashMapColList.add(new HashMap<>());
        }
    }

    @Override
    public Player checkWinner(Board board, Move lastMove) {
        List<List<Cell>> matrix = board.getCells();
        char symbol = lastMove.getPlayer().getSymbol();
        int row = lastMove.getCell().getRow();
        int col = lastMove.getCell().getCol();
        Player player = lastMove.getPlayer();

        if(checkCorner(symbol)){
            return player;
        }
        if( row == col && checkLeftDiagonal(symbol)){
            return player;
        }
        if (row+col == dimension-1 && checkRightDiagonal(symbol)){
            return player;
        }
        if(checkRowAndUpdate(row,symbol)){
            return player;
        }
        if(checkColAndUpdate(col,symbol)){
            return player;
        }
        return null;
    }

    public boolean checkCorner(char symbol){
        if(!cornerCells.isEmpty() && cornerCells.get(symbol) == 4){
            return true;
        }
        return false;
    }

    public boolean checkRowAndUpdate(int row, char symbol){
        HashMap<Character,Integer> hashMapRow = hashMapRowList.get(row);
        return check(hashMapRow,symbol);
    }

    public boolean checkColAndUpdate(int col, char symbol){
        HashMap<Character,Integer> hashMapCol = hashMapColList.get(col);
        return check(hashMapCol,symbol);
    }

    public boolean checkLeftDiagonal(char symbol){
        return check(leftDiagonal,symbol);
    }

    public boolean checkRightDiagonal(char symbol){
        return check(rightDiagonal,symbol);
    }

    public boolean check(HashMap<Character,Integer> hashMap, char symbol){
        if(hashMap.containsKey(symbol)){
            hashMap.put(symbol,hashMap.get(symbol)+1);
            return hashMap.get(symbol) == dimension;
        }
        else {
            hashMap.put(symbol,1);
        }
        return false;
    }
}
