import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    private static final double error = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void squareRootFTruePositive() {
        assertEquals("square root (true positive): ", 10.0, calculator.squareRootF(100), error);
        assertEquals("square root (true positive): ", 16.0, calculator.squareRootF(256), error);
    }

    @Test
    public void squareRootFTrueNegative() {
        assertNotEquals("square root (true negative): ", 11.0, calculator.squareRootF(81), error);
        assertNotEquals("square root (true negative): ", 10.0, calculator.squareRootF(121), error);
    }

    @Test
    public void factorialFTruePositive() {
        assertEquals("factorial (true positive): ", 24.0, calculator.factorialF(4), error);
        assertEquals("factorial (true positive): ", 120.0, calculator.factorialF(5), error);
    }

    @Test
    public void factorialFTrueNegative() {
        assertNotEquals("factorial (true negative): ", 12.0, calculator.factorialF(4), error);
        assertNotEquals("factorial (true negative): ", 111.0, calculator.factorialF(5), error);
    }


    @Test
    public void naturalLogarithmFTruePositive() {
        assertEquals("natural logarithm (true positive): ", 2.302585092994046, calculator.naturalLogarithmF(10), error);
        assertEquals("natural logarithm (true positive): ", 1.6094379124341003, calculator.naturalLogarithmF(5), error);
    }

    @Test
    public void naturalLogarithmFTrueNegative() {
        assertNotEquals("natural logarithm (true positive): ", 3.0, calculator.naturalLogarithmF(20), error);
        assertNotEquals("natural logarithm (true positive): ", 1.1, calculator.naturalLogarithmF(3), error);
    }

    @Test
    public void powerFTruePositive() {
        assertEquals("power factorial (true positive): ", 8.0, calculator.powerF(2, 3), error);
        assertEquals("power factorial (true positive): ", 256.0, calculator.powerF(4, 4), error);
    }

    @Test
    public void powerFTrueNegative() {
        assertNotEquals("power factorial (true negative): ", 5.0, calculator.powerF(2, 2), error);
        assertNotEquals("power factorial (true negative): ", 10.0, calculator.powerF(3, 2), error);
    }
}
