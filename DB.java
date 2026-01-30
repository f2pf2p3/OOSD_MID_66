import java.util.ArrayList;

public class DB{
    ArrayList<Country> storage = new ArrayList<>();
    public void add(Country country){
        storage.add(country);
    }
    
    public void print(int n){
        for(int i=0;i<n;i++){
            System.out.println(storage.get(i));
        }
    }
    
    public void print(){
        for(int i=0;i<storage.size();i++){
            System.out.println(storage.get(i));
        }
        System.out.println("-----");
    }
    
    void topPollution(){
        double score = 0;
        DevelopingCountry Top = null;

        for(int i=0;i<storage.size();i++){
            if(storage.get(i) instanceof DevelopingCountry){
                DevelopingCountry c = (DevelopingCountry) storage.get(i);
                double temp = c.getPollution();
                
                if(temp > score){
                    Top = c;
                    score = temp;
                }
            }
        }
        
        System.out.println("Top pollution country: "+Top.getName());
    }
    
    void topCorruption(){
        double score = 0;
        DevelopingCountry Top = null;
        for(int i=0;i<storage.size();i++){
            if(storage.get(i) instanceof DevelopingCountry){
                DevelopingCountry c = (DevelopingCountry) storage.get(i);
                double temp = c.getCorruption();
                
                if(temp > score){
                    Top = c;
                    score = temp;
                }
            }
        }
        System.out.println("Top corruption country: "+Top.getName());
    }
    
    void topInnovation(){
	double score = 0;
	DevelopedCountry Top = null;
	for(int i=0;i<storage.size();i++){
            if(storage.get(i) instanceof DevelopedCountry){
		DevelopedCountry c = (DevelopedCountry) storage.get(i);
		double temp = c.getInnovation();
		if(temp > score){
                    Top = c;
                    score = temp;
		}
            }
        }
        System.out.println("Top innovation country: "+Top.getName());
    }
    
    void topHappyness(){
        double score = 0;
        DevelopedCountry Top = null;
        for(int i=0;i<storage.size();i++){
            if(storage.get(i) instanceof DevelopedCountry){
                DevelopedCountry c = (DevelopedCountry) storage.get(i);
                double temp = c.getHappynessScore();
                if(temp > score){
                    Top = c;
                    score = temp;
                }
            }
        }
        System.out.println("Top happyness country: "+Top.getName());
    }
}