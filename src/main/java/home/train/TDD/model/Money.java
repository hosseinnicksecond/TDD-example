package home.train.TDD.model;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money times(int multiplier){
        return new Money(amount*multiplier,this.currency);
    }

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
                && this.currency.equals(money.currency);
    }

    @Override
    public String toString() {
        return "Money{" +
                "amount=" + amount +
                ", currency='" + currency + '\'' +
                '}';
    }
}
