package cz.cvut.fel.pjv.gui;

import cz.cvut.fel.pjv.simulation.Cell;
import cz.cvut.fel.pjv.simulation.Grid;
import cz.cvut.fel.pjv.simulation.SimulationManager;

import javax.swing.JPanel;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Dimension;


/**
 * Panel to visualize the simulation grid.
 */
public class GridPanel extends JPanel {
    private SimulationManager simulationManager;
    private int cellSize = 30;

    public GridPanel(SimulationManager simulationManager) {
        this.simulationManager = simulationManager;
    }

    /**
     * Will paint all cells by its color (RED - Bacteria, GREEN gradient - nutrients, BLACK - empty cell)
     */
    @Override
    protected void paintComponent(Graphics g) {
        // TODO
    }
}
