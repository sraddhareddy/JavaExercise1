package com.stackeroute.exercise1;

public class repeatingString {
    public String repeatString(String input1, int input2) {
        int len = input1.length();
        int i, j;
        String str = "";
        if (input2 < len) {
            for (i = len - input2; i <= (len - 1); i++) {  //starts from length-input2 since we need last characters of a string
                str = str + input1.charAt(i);
            }
            for (j = 1; j <= input2; j++) {
                input1 = input1 + str;               //concat those characters to the original string
            }
            return input1;
        } else {
            return "input2 should be less than length of input1";
        }
    }
}
