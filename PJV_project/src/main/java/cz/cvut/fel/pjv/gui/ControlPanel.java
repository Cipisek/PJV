package cz.cvut.fel.pjv.gui;

import cz.cvut.fel.pjv.simulation.SimulationManager;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JSlider;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

/**
 * Panel with controls for simulation parameters.
 */
public class ControlPanel extends JPanel {
    private SimulationManager simulationManager;
    private GridPanel gridPanel;
    private StatsPanel statsPanel;

    /**
     * All Buttons and sliders (TODO)
     */
    private JButton pauseButton;
    private JButton resumeButton;
    private JButton resetButton;
    private JSlider reproductionSlider;
    private JSlider nutrientSlider;

    public ControlPanel(SimulationManager simulationManager, GridPanel gridPanel, StatsPanel statsPanel) {
        this.simulationManager = simulationManager;
        this.gridPanel = gridPanel;
        this.statsPanel = statsPanel;
        initControls();
    }

    /**
     * Initialize all controls (Pause, Resume, Reset and all sliders)
     */
    private void initControls() {
        // TODO
    }
}
