package home.train.TDD.model;

public abstract class Money {
    protected int amount;

    public abstract Money times(int multiplier);

    public static Dollar getDollar(int amount){
        return new Dollar(amount);
    }

    public static Frank getFranck(int amount){
        return new Frank(amount);
    }

    @Override
    public boolean equals(Object o){
        Money money=(Money) o;
        return amount==money.amount
                && this.getClass().equals(o.getClass());
    }
}
