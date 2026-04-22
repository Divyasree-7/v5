import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    void testAddition() {
        assertEquals(10, calc.add(7, 3));
    }

    @Test
    void testSubtraction() {
        assertEquals(4, calc.subtract(7, 3));
    }

    @Test
    void testMultiplication() {
        assertEquals(21, calc.multiply(7, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, calc.divide(6, 3));
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calc.divide(5, 0);
        });

        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}
