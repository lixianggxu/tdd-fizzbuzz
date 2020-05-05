package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOffTest {

    @Test
    public void should_say_Fizz_for_multiple_of_3(){
        assertThat("Fizz").isEqualTo(new CountOff().checkCountOff(3));
    }

    @Test
    public void should_say_Buzz_for_multiple_of_5(){
        assertThat("Buzz").isEqualTo(new CountOff().checkCountOff(5));
    }

    @Test
    public void should_say_Whizz_for_multiple_of_7(){
        assertThat("Whizz").isEqualTo(new CountOff().checkCountOff(7));
    }

    @Test
    public void should_say_FizzBuzz_for_multiple_of_3_and_5(){
        assertThat("FizzBuzz").isEqualTo(new CountOff().checkCountOff(15));
    }

    @Test
    public void should_say_FizzWhizz_for_multiple_of_3_and_7(){
        assertThat("FizzWhizz").isEqualTo(new CountOff().checkCountOff(21));
    }
}
