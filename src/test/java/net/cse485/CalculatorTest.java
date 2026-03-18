package net.cse485;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator defaultOp;
    Calculator operation;

    @BeforeEach
    public void setup() {
        defaultOp = new Calculator();
        operation = new Calculator(100, 5);
    }

    @Test
    public void constructorTest() {
        assertEquals("0.0", defaultOp.left.toString());
        assertEquals("0.0", defaultOp.right.toString());

        assertEquals("100", operation.left.toString());
        assertEquals("5", operation.right.toString());
    }

    @Test
    public void addTest() {
        String expected = operation.add();
        assertEquals("105", expected);

        expected = defaultOp.add();
        assertEquals("0.0", expected);
    }

    @Test
    public void subTest() {
        String expected = operation.sub();
        assertEquals("95", expected);

        expected = defaultOp.sub();
        assertEquals("0.0", expected);
    }

    @Test
    public void mulTest() {
        String expected = operation.mul();
        assertEquals("500", expected);

        expected = defaultOp.mul();
        assertEquals("0.00", expected);
    }

    @Test
    public void divTest() {
        String expected = operation.div();
        assertEquals("20", expected);

        expected = defaultOp.div();
        assertEquals("-1", expected);
    }

    @Test
    public void powTest() {
        String expected = operation.pow();
        assertEquals("10000000000", expected);

        expected = defaultOp.pow();
        assertEquals("1", expected);
    }
}