package cz.cvut.fel.pjv.simulation;

/**
 * Stores all necessary variables to run the simulation
 * Some variables might have been forgotten to add, will add later
 */
public class SimulationParameters {
    boolean simulationPaused;                           // simulation status

    // Statistics
    public int bacteriaCount;                           // Bacteria count (cells)
    public int nutrientsCount;                          // Nutrient count (cells)
    public int averageBacteriaEnergy;                   // Average energy of a bacteria
    public int averageNutrientsCount;                   // Average count of nutrients in one cell


    // adjustable
    public int simulationTickInterval;                  // How many ms before a thread can do something

    public int simulationGridSize;                      // Grid Size

    public int nutrientsSpawnInterval;                  // How many ticks before a nutrient will spawn
    public int bacteriaMoveEnergyCost;                  // How much energy does bacteria use to move
    public int bacteriaIdleEnergyCost;                  // How much energy does bacteria use when staying idle
    public int bacteriaEnergyDeathInterval;             // How many ticks before a bacteria dies, if no nutrients are consumed
    public int bacteriaNutrientsNeededForReproduction;  // How much energy is needed for reproduction
    public int spawnedBacteriaNutrients;                // How much energy do newly spawned or reproduced bacteria have

    public int nutrientsAfterBacteriaDeath;             // How many nutrients will be placed on a cell if a bacteria dies there
    public int nutrientsPerSpawn;                       // How much does one spawned nutrient has
    public int numberOfReproducedBacteria;              // Number of children a bacteria reproduces into
    public int initialBacteriaEnergy;                   // Number of how many energy does bacteria starts with
    public int starvationBacteriaTicks;                 // Ticks until bacteria dies if no nutrients are eaten
    // adjustable end

    public SimulationParameters( int simulationTickInterval, int simulationGridSize, int nutrientsSpawnInterval, int bacteriaMoveEnergyCost, int bacteriaIdleEnergyCost, int bacteriaEnergyDeathInterval, int bacteriaNutrientsNeededForReproduction, int spawnedBacteriaNutrients, int bacteriaCount, int nutrientsCount, int averageBacteriaEnergy, int averageNutrientsCount, int nutrientsPerSpawn, int numberOfReproducedBacteria, int initialBacteriaEnergy, int starvationBacteriaTicks, int nutrientsAfterDeath) {
        this.simulationPaused = false;
        this.simulationTickInterval = simulationTickInterval;
        this.simulationGridSize = simulationGridSize;
        this.nutrientsSpawnInterval = nutrientsSpawnInterval;
        this.bacteriaMoveEnergyCost = bacteriaMoveEnergyCost;
        this.bacteriaIdleEnergyCost = bacteriaIdleEnergyCost;
        this.bacteriaEnergyDeathInterval = bacteriaEnergyDeathInterval;
        this.bacteriaNutrientsNeededForReproduction = bacteriaNutrientsNeededForReproduction;
        this.spawnedBacteriaNutrients = spawnedBacteriaNutrients;
        this.bacteriaCount = bacteriaCount;
        this.nutrientsPerSpawn = nutrientsPerSpawn;
        this.numberOfReproducedBacteria = numberOfReproducedBacteria;
        this.initialBacteriaEnergy = initialBacteriaEnergy;
        this.starvationBacteriaTicks = starvationBacteriaTicks;
        this.nutrientsAfterBacteriaDeath = nutrientsAfterDeath;
    }

    public int getNutrientsAfterBacteriaDeath() {
        return nutrientsAfterBacteriaDeath;
    }

    public void setNutrientsAfterBacteriaDeath(int nutrientsAfterBacteriaDeath) {
        this.nutrientsAfterBacteriaDeath = nutrientsAfterBacteriaDeath;
    }

    public boolean isSimulationPaused() {
        return simulationPaused;
    }

    public void setSimulationPaused(boolean simulationPaused) {
        this.simulationPaused = simulationPaused;
    }

    public int getSimulationTickInterval() {
        return simulationTickInterval;
    }

    public void setSimulationTickInterval(int simulationTickInterval) {
        this.simulationTickInterval = simulationTickInterval;
    }

    public int getSimulationGridSize() {
        return simulationGridSize;
    }

    public void setSimulationGridSize(int simulationGridSize) {
        this.simulationGridSize = simulationGridSize;
    }

    public int getNutrientsSpawnInterval() {
        return nutrientsSpawnInterval;
    }

    public void setNutrientsSpawnInterval(int nutrientsSpawnInterval) {
        this.nutrientsSpawnInterval = nutrientsSpawnInterval;
    }

    public int getBacteriaMoveEnergyCost() {
        return bacteriaMoveEnergyCost;
    }

    public void setBacteriaMoveEnergyCost(int bacteriaMoveEnergyCost) {
        this.bacteriaMoveEnergyCost = bacteriaMoveEnergyCost;
    }

    public int getBacteriaIdleEnergyCost() {
        return bacteriaIdleEnergyCost;
    }

    public void setBacteriaIdleEnergyCost(int bacteriaIdleEnergyCost) {
        this.bacteriaIdleEnergyCost = bacteriaIdleEnergyCost;
    }

    public int getBacteriaEnergyDeathInterval() {
        return bacteriaEnergyDeathInterval;
    }

    public void setBacteriaEnergyDeathInterval(int bacteriaEnergyDeathInterval) {
        this.bacteriaEnergyDeathInterval = bacteriaEnergyDeathInterval;
    }

    public int getBacteriaNutrientsNeededForReproduction() {
        return bacteriaNutrientsNeededForReproduction;
    }

    public void setBacteriaNutrientsNeededForReproduction(int bacteriaNutrientsNeededForReproduction) {
        this.bacteriaNutrientsNeededForReproduction = bacteriaNutrientsNeededForReproduction;
    }

    public int getSpawnedBacteriaNutrients() {
        return spawnedBacteriaNutrients;
    }

    public void setSpawnedBacteriaNutrients(int spawnedBacteriaNutrients) {
        this.spawnedBacteriaNutrients = spawnedBacteriaNutrients;
    }

    public int getBacteriaCount() {
        return bacteriaCount;
    }

    public void setBacteriaCount(int bacteriaCount) {
        this.bacteriaCount = bacteriaCount;
    }

    public int getNutrientsCount() {
        return nutrientsCount;
    }

    public void setNutrientsCount(int nutrientsCount) {
        this.nutrientsCount = nutrientsCount;
    }

    public int getAverageBacteriaEnergy() {
        return averageBacteriaEnergy;
    }

    public void setAverageBacteriaEnergy(int averageBacteriaNutrients) {
        this.averageBacteriaEnergy = averageBacteriaNutrients;
    }

    public int getAverageNutrientsCount() {
        return averageNutrientsCount;
    }

    public void setAverageNutrientsCount(int averageNutrientsCount) {
        this.averageNutrientsCount = averageNutrientsCount;
    }

    public int getNutrientsPerSpawn() {
        return nutrientsPerSpawn;
    }

    public void setNutrientsPerSpawn(int nutrientsPerSpawn) {
        this.nutrientsPerSpawn = nutrientsPerSpawn;
    }

    public int getNumberOfReproducedBacteria() {
        return numberOfReproducedBacteria;
    }

    public void setNumberOfReproducedBacteria(int numberOfReproducedBacteria) {
        this.numberOfReproducedBacteria = numberOfReproducedBacteria;
    }

    public int getInitialBacteriaEnergy() {
        return initialBacteriaEnergy;
    }

    public void setInitialBacteriaEnergy(int initialBacteriaEnergy) {
        this.initialBacteriaEnergy = initialBacteriaEnergy;
    }

    public int getStarvationBacteriaTicks() {
        return starvationBacteriaTicks;
    }

    public void setStarvationBacteriaTicks(int starvationBacteriaTicks) {
        this.starvationBacteriaTicks = starvationBacteriaTicks;
    }

}
