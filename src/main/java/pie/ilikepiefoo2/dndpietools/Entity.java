package pie.ilikepiefoo2.dndpietools;

public class Entity implements ILiving, INotes, ILoadable<Entity>, IAffectable, IRollable{
    private Description description;
    private Equipment equipment;
    private Wallet wallet;
    private StatusEffects statusEffects;
    private int currentHealth;
    private int maxHealth;
    private String notes;

    public Entity()
    {
        this(new Description(), new Equipment(), new Wallet(), new StatusEffects(), 0, 0,"");
    }

    private Entity(Description description, Equipment equipment, Wallet wallet, StatusEffects statusEffects, int currentHealth, int maxHealth, String notes)
    {
        this.description = description;
        this.equipment = equipment;
        this.wallet = wallet;
        this.statusEffects = statusEffects;
        this.currentHealth = currentHealth;
        this.maxHealth = maxHealth;
        this.notes = notes;
    }

    public Description getDescription()
    {
        return this.description;
    }

    public Equipment getEquipment()
    {
        return this.equipment;
    }

    @Override
    public StatusEffects getStatusEffects()
    {
        return this.statusEffects;
    }

    @Override
    public int getCurrentHealth()
    {
        return this.currentHealth;
    }

    @Override
    public void setCurrentHealth(int currentHealth)
    {
        this.currentHealth = currentHealth;
    }

    @Override
    public int getMaxHealth()
    {
        return this.maxHealth;
    }

    @Override
    public void setMaxHealth(int health)
    {
        this.maxHealth = health;
    }

    @Override
    public String getNotes()
    {
        return this.notes;
    }

    @Override
    public void setNotes(String notes)
    {
        this.notes = notes;
    }

    @Override
    public int calculate(Roll roll)
    {
        //TODO Implement Roll calculations
        return 0;
    }

    @Override
    public int calculate(Action action)
    {
        //TODO Implement Roll calculations
        return 0;
    }

    @Override
    public String toString()
    {
        return "Entity{" +
                "description=" + description +
                ", equipment=" + equipment +
                ", wallet=" + wallet +
                ", statusEffects=" + statusEffects +
                ", currentHealth=" + currentHealth +
                ", maxHealth=" + maxHealth +
                ", notes='" + notes + '\'' +
                '}';
    }
}
