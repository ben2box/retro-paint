package io.codeforall.heapsdontlie;

public class Main {

    public static void main(String[] args) {

        MyGrid grid = new MyGrid(30,20);
        MyCursor cursor = new MyCursor(0, 0, grid);
        Controls c = new Controls(cursor);


    }
}
