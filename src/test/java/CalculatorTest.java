import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before() {
        this.calculator = new Calculator(5);
    }

    @Test
    public void canAdd() {
        assertEquals(10, calculator.addNumber(5));

    }

    @Test
    public void canSubtract() {
        assertEquals(2, calculator.subtractNumber(3));
    }

    @Test
    public void canMultiply() {
        assertEquals(10, calculator.multiplyNumber(2));
    }

    @Test
    public void canDivide() {
        assertEquals(1, calculator.divideNumber(5));
    }
}
