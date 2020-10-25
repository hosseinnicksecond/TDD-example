package home.train.TDD.model;

public class Sum implements Expression{
   Money augmend;
   Money addmend;

    public Sum(Money augend, Money addmend) {
        this.augmend = augend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(String currency) {
        int amount=addmend.amount+augmend.amount;
        return new Money(amount,currency);
    }
}
