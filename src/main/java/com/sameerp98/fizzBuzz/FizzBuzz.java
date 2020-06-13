package com.sameerp98.fizzBuzz;

public class FizzBuzz {

    public static String convertToFizzBuzz(int i) {
        if (i % 3 == 0) {
            return "Fizz";
        }
        if (i % 5 == 0) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
}