package pie.ilikepiefoo2.dndpietools;

public class Item implements INotes, ILoadable, IAffectable {
    private Attributes attributes;
    private Storage storage;
    private Description description;
    private StatusEffects statusEffects;
    private String notes;
    private int count;
    private double weight;

    public Item()
    {
        this(new Attributes(), new Storage(), new Description(), new StatusEffects(),"",0,0.0);
    }
    private Item(Attributes attributes, Storage storage, Description description, StatusEffects statusEffects, String notes, int count, double weight)
    {
        this.attributes = attributes;
        this.storage = storage;
        this.description = description;
        this.statusEffects = statusEffects;
        this.notes = notes;
        this.count = count;
        this.weight = weight;
    }

    public Attributes getBaseAttributes()
    {
        return this.attributes;
    }

    public Attributes getAccumulativeAttributes()
    {
        Attributes output = new Attributes();
        output.combine(this.attributes);
        output.combine(this.getStorage().getTotalAttributes());
        output.combine(this.getStatusEffects().getTotalAttributes());
        return output;
    }

    public Storage getStorage()
    {
        return this.storage;
    }

    public Description getDescription()
    {
        return this.description;
    }

    public int getCount()
    {
        return this.count;
    }

    public void setCount( int count )
    {
        this.count = count;
    }

    public double getWeight()
    {
        return this.weight*this.count;
    }

    public void setWeight( double weight )
    {
        this.weight = weight;
    }

    public double getAccumulativeWeight()
    {
        return this.getWeight() + this.getStorage().getTotalWeight();
    }


    @Override
    public StatusEffects getStatusEffects()
    {
        return this.statusEffects;
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
    public String toString()
    {
        return "Item{" +
                "attributes=" + attributes +
                ", storage=" + storage +
                ", description=" + description +
                ", statusEffects=" + statusEffects +
                ", notes='" + notes + '\'' +
                ", count=" + count +
                ", weight=" + weight +
                '}';
    }
}
