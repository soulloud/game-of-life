package edu.macalester.comp124.life;

/**
 * RuleSet implementing Conway's Game of Life.
 *
 * @author Michael Ekstrand <ekstrand@cs.umn.edu>
 */
public class Conway implements RuleSet {

    public String getName() {

        return "Conway's Rules";
    }

    /**
     * Applies the rules of Conway's Game of Life.
     *
     * @param isAlive       The value of the current cell (true = alive).
     * @param neighborCount The number of living neighbors of the cell.
     * @return true if the cell should be alive in the next generation.
     */
    public boolean applyRules(boolean isAlive, int neighborCount) {

        if (isAlive) {
            if (neighborCount >1 && neighborCount < 4 ) {
                return true;
            }
            else {
                return false;
            }
        }
        else {
            if (neighborCount ==3 ) {
                return true;
            }
            else {
                return false;
            }
        }
    }
}





















