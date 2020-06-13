package com.sameerp98.fizzBuzz;

public class FizzBuzz {

    public static boolean containsThree(int i) {
        boolean c = false;
        while (i > 0) {
            if (i % 10 == 3) {

                c = true;
            }
            i /= 10;
        }
        return c;
    }

    public static boolean containsFive(int i) {
        boolean c = false;
        while (i > 0) {
            if (i % 10 == 5) {
                c = true;
            }
            i /= 10;
        }
        return c;
    }

    public static String convertToFizzBuzz(int i) {
        if (i % 15 == 0) {
            return "FizzBuzz";
        }
        if (i % 3 == 0 || FizzBuzz.containsThree(i)) {
            return "Fizz";
        }
        if (i % 5 == 0 || FizzBuzz.containsFive(i)) {
            return "Buzz";
        }
        return Integer.toString(i);
    }
}