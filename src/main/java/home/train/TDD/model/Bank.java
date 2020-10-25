package home.train.TDD.model;

public class Bank {

    public Money reduce(Expression s,String Currency){
        return s.reduce(Currency);
//        if(s instanceof Money) return (Money)s;
//        Sum sum= (Sum) s;
//        return sum.reduce(Currency);

    }
}
