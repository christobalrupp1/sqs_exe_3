package htwg.win.sqs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    ICalculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(0, calculator.add(0, 1));
        assertEquals(-2, calculator.add(-5, 3));
        assertEquals(6, calculator.add(4, 2));
        assertEquals(18, calculator.add(1, 17));
        assertEquals(6, calculator.add(8, -2));
        assertEquals(1258, calculator.add(720, 538));
    }

    @Test
    void testSubtraction() {
        assertEquals(0, calculator.subtract(5, 5));
        assertEquals(-23, calculator.subtract(-20, 3));
        assertEquals(-14, calculator.subtract(4, 18));
        assertEquals(3, calculator.subtract(-6, -9));
        assertEquals(10, calculator.subtract(8, -2));
        assertEquals(873, calculator.subtract(900, 27));
    }

    @Test
    void testMultiplication() {
        assertEquals(0, calculator.multiply(0, 0));
        assertEquals(-15, calculator.multiply(-5, 3));
        assertEquals(8, calculator.multiply(4, 2));
        assertEquals(17, calculator.multiply(1, 17));
        assertEquals(-16, calculator.multiply(8, -2));
        assertEquals(27, calculator.multiply(-27, -1));
        assertEquals(10760, calculator.multiply(20, 538));
    }

    @Test
    void testDivision() {
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(5, 0));
        assertEquals(2, calculator.divide(8, 4));
        assertEquals(2, calculator.divide(13, 5));
        assertEquals(0, calculator.divide(10, 100));
        assertEquals(-3, calculator.divide(9, -3));
        assertEquals(-5, calculator.divide(-20, 4));
        assertEquals(4, calculator.divide(-12, -3));
        assertEquals(500, calculator.divide(1500, 3));
    }
}
