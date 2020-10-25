package home.train.TDD.model;

public class Dollar extends Money{
    public Dollar(int amount,String currency) {
        super(amount,currency);
    }

    public Money times(int multiplier){
       return Money.getDollar(amount * multiplier);
    }
}
