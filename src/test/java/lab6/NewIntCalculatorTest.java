package lab6;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class NewIntCalculatorTest {

    private NewIntCalculator calculator;
    @BeforeEach
    public void setup() {
        calculator = new NewIntCalculator();
        calculator.init();
    }

    @Test
    public void init() {
        int result=calculator.result();
        assertEquals(0,result);
    }

    @Test
    public void add(){
        int a=5;
        calculator.add(a);
        assertEquals(5,calculator.result());
    }

    @Test
    public void subtract(){
        int a=7;
        calculator.subtract(a);
        assertEquals(-7,calculator.result());
    }

    @Test
    public void multiply(){
        calculator.add(2);
        calculator.multiply(3);
        assertEquals(6,calculator.result());
    }

    @Test
    public void divide(){
        calculator.add(20);
        calculator.divide(10);
        assertEquals(2,calculator.result());
    }

    @Test
    public void testChainOperations() {
        calculator.add(10)
                .subtract(2)
                .multiply(3)
                .divide(2);

        assertEquals(12, calculator.result());
    }

    @Test
    public void testmultiply0() {
        calculator.add(10);
        calculator.multiply(0);
        assertEquals(0, calculator.result());
    }

    @Test
    public void testDivide0() {
        calculator.add(10);
        assertThrows(ArithmeticException.class, () -> calculator.divide(0));
    }


    @AfterEach
    public void tearDown() {
        calculator = null;
    }


}
