package pie.ilikepiefoo2.dndpietools;

import java.util.HashMap;
import java.util.Map;

public class Wallet implements ILoadable<Wallet> {
    Map<String, Double> currencies;
    public Wallet()
    {
        this(new HashMap<>());
    }
    private Wallet(Map<String,Double> currencies)
    {
        this.currencies = currencies;
    }


    public Map<String, Double> getCurrencies()
    {
        return this.currencies;
    }


    public Double getCurrency(String currency)
    {
        return this.currencies.getOrDefault(currency,0.0);
    }


    public void setCurrency(String currency, Double amount)
    {
        this.currencies.put(currency,amount);
    }


    public void addCurrency(String currency, Double amount)
    {
        setCurrency(currency,getCurrency(currency)+amount);
    }


    public void subtractCurrency(String currency, Double amount)
    {
        setCurrency(currency,getCurrency(currency)-amount);
    }


    @Override
    public String toString()
    {
        return "Wallet{" +
                "currencies=" + currencies +
                '}';
    }
}
