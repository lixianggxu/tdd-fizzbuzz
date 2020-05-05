package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOffTest {

    @Test
    public void should_say_nothing_for_multiple_of_3(){
        assertThat("Fizz").isEqualTo(new CountOff().checkCountOff(3));
    }

    @Test
    public void should_say_nothing_for_multiple_of_5(){
        assertThat("Buzz").isEqualTo(new CountOff().checkCountOff(5));
    }

    @Test
    public void should_say_nothing_for_multiple_of_7(){
        assertThat("Whizz").isEqualTo(new CountOff().checkCountOff(7));
    }


}
