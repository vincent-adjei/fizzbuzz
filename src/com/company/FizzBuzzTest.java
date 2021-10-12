package com.company;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

class FizzBuzzTest {
    FizzBuzz fizzBuzz = new FizzBuzz();

    @Test
    void return_string_should_contain_fizz_when_input_is_greater_than_three() {
        //given
        int userInput = 4;
        String expectedOutput = "1, 2, fizz, 4";

        //when
        String output = fizzBuzz.fizzBuzz(userInput);

        //then
        assertEquals(expectedOutput, output);
    }

    @Test
    void return_string_should_contain_buzz_when_input_is_greater_than_five() {
        //given
        int userInput = 6;
        String expectedOutput = "1, 2, Fizz, 4, Buzz, Fizz";

        //when
        String output = fizzBuzz.fizzBuzz(userInput);

        //then
        assertEquals(expectedOutput, output);
    }

    @Test
    void return_string_should_contain_fizzbuzz_when_input_is_greater_than_fourteen() {
        //given
        int userInput = 15;
        String expectedOutput = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz";

        //when
        String output = fizzBuzz.fizzBuzz(userInput);

        //then
        assertEquals(expectedOutput, output);
    }

    @Test
    void return_string_should_contain_fizzbuzz_when_input_is_equal_to_thirty () {
        //given
        int userInput = 30;
        String expectedOutput = "1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz, 16, 17, Fizz, 19, Buzz, Fizz, 22, 23, Fizz, Buzz, 26, Fizz, 28, 29, FizzBuzz";

        //when
        String output = fizzBuzz.fizzBuzz(userInput);

        //then
        assertEquals(expectedOutput, output);
    }

    @Test
    void should_return_an_invalid_input_when_input_is_zero () {
        //given
        int userInput = 0;
        String expectedOutput = "Invalid Input";

        //when
        String output = fizzBuzz.fizzBuzz(userInput);

        //then
        assertEquals(expectedOutput, output);
    }
}