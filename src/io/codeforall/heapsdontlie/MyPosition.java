package io.codeforall.heapsdontlie;

import org.academiadecodigo.simplegraphics.graphics.Rectangle;

public class MyPosition {

    private int x;

    private int y;

    private MyGrid grid;

    private Rectangle pos;

    private boolean isPainted;

    public MyPosition(int x, int y, MyGrid grid){
        this.x = x;
        this.y = y;
        this.grid=grid;
        pos = new Rectangle(x, y, grid.CELL_SIZE, grid.CELL_SIZE);
        pos.draw();
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x + MyGrid.PADDING;
    }

    public int getY() {
        return y + MyGrid.PADDING;
    }

    public Rectangle getPos() {
        return pos;
    }

    public void setPainted(boolean painted) {
        isPainted = painted;
    }

    public boolean isPainted() {
        return isPainted;
    }
}
