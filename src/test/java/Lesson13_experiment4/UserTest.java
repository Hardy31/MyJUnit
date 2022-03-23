package Lesson13_experiment4;

import Lesson13_Experiment.User;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;


public class UserTest {

    User user = new User(29,"Иван", 1500);
    @Test
    public void whenGrowThenAgeIncrement() {
//        User user = new User(29,"Bdfy", 1500);
        user.grow();
        final int  result = user.getAge();
        assertThat (result,  is(30));
    }

    @Test
    public void whenGrowThenDableAgeIncrement() {
//        User user = new User(29,"Bdfy", 1500);
        user.grow();
        user.grow();
        final int  result = user.getAge();
        assertThat (result,  is(31));
    }
    @Test
    public void whenStatusTrue(){
        user.setStatus(true);
        assertTrue(user.isStatus());
    }
}