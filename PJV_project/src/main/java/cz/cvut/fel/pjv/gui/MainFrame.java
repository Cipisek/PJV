package cz.cvut.fel.pjv.gui;

import cz.cvut.fel.pjv.simulation.Bacterium;
import cz.cvut.fel.pjv.simulation.SimulationManager;
import cz.cvut.fel.pjv.simulation.SimulationParameters;

import javax.swing.JFrame;
import java.awt.BorderLayout;

/**
 * Main application window containing simulation panels.
 */
public class MainFrame extends JFrame {
    private GridPanel gridPanel;
    private StatsPanel statsPanel;
    private ControlPanel controlPanel;
    private SimulationManager simulationManager;

    /**
     * Main Frame Containing all panels
     */
    public MainFrame(SimulationManager simulationManager) {
        super("Real-Time Bacterial Survival Simulation");
        this.simulationManager = simulationManager;
        initUI();
    }

    private void initUI() {
        // TODO
    }

    /**
     * Application entry point. Everything will be started from here.
     */
    public static void main(String[] args) {
        // TODO
    }
}
