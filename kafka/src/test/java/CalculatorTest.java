import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    @DisplayName("adding two numbers")
    void add() {
        assertEquals(2,Calculator.add(2,0));
    }

    @Test
    @DisplayName("Multiply two numbers")
    void multiply() {
        assertAll(
                () -> assertEquals(4,Calculator.multiply(2,2)),
                () -> assertEquals(4,Calculator.multiply(-2,-2)),
                () -> assertEquals(4,Calculator.multiply(2,2)),
                () -> assertEquals(-4,Calculator.multiply(-2,2)),
                () -> assertEquals(0, Calculator.multiply(0,0))
        );
    }
}