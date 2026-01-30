public class DevelopedCountry extends Country{
    double innovation;
    double happynessScore;
    
    public DevelopedCountry(String code, String name, double gdp, double innovation, double happynessScore){
        super(code,name,gdp);
        this.innovation = innovation;
        this.happynessScore = happynessScore;
    }
    
    void education(double n){
        this.innovation += n*0.1;
    }
    
    void publicServices(double n){
        this.happynessScore += n*0.25;
        setGdp(-1*(n*0.1));
    }
    
    void exportTechnology(double n){
        setGdp(n*0.1);
    }
    
    double getInnovation(){
        return innovation;
    }
    
    double getHappynessScore(){
        return happynessScore;
    }
    
    @Override
    public String toString(){
        return ("รหัส:"+getCode()+", ประเทศ:"+getName()+", GDP:"+getGdp()+", innovation:"+innovation+", happynessScore:"+happynessScore);
    }
}