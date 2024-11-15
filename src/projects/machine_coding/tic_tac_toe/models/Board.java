package projects.machine_coding.tic_tac_toe.models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    List<List<Cell>> cells;
    int dimension;

    /*
    BOARD WILL BE LIKE :
    [_,_,_]
    [_,_,_]
    [_,_,_]

    */

    public Board(int dimension) {
        this.dimension = dimension;
        cells = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            cells.add(new ArrayList<>());
            for (int j = 0; j < dimension; j++) {
                cells.get(i).add(new Cell(i,j));
            }
        }
    }

    public Board (Board board){
        this.dimension = board.getDimension();
        this.cells = new ArrayList<>();
        for (int i = 0; i < dimension; i++) {
            this.cells.add(new ArrayList<>());
            for (int j = 0; j < dimension; j++) {
                this.cells.get(i).add(new Cell(board.cells.get(i).get(j)));
            }
        }
    }

    public void displayBoard(){
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                cells.get(i).get(j).displayCell();
            }
            System.out.println();
        }
    }

    public List<List<Cell>> getCells() {
        return cells;
    }

    public void setCells(List<List<Cell>> cells) {
        this.cells = cells;
    }

    public int getDimension() {
        return dimension;
    }

    public void setDimension(int dimension) {
        this.dimension = dimension;
    }
}
