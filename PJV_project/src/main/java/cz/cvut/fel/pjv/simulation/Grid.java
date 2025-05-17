package cz.cvut.fel.pjv.simulation;

/**
 * Represents the grid (Petri dish) of cells.
 */
public class Grid {
    private final int rows;
    private final int cols;
    private final Cell[][] cells;

    /**
     * Constructor
     * Initialize whole grid represented by cells
     */
    public Grid(int rows, int cols) {
        this.rows = rows;
        this.cols = cols;
        cells = new Cell[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                cells[i][j] = new Cell();
            }
        }
    }

    public Cell getCell(int row, int col) {
        if(row < 0 || row >= rows || col < 0 || col >= cols)
            return null;
        return cells[row][col];
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }
}
