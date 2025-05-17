package cz.cvut.fel.pjv.simulation;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a cell in the Petri dish which holds nutrients and bacteria.
 */
public class Cell {
    private int nutrients;
    private final List<Bacterium> bacteria;

    public Cell() {
        this.nutrients = 0;
        this.bacteria = new ArrayList<>();
    }

    public synchronized void addNutrients(int amount) {
        nutrients += amount;
    }

    public synchronized int consumeNutrients() {
        int consumed = nutrients;
        nutrients = 0;
        return consumed;
    }

    public synchronized void addBacterium(Bacterium b) {
        bacteria.add(b);
    }

    public synchronized void removeBacterium(Bacterium b) {
        bacteria.remove(b);
    }

    public synchronized List<Bacterium> getBacteria() {
        return new ArrayList<>(bacteria);
    }

    public synchronized int getNutrients() {
        return nutrients;
    }
}
