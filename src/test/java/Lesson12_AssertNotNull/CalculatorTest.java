package Lesson12_AssertNotNull;
//Обравнимание  что в Мэйне нет пакета Лессон2 АссертНотНул!!

import Lesson10_Exeption.Calculator;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class CalculatorTest {

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
    @Test
    public void whenDivthenResultNotNull(){
        final Calculator calculator = new Calculator();
        final int result = calculator.div(15,3);
        assertNotNull(result);
    }
}