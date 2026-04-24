package lab6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DoubleCalculatorTest {

    private DoubleCalculator calculator;
    @BeforeEach
    public void setup() {
        calculator = new DoubleCalculator();
        calculator.init();
    }

    @Test
    public void init() {
        assertEquals(0.0,calculator.result());
    }

    @Test
    public void add(){
        calculator.add(9.5);
        assertEquals(9.5,calculator.result());
    }

    @Test
    public void subtract(){
        calculator.subtract(7.0);
        assertEquals(-7,calculator.result());
    }

    @Test
    public void multiply(){
        calculator.add(25.5);
        calculator.multiply(3.0);
        assertEquals(76.5,calculator.result());
    }

    @Test
    public void divide(){
        calculator.add(20.0);
        calculator.divide(10.0);
        assertEquals(2,calculator.result());
    }

    @Test
    public void testChainOperations() {
        calculator.add(10.0)
                .subtract(2.0)
                .multiply(3.0)
                .divide(2.0);

        assertEquals(12, calculator.result());
    }

    @Test
    public void testmultiply0() {
        calculator.add(10.0);
        calculator.multiply(0.0);
        assertEquals(0, calculator.result());
    }

    @Test
    public void testDivide0() {
        calculator.add(10.5);
        calculator.divide(0.0);
        assertTrue(Double.isInfinite(calculator.result()));
    }

    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
