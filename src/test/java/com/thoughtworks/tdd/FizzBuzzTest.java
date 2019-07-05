package com.thoughtworks.tdd;

import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class FizzBuzzTest {
    @Test
    void should_return_the_input_number() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(1), is("1"));
    }

    @Test
    void should_return_Fizz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(3), is("Fizz"));
    }

    @Test
    void should_return_Buzz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(5), is("Buzz"));
    }

    @Test
    void should_return_Whizz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(7), is("Whizz"));
    }

    @Test
    void should_return_FizzBuzz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(15), is("FizzBuzz"));
    }

    @Test
    void should_return_FizzWhizz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(21), is("FizzWhizz"));
    }

    @Test
    void should_return_BuzzWhizz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(35), is("BuzzWhizz"));
    }

    @Test
    void should_return_FizzBuzzWhizz() {
        FizzBuzzWhizz fbw = new FizzBuzzWhizz();
        assertThat(fbw.say(105), is("FizzBuzzWhizz"));
    }
}
