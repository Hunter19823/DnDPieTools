package pie.ilikepiefoo2.dndpietools;

public class Roll implements ILoadable {
    private String attribute;
    private int sides, count, offset;
    public Roll(String attribute, int sides,int count, int offset)
    {
        this.attribute = attribute;
        this.sides = sides;
        this.count = count;
        this.offset = offset;
    }

    public String getAttribute()
    {
        return attribute;
    }

    public void setAttribute(String attribute)
    {
        this.attribute = attribute;
    }

    public int getSides()
    {
        return sides;
    }

    public void setSides(int sides)
    {
        this.sides = sides;
    }

    public int getCount()
    {
        return count;
    }

    public void setCount(int count)
    {
        this.count = count;
    }

    public int getOffset()
    {
        return offset;
    }

    public void setOffset(int offset)
    {
        this.offset = offset;
    }

    @Override
    public String toString()
    {
        return "Roll{" +
                "attribute='" + attribute + '\'' +
                ", sides=" + sides +
                ", count=" + count +
                ", offset=" + offset +
                '}';
    }
}
