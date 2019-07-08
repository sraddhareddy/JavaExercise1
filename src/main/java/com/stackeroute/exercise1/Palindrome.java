package com.stackeroute.exercise1;

import java.util.Scanner;

public class Palindrome {
    public String isPalindrome(int number) {
        int temp;
        String s1="Success";
        String s2="Failure";
        int add = 0;
        temp = number;           //storing number in temporary variable
        int sum = 0;
        while (number > 0) {
            int reminder = number % 10;
            number = number / 10;
            sum = sum * 10 + reminder;                   //reversing number
            if (reminder % 2 == 0) {
                add = add + reminder;
            }
        }
        if (sum == temp) {             //number reversed must be equal to original number
            if (add > 25) {
                return s1;
            } else {
                return s2;
            }
        } else {
           return s2;
        }
    }
}
