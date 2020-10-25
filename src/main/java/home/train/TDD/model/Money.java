package home.train.TDD.model;

public abstract class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public abstract Money times(int multiplier);

    public String currency(){
        return currency;
    }

    public static Money getDollar(int amount){
        return new Dollar(amount,"USD");
    }

    public static Money getFranck(int amount){
        return new Frank(amount,"CHF");
    }

    @Override
    public boolean equals(Object o){
        Money money=(Money) o;
        return amount==money.amount
                && this.getClass().equals(o.getClass());
    }
}
