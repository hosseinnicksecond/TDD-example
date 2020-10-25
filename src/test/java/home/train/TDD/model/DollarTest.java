package home.train.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplication(){
        Dollar five= new Dollar(5);
        Dollar product=five.times(2);
        assertEquals(new Dollar(10),product);
        product=five.times(3);
        assertEquals(new Dollar(15),product);
    }

    @Test
    void testEqual() {
        assertEquals(new Dollar(25),new Dollar(25));
        assertNotEquals(new Dollar(25),new Dollar(20));
    }
}