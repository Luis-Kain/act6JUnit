import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpecialCalculatorTest {


    @Test
    void squareAreaIsTen() {
        var calculator = new SpecialCalculator();
        assertEquals(10,calculator.squareArea(5,2));
    }

    @Test
    void squareAreaIsTenFalse() {
        var calculator = new SpecialCalculator();
        assertNotEquals(10,calculator.squareArea(5,5));
    }

    @Test
    void circleDiameterIsTen() {
        var calculator = new SpecialCalculator();
        assertEquals(10, calculator.circleDiameter(5));
    }

    @Test
    void circleDiameterIsTenFalse() {
        var calculator = new SpecialCalculator();
        assertNotEquals(10, calculator.circleDiameter(3));
    }

    @Test
    void isPrimeIsTrue() {
        var calculator = new SpecialCalculator();
        assertTrue(calculator.isPrime(3));
    }

    @Test
    void isPrimeIsFalse() {
        var calculator = new SpecialCalculator();
        assertFalse(calculator.isPrime(10));
    }

    @Test
    void isDigitIsTrue() {
        var calculator = new SpecialCalculator();
        assertTrue(calculator.isDigit("this is 100% True"));
    }

    @Test
    void isDigitIsFalse() {
        var calculator = new SpecialCalculator();
        assertFalse(calculator.isDigit("this is hundred% false"));
    }

    @Test
    void isUppercaseIsTrue() {
        var calculator = new SpecialCalculator();
        assertTrue(calculator.isUppercase("This is true"));
    }

    @Test
    void isUppercaseIsFalse() {
        var calculator = new SpecialCalculator();
        assertFalse(calculator.isUppercase("this is false"));
    }
}