public class CorruptedCountry extends DevelopingCountry implements Corruptible{
    public CorruptedCountry(String code, String name, double gdp, double pollution, double corruption){
        super(code,name,gdp,pollution,corruption);
    }
    
    @Override
    public void secretBudget(double n){
        setCorruption(n*0.7);
    }
}