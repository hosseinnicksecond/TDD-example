package home.train.TDD.model;

import java.util.HashMap;
import java.util.Map;

public class Bank {

    private Map<Pair, Integer> pairMap= new HashMap<>();

    public Money reduce(Expression s,String Currency){
        return s.reduce(this,Currency);
//        if(s instanceof Money) return (Money)s;
//        Sum sum= (Sum) s;
//        return sum.reduce(Currency);
    }
    public int rate(String from,String to){
//        return (from.equals("CHF") && to.equals("USD")) ?2 :1;
        if(from.equals(to)) return 1;
        return pairMap.get(new Pair(from,to));
    }
    public void addRate(String from,String to,int amount){
        pairMap.put(new Pair(from,to),amount);
    }
}
