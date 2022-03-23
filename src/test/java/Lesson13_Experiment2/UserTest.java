package Lesson13_Experiment2;

import Lesson13_Experiment.User;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class UserTest {


    @Test
    public void whenGrowThenAgeIncrement() {
        User user = new User(29,"Bdfy", 1500);
        user.grow();
        final int  result = user.getAge();
        assertThat (result,  is(30));
    }


}