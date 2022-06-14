import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    void shouldAddTwoValues() {
        //given
        int value1 = 2;
        int value2 = 2;
        //when
        int additionResult = Calculator.addResult(value1, value2);
        //then
        Assertions.assertEquals(4, additionResult);
    }

    void shouldSubstractTwoValues() {
        //given
        int value1 = 5;
        int value2 = 2;
        //when
        int substractionResult = Calculator.substractResult(value1, value2);
        //then
        Assertions.assertEquals(2, substractionResult);
    }

    void shouldMultipyTwoValues() {
        //given
        int value1 = 3;
        int value2 = 2;
        //when
        int multiplicationResult = Calculator.multiplyResult(value1, value2);
        //then
        Assertions.assertEquals(6, multiplicationResult);
    }

    void shouldDividedTwoValues() {
        //given
        int value1 = 10;
        int value2 = 5;
        //when
        int divisionResult = Calculator.divideResult(value1, value2);
        //then
        Assertions.assertEquals(2, divisionResult);
    }

}
