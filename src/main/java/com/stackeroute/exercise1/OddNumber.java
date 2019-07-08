package com.stackeroute.exercise1;

public class OddNumber {

    public String checkOdd(int number) {
        String s1="Tom";
        String s2="Jerry";
        if (number % 2 != 0) {               //check even or odd number
            if (number > 20 && number < 30) {
                return s1;
            }
        }
        else {
            if (number > 20 && number < 30) {       //if odd number
                return s2;
            }
        }
        return "none";
    }
}
