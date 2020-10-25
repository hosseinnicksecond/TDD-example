package home.train.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplicationDollar(){
        Dollar five= new Dollar(5);
        Dollar product=five.times(2);
        assertEquals(new Dollar(10),product);
        product=five.times(3);
        assertEquals(new Dollar(15),product);
    }

    @Test
    void testEqualDollar() {
        assertEquals(new Dollar(25),new Dollar(25));
        assertNotEquals(new Dollar(20),new Frank(20));
    }

    @Test
    void testMultiplicationFrank() {
        Frank five= new Frank(5);
        Frank product=five.time(2);
        assertEquals(new Frank(10),product);
        product=five.time(3);
        assertEquals(new Frank(15),product);
    }

    @Test
    void testEqualFrank() {
        assertEquals(new Frank(10),new Frank(10));
        assertNotEquals(new Frank(15),new Frank(10));
    }
}