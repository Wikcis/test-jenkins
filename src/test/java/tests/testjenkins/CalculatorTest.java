package tests.testjenkins;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddition() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result, "2 + 3 should equal 5");
    }

    @Test
    void ShouldReturnFalse() {
        Calculator calc = new Calculator();
        int result = calc.add(4, 3);
        assertEquals(7, result, "4 + 3 should equal 7");
    }
}
