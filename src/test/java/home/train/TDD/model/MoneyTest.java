package home.train.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication(){
        Money five= Money.getDollar(5);
        assertEquals(Money.getDollar(10),five.times(2));
        assertEquals(Money.getDollar(15),five.times(3));
        Money fiveF= Money.getFranck(5);
        assertEquals(Money.getFranck(10),fiveF.times(2));
    }

    @Test
    void testEqual() {
        assertEquals(Money.getDollar(25),Money.getDollar(25));
        assertNotEquals(Money.getDollar(10),Money.getDollar(20));
        assertEquals(Money.getFranck(10),Money.getFranck(10));
    }

    @Test
    void currencyEqual() {
        assertEquals(Money.getDollar(1).currency,"USD");
        assertEquals(Money.getFranck(1).currency,"CHF");
    }

    @Test
    void testSimpleAddition() {
        Money five=Money.getDollar(5);
        Expression sum=five.plus(five);
        Bank bank=new Bank();
        Money reduce=bank.reduce(sum,"USD");
        assertEquals(Money.getDollar(10),reduce);
    }
}