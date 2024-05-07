package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardEvent;
import org.academiadecodigo.simplegraphics.keyboard.KeyboardHandler;

public class MyCursor{

    int x;
    int y;

    private Rectangle cursor;


    private MyGrid grid;

    public MyCursor(int x, int y, MyGrid grid) {
        this.x = x;
        this.y = y;
        this.grid=grid;
        cursor = new Rectangle(x+ MyGrid.PADDING, y + MyGrid.PADDING, MyGrid.CELL_SIZE, MyGrid.CELL_SIZE );

        cursor.setColor(Color.ORANGE);
        cursor.fill();
    }

    public void moveRight(){
        if (cursor.getX() >= grid.columnToX(MyGrid.getColNum()-1)){
            return;
        }
        cursor.translate(MyGrid.CELL_SIZE, 0);
        x++;

    }

    public void moveLeft(){
        if (cursor.getX() <= MyGrid.PADDING){
            return;
        }
        cursor.translate(-MyGrid.CELL_SIZE,0 );
        x--;
    }

    public void moveUp(){
        if (cursor.getY() <= MyGrid.PADDING){
            return;
        }
        cursor.translate(0, -MyGrid.CELL_SIZE);
        y--;
    }

    public void moveDown(){
        if (cursor.getY() >= grid.rowToY(MyGrid.getRowNum()-1)){
            return;
        }
        cursor.translate(0, MyGrid.CELL_SIZE);
        y++;
    }

    public void paint(){
        grid.getGrid()[x][y].getPos().setColor(Color.BLACK);
        grid.getGrid()[x][y].getPos().fill();
        grid.getGrid()[x][y].setPainted(true);

    }

    public void clear() {
        grid.getGrid()[x][y].getPos().draw();
        grid.getGrid()[x][y].setPainted(false);
    }

    public int getY() {
        return y*MyGrid.CELL_SIZE+MyGrid.PADDING;
    }

    public int getX() {
        return x*MyGrid.CELL_SIZE+MyGrid.PADDING;
    }
}
