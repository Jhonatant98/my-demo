package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();
    //TEST SUM
    @Test
    @DisplayName("Testing sum: 1+1=2")
    void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }
    //TEST SUBTRACTION
    @Test
    @DisplayName("Testing sum: 1-1=0")
    void subtrac() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 0L;

        // Act
        Long result = basicCalculator.subtrac(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtraction")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "0,    1,   -1",
            "2,    1,   1",
            "50,  50,   0",
            "20,  10,   10"
    })
    public void severalSubtrac(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.subtrac(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }
    //TEST MULTIPLICATION
    @Test
    @DisplayName("Testing sum: 1*1=1")
    void mult() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 1L;

        // Act
        Long result = basicCalculator.mult(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several subtraction")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "0,    1,   0",
            "2,    1,   2",
            "5,    2,  10",
            "20,  10,  200"
    })
    public void severalMult(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.mult(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }
}