package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

import java.awt.*;

public class MyGrid {

    public static final int PADDING = 10;

    public static final int CELL_SIZE = 30;
    private static int colNum;
    private static int rowNum;

    private MyPosition[][] grid;
    private MyPosition pos;

    public MyGrid(int cols, int rows){
        this.colNum = cols;
        this.rowNum = rows;

        init();
    }

    public void init(){

        grid = new MyPosition[colNum][];

        for (int i = 0; i < grid.length; i++){
            grid[i] = new MyPosition[rowNum];
        }

        for (int i = 0; i< colNum; i++){
            for (int j = 0; j< rowNum; j++){

                grid[i][j] = new MyPosition(PADDING+i*CELL_SIZE, PADDING+j*CELL_SIZE, this);

            }
        }

    }

    public int rowToY(int row) { return PADDING+CELL_SIZE*row;}
    public int columnToX(int col) {return PADDING+CELL_SIZE*col;}

    public MyPosition[][] getGrid() {
        return grid;
    }

    public static int getColNum() {
        return colNum;
    }

    public static int getRowNum() {
        return rowNum;
    }
}
