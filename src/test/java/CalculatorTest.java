import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class CalculatorTest {
    @Test
    void shouldAddingTwoValues() {
        //given
        int value1 = 2;
        int value2 = 2;
        //when
        int add = Calculator.addResult(value1, value2);
        //then
        Assertions.assertEquals(4, add);
    }

    void shouldSubstractionTwoValues() {
        //given
        int value1 = 5;
        int value2 = 2;
        //when
        int substract = Calculator.substractResult(value1, value2);
        //then
        Assertions.assertEquals(2, substract);
    }

    void shouldMultiplicationTwoValues() {
        //given
        int value1 = 3;
        int value2 = 2;
        //when
        int multiply = Calculator.multiplyResult(value1, value2);
        //then
        Assertions.assertEquals(6, multiply);
    }

    void shouldDivisionTwoValues() {
        //given
        int value1 = 10;
        int value2 = 5;
        //when
        int divide = Calculator.divideResult(value1, value2);
        //then
        Assertions.assertEquals(2, divide);
    }

}
