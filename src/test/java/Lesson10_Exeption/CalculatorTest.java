package Lesson10_Exeption;


import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class CalculatorTest  {

    @Test
    public void whenDivFistOnSecondThenResultIs(){
        final Calculator calculator = new Calculator();
        final int result = calculator.div(15,5);
        assertThat(result, is(3));
    }
    @Test(expected = ArithmeticException.class)
    public void whenDivOnZeroThenExceptionNotNull(){
        final Calculator calculator = new Calculator();
        final int result = calculator.div(15,0);
    }

}