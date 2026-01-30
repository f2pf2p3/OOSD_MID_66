public class Demo2{
    void test(){
        DevelopingCountry A = new DevelopingCountry("001","Thaland",3,6,9);
        DevelopingCountry B = new DevelopingCountry("002","Philippines", 6.2, 5, 8);
        DevelopingCountry C = new DevelopingCountry("003","Cambodia",6.8,8,8);
        
        A.factoryBase(5); A.importTechnology(6); A.governmentProjects(8);
        B.factoryBase(4); B.importTechnology(5); B.governmentProjects(5);
        C.factoryBase(4); C.importTechnology(3); C.governmentProjects(4);
        
        DevelopedCountry D = new DevelopedCountry("008","Korea", 2.2, 5, 4);
        DevelopedCountry E = new DevelopedCountry("009","USA", 2.1, 10, 5);
        DevelopedCountry F = new DevelopedCountry("010","UK", 1.4, 6, 7);
        
        D.education(8); D.publicServices(7); D.exportTechnology(6);
        E.education(6); E.publicServices(6); E.exportTechnology(10);
        F.education(7); F.publicServices(8); F.exportTechnology(5);
        
        DB db = new DB();
        db.add(A);
        db.add(B);
        db.add(C);
        db.add(D);
        db.add(E);
        db.add(F);
        db.print();
        db.topPollution();
        db.topInnovation();
        db.topHappyness();
    }
}