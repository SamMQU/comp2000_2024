import java.util.Iterator;

public class GridIterator implements Iterator {
    Cell[][] grid;
    int currentRow;
    int currentCol;

    GridIterator(Cell[][] grid) {
        this.grid = grid;
    }

    @Override
    public boolean hasNext() {
        if (currentRow < grid[0].length || currentCol < grid.length) {
            return true;
        }
        return false;
    }

    @Override
    public Object next() {
        if (currentRow >= grid[0].length)
            currentRow = 0;
        if (currentCol >= grid.length)
            currentCol = 0;

        return grid[currentRow][currentCol];
    }
}
