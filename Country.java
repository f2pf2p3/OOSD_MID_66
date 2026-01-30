public class Country{
    private String code;
    private String name;
    private double gdp;
    
    Country(String code, String name, double gdp){
        this.code = code;
        this.gdp = gdp;
        this.name = name;
    }
    
    @Override
    public String toString(){
        return ("รหัส: "+code+", ประเทศ: "+name+", GDP: "+gdp);
    }
    
    public void setGdp(double n){
        this.gdp += n;
    }
    
    public String getCode(){
        return code;
    }
    
    public String getName(){
        return name;
    }
    
    public double getGdp(){
        return gdp;
    }
}