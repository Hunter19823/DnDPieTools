package pie.ilikepiefoo2.dndpietools;

import java.util.LinkedHashMap;

public class StatusEffects extends LinkedHashMap<String, StatusEffects.Effect> {
    public StatusEffects(){
        super();
    }
    public static class Effect{
        protected final Attributes attributes;
        public Effect(Attributes attributes)
        {
            this.attributes = attributes;
        }

        public Attributes getAttributes()
        {
            return attributes;
        }

        @Override
        public String toString()
        {
            return "Effect{" +
                    "attributes=" + attributes +
                    '}';
        }
    }
    public Attributes getTotalAttributes()
    {
        Attributes output = new Attributes();
        this.values().stream().forEach(effect -> output.combine(effect.getAttributes()));
        return output;
    }

    @Override
    public String toString()
    {
        return "StatusEffects{"+super.toString()+"}";
    }
}
