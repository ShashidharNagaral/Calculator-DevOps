import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {

    private static final double error = 1e-15;
    Calculator calculator = new Calculator();
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
}
