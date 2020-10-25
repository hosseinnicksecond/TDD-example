package home.train.TDD.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DollarTest {

    @Test
    public void testMultiplication(){
        Dollar five= new Dollar(5);
        Dollar product=five.times(2);
        assertEquals(10,product.amount);
        product=five.times(3);
        assertEquals(15,product.amount);
    }

    @Test
    void testEqual() {
        assertEquals(new Dollar(25),new Dollar(25));
        assertNotEquals(new Dollar(25),new Dollar(20));
    }
}