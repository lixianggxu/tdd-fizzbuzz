package cn.xpbootcamp.fizzbuzz;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CountOffTest {

    @Test
    public void should_say_Fizz_for_multiple_of_3(){
        assertThat("Fizz").isEqualTo(new CountOff().checkCountOff(3));
        assertThat("Fizz").isEqualTo(new CountOff().checkCountOff(297));
    }

    @Test
    public void should_say_Buzz_for_multiple_of_5(){
        assertThat("Buzz").isEqualTo(new CountOff().checkCountOff(5));
        assertThat("Buzz").isEqualTo(new CountOff().checkCountOff(295));
    }

    @Test
    public void should_say_Whizz_for_multiple_of_7(){
        assertThat("Whizz").isEqualTo(new CountOff().checkCountOff(7));
        assertThat("Whizz").isEqualTo(new CountOff().checkCountOff(287));
    }

    @Test
    public void should_say_FizzBuzz_for_multiple_of_3_and_5(){
        assertThat("FizzBuzz").isEqualTo(new CountOff().checkCountOff(15));
        assertThat("FizzBuzz").isEqualTo(new CountOff().checkCountOff(300));
    }

    @Test
    public void should_say_FizzWhizz_for_multiple_of_3_and_7(){
        assertThat("FizzWhizz").isEqualTo(new CountOff().checkCountOff(21));
        assertThat("FizzWhizz").isEqualTo(new CountOff().checkCountOff(294));
    }

    @Test
    public void should_say_BuzzWhizz_for_multiple_of_5_and_7(){
        assertThat("BuzzWhizz").isEqualTo(new CountOff().checkCountOff(35));
        assertThat("BuzzWhizz").isEqualTo(new CountOff().checkCountOff(280));
    }

    @Test
    public void should_say_FizzBuzzWhizz_for_multiple_of_3_and_5_and_7(){
        assertThat("FizzBuzzWhizz").isEqualTo(new CountOff().checkCountOff(105));
        assertThat("FizzBuzzWhizz").isEqualTo(new CountOff().checkCountOff(210));
    }

    @Test
    public void should_say_ExptionNumber_for_multiple_larger_than_StudentSize_Or_Smaller_than_1(){
        assertThat("ExptionNumber").isEqualTo(new CountOff().checkCountOff(0));
        assertThat("ExptionNumber").isEqualTo(new CountOff().checkCountOff(CountOff.StudentSize+1));
    }

    @Test
    public void should_say_number(){
        assertThat("1").isEqualTo(new CountOff().checkCountOff(1));
    }
}
