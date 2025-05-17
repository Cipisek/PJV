package cz.cvut.fel.pjv.simulation;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Manages simulation ticks, nutrient spawning and overall simulation state.
 */
public class SimulationManager {
    private Grid grid;
    private boolean running;
    private ExecutorService bacteriumThreadPool;
    private final List<Bacterium> bacteria = new CopyOnWriteArrayList<Bacterium>();
    SimulationParameters parameters;

    public SimulationManager(SimulationParameters parameters) {
        this.parameters = parameters;
        grid = new Grid(parameters.getSimulationGridSize(), parameters.getSimulationGridSize());

        bacteriumThreadPool = Executors.newCachedThreadPool();
        running = false;
    }

    /**
     * Starts the simulation by launching the nutrient spawner and tick runner.
     */
    public void startSimulation() {
        running = true;
        new Thread(new NutrientSpawner()).start();
        new Thread(new TickRunner()).start();
    }

    /**
     * Pauses the simulation.
     */
    public void pauseSimulation() {
        running = false;
    }

    /**
     * Resumes the simulation.
     */
    public void resumeSimulation() {
        if (!running) {
            running = true;
        }
    }

    /**
     * Resets the simulation by clearing grid and bacteria.
     */
    public void resetSimulation() {
        // TODO
    }

    /**
     * Adds a new bacterium to the simulation at the given position.
     */
    public void addBacterium(Bacterium bacterium, int row, int col) {
        // TODO
    }

    public Grid getGrid() {
        return grid;
    }

    public int getBacteriaCount() {
        return bacteria.size();
    }

    public List<Bacterium> getBacteria() {
        return bacteria;
    }

    /**
     * Internal runnable class for spawning nutrients.
     */
    private class NutrientSpawner implements Runnable {
        @Override
        public void run() {
            // TODO
        }
    }

    /**
     * Internal runnable class for processing simulation ticks and handling of bacteria killing
     */
    private class TickRunner implements Runnable {
        @Override
        public void run() {
            // TODO
        }
    }
}
