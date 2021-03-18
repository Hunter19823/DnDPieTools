package pie.ilikepiefoo2.dndpietools;


/**
 * An interface for getting results of rolls.
 */
public interface IRollable {
    /**
     * Perform a dice calculation.
     *
     * @param roll  The roll being performed.
     * @return      An integer that represents the
     *              result of the roll.
     */
    int calculate(Roll roll);

    /**
     * Performs a dice calculation for the specified action.
     *
     *
     * @param action    The action being performed.
     * @return          An integer that represents the
     *                  sum of every roll.
     */
    int calculate(Action action);
}
