package pie.ilikepiefoo2.dndpietools;

import java.util.HashSet;

public class Storage extends HashSet<Item> implements ILoadable<Storage> {
    public Storage()
    {
        super();
    }

    public double getTotalWeight(){
        return this.stream().mapToDouble(Item::getAccumulativeWeight).sum();
    }
    public Attributes getTotalAttributes()
    {
        Attributes output = new Attributes();
        this.stream().forEach(item -> output.combine(item.getBaseAttributes()));
        return output;
    }

    @Override
    public String toString()
    {
        return "Storage{"+super.toString()+"}";
    }
}
