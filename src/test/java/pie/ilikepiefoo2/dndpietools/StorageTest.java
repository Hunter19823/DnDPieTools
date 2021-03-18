package pie.ilikepiefoo2.dndpietools;


import org.junit.Test;


public class StorageTest {

    @Test
    public void getTotalWeight()
    {
        Storage test = new Storage();

        for(int i=0; i<5; i++)
        {
            Item item = new Item();
            item.setWeight(5);
            item.setCount(5);
            test.add(item);
        }
        System.out.println(test);
        if(test.getTotalWeight() != 125)
            throw new Error("Total weight is not functioning correctly.");
    }

    @Test
    public void getTotalAttributes()
    {
        Storage test = new Storage();
        Attributes attributes = new Attributes();
        attributes.createProperty(Condition.NONE,"Strength",1);
        attributes.createProperty(Condition.NONE,"Wisdom",2);
        attributes.createProperty(Condition.NONE,"Intelligence",3);
        attributes.createProperty(Condition.NONE,"Agility",4);
        for(int i=0; i<5; i++)
        {
            Item item = new Item();
            item.getBaseAttributes().combine(attributes);
            test.add(item);
        }
        System.out.println(test.getTotalAttributes());
        Attributes comparedTo = new Attributes();
        comparedTo.createProperty(Condition.NONE,"Strength",5);
        comparedTo.createProperty(Condition.NONE,"Wisdom",10);
        comparedTo.createProperty(Condition.NONE,"Intelligence",15);
        comparedTo.createProperty(Condition.NONE,"Agility",20);
        Attributes total = test.getTotalAttributes();
        if(total.getProperty(Condition.NONE,"Strength") != 5)
            throw new Error("Total Attributes is not functioning correctly.");
        if(total.getProperty(Condition.NONE,"Wisdom") != 10)
            throw new Error("Total Attributes is not functioning correctly.");
        if(total.getProperty(Condition.NONE,"Intelligence") != 15)
            throw new Error("Total Attributes is not functioning correctly.");
        if(total.getProperty(Condition.NONE,"Agility") != 20)
            throw new Error("Total Attributes is not functioning correctly.");
        //throw new RuntimeException();
    }
}
