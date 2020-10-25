package home.train.TDD.model;

public interface Expression {

    Money reduce(Bank bank,String currency);
}
