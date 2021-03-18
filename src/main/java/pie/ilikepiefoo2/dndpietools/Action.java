package pie.ilikepiefoo2.dndpietools;

import java.util.LinkedList;
import java.util.List;

public class Action implements ILoadable<Action>{
    private List<Roll> rolls;
    private Description description;
    public Action(){
        this(new LinkedList<Roll>(), new Description());
    }
    private Action(List<Roll> rolls, Description description){
        this.rolls = rolls;
        this.description = description;
    }

    public Description getDescription()
    {
        return description;
    }
    public List<Roll> getRolls()
    {
        return rolls;
    }

    @Override
    public String toString()
    {
        return "Action{" +
                "rolls=" + rolls +
                ", description=" + description +
                '}';
    }
}
