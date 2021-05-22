package pl.coderslab.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int add = calculator.add(4, 5);
        assertEquals(9, add);
    }

    @Test
    void addNotEqual() {
        Calculator calculator = new Calculator();
        int add = calculator.add(4, 5);
        assertNotEquals(99, add);
    }
}
