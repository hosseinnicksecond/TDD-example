package home.train.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.getDollar(5);
        assertEquals(Money.getDollar(10), five.times(2));
        assertEquals(Money.getDollar(15), five.times(3));
        Money fiveF = Money.getFranck(5);
        assertEquals(Money.getFranck(10), fiveF.times(2));
    }

    @Test
    void testEqual() {
        assertEquals(Money.getDollar(25), Money.getDollar(25));
        assertNotEquals(Money.getDollar(10), Money.getDollar(20));
        assertEquals(Money.getFranck(10), Money.getFranck(10));
    }

    @Test
    void currencyEqual() {
        assertEquals(Money.getDollar(1).currency, "USD");
        assertEquals(Money.getFranck(1).currency, "CHF");
    }

    @Test
    void testSimpleAddition() {
        Money five = Money.getDollar(5);
        Expression sum = five.plus(five);
        Bank bank = new Bank();
        Money reduce = bank.reduce(sum, "USD");
        assertEquals(Money.getDollar(10), reduce);
    }

    @Test
    void testPlusReturnsSum() {
        Money five = Money.getDollar(5);
        Expression result = five.plus(five);
        Sum sum = (Sum) result;
        assertEquals(five, sum.augmend);
        assertEquals(five, sum.addmend);
    }

    @Test
    void testReduceSum() {
        Expression sum = new Sum(Money.getDollar(3), Money.getDollar(4));
        Bank bank = new Bank();
        Money result = bank.reduce(sum, "USD");
        assertEquals(Money.getDollar(7), result);
    }

    @Test
    void testReduceMoney() {
        Bank bank = new Bank();
        Money reduce = bank.reduce(Money.getDollar(1), "USD");
        assertEquals(Money.getDollar(1), reduce);
    }

    @Test
    void testReduceMoneyDifferentCurrency() {
        Bank bank = new Bank();
        bank.addRate("CHF", "USD", 2);
        Money result = bank.reduce(Money.getFranck(2), "USD");
        assertEquals(Money.getDollar(1), result);
    }

    @Test
    void testIdentityRate() {
        assertEquals(1, new Bank().rate("USD", "USD"));
        assertEquals(1, new Bank().rate("CHF", "CHF"));
    }
}