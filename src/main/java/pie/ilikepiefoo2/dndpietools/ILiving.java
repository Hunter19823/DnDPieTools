package pie.ilikepiefoo2.dndpietools;

/**
 * An interface for describing a living thing.
 */
public interface ILiving {
    int getCurrentHealth();

    void setCurrentHealth(int currentHealth);

    int getMaxHealth();

    void setMaxHealth(int health);

    default boolean isAlive()
    {
        return (getCurrentHealth() > 0);
    }

    default boolean isDead()
    {
        return !isAlive();
    }
}
