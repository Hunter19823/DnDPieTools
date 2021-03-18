package pie.ilikepiefoo2.dndpietools;

import java.util.LinkedHashMap;
import java.util.Map;

public class Equipment implements ILoadable<Equipment> {
    public Map<String, Item> equipmentMap;

    public Equipment()
    {
        this(new LinkedHashMap<String,Item>());
    }
    private Equipment(Map<String, Item> equipmentMap)
    {
        this.equipmentMap = equipmentMap;
    }


    public Map<String, Item> getEquipmentMap()
    {
        return this.equipmentMap;
    }


    public void equip(String slot, Item item)
    {
        this.equipmentMap.put(slot,item);
    }


    public Item getItem(String slot)
    {
        return this.equipmentMap.get(slot);
    }


    public boolean isEmpty(String slot)
    {
        return !this.equipmentMap.containsKey(slot);
    }


    public Item dequip(String slot)
    {
        return this.equipmentMap.remove(slot);
    }

    @Override
    public String toString()
    {
        return "Equipment{" +
                "equipmentMap=" + equipmentMap +
                '}';
    }
}
