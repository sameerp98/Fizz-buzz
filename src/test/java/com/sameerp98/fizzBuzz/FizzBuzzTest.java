package com.sameerp98.fizzBuzz;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FizzBuzzTest {
    @Parameters(name = "convertFizzBuzz({0})-{1}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] { { 1, "1" }, { 2, "2" }, { 3, "Fizz" }, { 4, "4" }, { 5, "Buzz" },
                { 6, "Fizz" }, { 15, "FizzBuzz" } });
    }

    private int input;
    private Object output;

    public FizzBuzzTest(int input, Object expected) {
        this.input = input;
        this.output = expected;
    }

    @Test
    public void test() {
        assertEquals(output, FizzBuzz.convertToFizzBuzz(input));
    }
}