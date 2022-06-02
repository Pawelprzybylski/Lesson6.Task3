import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoValues() {
        //given
        int value1 = 2;
        int value2 = 2;

        //when
        int add = Calculator.additionResult(value1, value2);

        //then
        Assertions.assertEquals(4, add);

    }

    void shouldSubstractTwoValues() {
        //given
        int value1 = 5;
        int value2 = 2;

        //when
        int substract = Calculator.substractionResult(value1, value2);

        //then
        Assertions.assertEquals(2, substract);
    }


    void shouldMultiplyTwoValues() {
        //given
        int value1 = 3;
        int value2 = 2;

        //when
        int multiply = Calculator.multiplicationResult(value1, value2);

        //then
        Assertions.assertEquals(6, multiply);
    }


    void shouldDivideTwoValues() {
        //given
        int value1 = 10;
        int value2 = 5;

        //when
        int divide = Calculator.divisionResult(value1, value2);

        //then
        Assertions.assertEquals(2, divide);
    }


}
