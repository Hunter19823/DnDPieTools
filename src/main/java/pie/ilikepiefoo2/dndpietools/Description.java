package pie.ilikepiefoo2.dndpietools;

public class Description implements ILoadable<Description> {
    private String name, lore, toolTip;
    public Description()
    {
        this("","","");
    }
    public Description(String name)
    {
        this(name,"","");
    }
    public Description(String name, String lore)
    {
        this(name,lore,"");
    }
    public Description(String name, String lore, String toolTip)
    {
        this.name = name;
        this.lore = lore;
        this.toolTip = toolTip;
    }


    public boolean hasName()
    {
        return this.name.length() > 0;
    }


    public boolean hasLore()
    {
        return this.lore.length() > 0;
    }


    public boolean hasTooltip()
    {
        return this.toolTip.length() > 0;
    }


    public String getName()
    {
        return this.name;
    }


    public String getLore()
    {
        return this.lore;
    }


    public String getTooltip()
    {
        return this.toolTip;
    }


    public void setName(String name)
    {
        this.name = name;
    }


    public void setLore(String lore)
    {
        this.lore = lore;
    }


    public void setTooltip(String tooltip)
    {
        this.toolTip = tooltip;
    }

    @Override
    public String toString()
    {
        return "Description{" +
                "name='" + name + '\'' +
                ", lore='" + lore + '\'' +
                ", toolTip='" + toolTip + '\'' +
                '}';
    }
}
