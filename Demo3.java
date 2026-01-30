public class Demo3{
    void test(){
        CorruptedCountry X = new CorruptedCountry("001","Thailand",3,6,9);
        CorruptedCountry Y = new CorruptedCountry("002","Philippines", 6.2, 5, 8);
        CorruptedCountry Z = new CorruptedCountry("003","Cambodia", 6.8, 8, 8);
        X.secretBudget(8);
        Y.secretBudget(9);
        Z.secretBudget(10);
        DB db = new DB();
        db.add(X);
        db.add(Y);
        db.add(Z);
        db.print();
        db.topCorruption();
    }
}