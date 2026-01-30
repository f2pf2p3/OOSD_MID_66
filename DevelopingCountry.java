public class DevelopingCountry extends Country{
    double pollution;
    double corruption;
    
    public DevelopingCountry(String code, String name, double gdp, double pollution, double corruption){
        super(code,name,gdp);
        this.pollution = pollution;
        this.corruption = corruption;
    }
    
    void factoryBase(double n){
        this.pollution += n*0.5;
        setGdp(n*0.5);
    }
    
    void importTechnology(double n ){
        setGdp(n*0.1);
    }
    
    void governmentProjects(double n){
        this.corruption += n*0.15;
    }
    
    double getPollution(){
        return pollution;
    }
    
    double getCorruption(){
        return corruption;
    }
    
    void setCorruption(double n){
        this.corruption += n;
    }
    
    @Override
    public String toString(){
        return ("รหัส:"+getCode()+", ประเทศ:"+getName()+", GDP:"+getGdp()+", pollution:"+pollution+", corruption:"+corruption);
    }
}