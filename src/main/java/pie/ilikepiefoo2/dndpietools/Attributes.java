package pie.ilikepiefoo2.dndpietools;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;

public class Attributes implements ILoadable<Attributes> {
    protected LinkedHashMap<Condition,LinkedHashMap<String,Integer>> properties;
    private static LinkedHashSet<String> possibleAttributes;

    public Attributes()
    {
        this.properties = new LinkedHashMap<>();

        for(Condition condition : Condition.values())
        {
            this.properties.put(condition, new LinkedHashMap<>());
        }
        possibleAttributes = new LinkedHashSet<>();
    }
    private Attributes(LinkedHashMap<Condition,LinkedHashMap<String,Integer>> properties)
    {
        this.properties = properties;
        this.possibleAttributes = new LinkedHashSet<>();
    }

    public LinkedHashMap<Condition, LinkedHashMap<String, Integer>> getAllProperties()
    {
        return this.properties;
    }


    public LinkedHashMap<String, Integer> getProperties(Condition condition)
    {
        return this.properties.get(condition);
    }


    public LinkedHashMap<String, Integer> getPassiveProperties()
    {
        return this.properties.get(Condition.NONE);
    }


    public int getProperty(Condition condition, String property)
    {
        return getProperties(condition).getOrDefault(property,0);
    }

    public void createProperty(Condition condition, String property, int value){
        getProperties(condition).put(property,value);
    }


    public void setProperty(Condition condition, String property, int value)
    {
        getProperties(condition).put(property,value);
    }


    public void addToProperty(Condition condition, String property, int value)
    {
        setProperty(condition,property,getProperty(condition,property) + value);
    }


    public void subFromProperty(Condition condition, String property, int value)
    {
        setProperty(condition,property,getProperty(condition,property) - value);
    }


    public Attributes combine(Attributes attributes)
    {
        for (Map.Entry<Condition, LinkedHashMap<String, Integer>> conditionLinkedHashMapEntry : attributes.getAllProperties().entrySet()) {
            for (Map.Entry<String, Integer> stringIntegerEntry : conditionLinkedHashMapEntry.getValue().entrySet()) {
                this.addToProperty(conditionLinkedHashMapEntry.getKey(),stringIntegerEntry.getKey(),stringIntegerEntry.getValue());
            }
        }
        return this;
    }

    @Override
    public Attributes clone()
    {
        Attributes clone = new Attributes();
        this.properties.entrySet().stream().forEachOrdered(conditionLinkedHashMapEntry -> conditionLinkedHashMapEntry.getValue().entrySet().stream().forEachOrdered(
                stringIntegerEntry -> clone.getProperties(conditionLinkedHashMapEntry.getKey()).put(stringIntegerEntry.getKey(), stringIntegerEntry.getValue())));

        return clone;
    }

    @Override
    public String toString()
    {
        return "Attributes{" +
                "properties=" + properties +
                '}';
    }
}
