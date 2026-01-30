public class Demo1
{
    public void test(){
        Country Country1 = new Country("001","Thailand",3);
        Country Country2 = new Country("002","Philippines",6.2);
        Country Country3 = new Country("003","Cambodia",6.8);
        Country Country4 = new Country("004","Bangladesh",7.4);
        Country Country5 = new Country("005","Greece",2.2);
        DB db= new DB();
        db.add(Country1);
        db.add(Country2);
        db.add(Country3);
        db.add(Country4);
        db.add(Country5);
        
        db.print();
        db.print(2);
    }
}