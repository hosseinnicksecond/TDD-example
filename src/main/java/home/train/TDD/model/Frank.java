package home.train.TDD.model;

public class Frank extends Money{

    public Frank(int amount){
        this.amount=amount;
    }

    Frank time(int multiplier){
      return new Frank(amount*multiplier);
    }
}
