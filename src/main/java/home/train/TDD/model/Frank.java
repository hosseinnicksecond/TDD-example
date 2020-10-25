package home.train.TDD.model;

public class Frank extends Money{

    public Frank(int amount){
        this.amount=amount;
    }

    public Money times(int multiplier){
      return new Frank(amount*multiplier);
    }
}
