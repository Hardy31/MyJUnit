package Lesson20_BeforeAfter;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class UserTest {

    private User user20;

    @Before
    public void beforeOrAnyHandleName(){
        user20 = new User(29,"Иван", 1500);
        System.out.println("@Before - " + user20.getAge());
    }

    @After
    public void afterOrAnyHandleName(){
        user20 = new User(1,"Нави", 9999);
        System.out.println("@After - " + user20.getAge());
    }


    @Test
    public void whenGrowThenAgeIncrement() {
        user20.grow();
        final int  result = user20.getAge();
        assertThat (result,  is(30));
    }

    @Test
    public void whenGrowThenDableAgeIncrement() {
        user20.grow();
        user20.grow();
        final int  result = user20.getAge();
        assertThat (result,  is(31));
    }
    @Test
    public void whenStatusTrue(){
        user20.setStatus(true);
        assertTrue(user20.isStatus());
    }
}