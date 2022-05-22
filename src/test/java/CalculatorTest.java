import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    void shouldAddTwoValues2and2() {
        //given
        int value1 = 2;
        int value2 = 2;

        //when
        int add = Calculator.add(value1, value2);

        //then
        Assertions.assertEquals(4, add);

    }

    void shouldSubstractTwoValues5and2() {
        //given
        int value1 = 5;
        int value2 = 2;

        //when
        int substract = Calculator.substract(value1, value2);

        //then
        Assertions.assertEquals(2, substract);
    }


    void shouldMultiplyTwoValues2and2() {
        //given
        int value1 = 3;
        int value2 = 2;

        //when
        int multiply = Calculator.multiply(value1, value2);

        //then
        Assertions.assertEquals(6, multiply);
    }


    void shouldDivideTwoValues2and2() {
        //given
        int value1 = 10;
        int value2 = 5;

        //when
        int divide = Calculator.add(value1, value2);

        //then
        Assertions.assertEquals(2, divide);
    }


}
