package Lesson20_BeforeClass_AfterClass;


import Lesson20_BeforeAfter.User;
import org.junit.*;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class UserTest {

    private static User user20;

    //    Вызывается Один раз!
    @BeforeClass
    public static void beforeOrAnyHandleName(){
        user20 = new User(29,"Иван", 1500);
        System.out.println("@Before - " + user20.getAge());
    }


    //    Вызывается Один раз!
    @AfterClass
    public static void afterOrAnyHandleName(){
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
        assertThat (result,  is(32));       //Потому что значение User не обнулилось после первого теста!!
    }
    @Test
    public void whenStatusTrue(){
        user20.setStatus(true);
        assertTrue(user20.isStatus());
    }
}