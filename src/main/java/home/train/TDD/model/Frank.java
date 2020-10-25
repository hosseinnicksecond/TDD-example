package home.train.TDD.model;

public class Frank {
    private int amount;

    public Frank(int amount){
        this.amount=amount;
    }

    Frank time(int multiplier){
      return new Frank(amount*multiplier);
    }

    @Override
    public boolean equals(Object o){
        Frank frank= (Frank) o;
        return amount==frank.amount;
    }
}
