package Lesson10_AssertThat;
//Обязательно публичные!

import org.junit.Test;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void whenDivFistOnSecondThenResultIs(){
        final Calculator calculator = new Calculator();
        final int result = calculator.div(15,5);
        assertThat(result, is(3));
    }


}