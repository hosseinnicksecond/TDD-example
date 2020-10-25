package home.train.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplicationDollar(){
        Money five= Money.getDollar(5);
        assertEquals(Money.getDollar(10),five.times(2));
        assertEquals(Money.getDollar(15),five.times(3));
    }

    @Test
    void testEqualDollar() {
        assertEquals(Money.getDollar(25),Money.getDollar(25));
        assertNotEquals(Money.getDollar(10),Money.getDollar(20));
    }

    @Test
    void testMultiplicationFrank() {
        Money five= Money.getFranck(5);
        assertEquals(Money.getFranck(10),five.times(2));
        assertEquals(Money.getFranck(15),five.times(3));
    }

    @Test
    void testEqualFrank() {
        assertEquals(new Frank(10),new Frank(10));
        assertNotEquals(new Frank(15),new Frank(10));
    }
}