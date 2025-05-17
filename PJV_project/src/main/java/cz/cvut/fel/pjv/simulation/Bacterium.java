package cz.cvut.fel.pjv.simulation;

/**
 * Represents a bacterium running in its own thread.
 */
public class Bacterium implements Runnable {
    private int energy;
    private int row;
    private int col;
    private Grid grid;
    private SimulationParameters parameters;

    public Bacterium(SimulationParameters parameters) {
        this.energy = parameters.getInitialBacteriaEnergy();
        this.parameters = parameters;
    }

    public int getEnergy() {
        return energy;
    }

    public void setPosition(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * Terminates the bacterium thread.
     */
    public void terminate() {
        parameters.setSimulationPaused(true);
    }

    /**
     * Moves the bacterium to a new cell.
     */
    private void move() {
        // TODO
        return;
    }

    /**
     * Bacteria run method, implements movement, reproduction and eating of a bacteria
     */
    @Override
    public void run() {
        // TODO
    }

}
