package com.stackeroute.exercise1;

public class Pattern {
    public String  printPattern(int number){
        int j;
        int k=0;
        String s1="";                           //resultant string to store
        for (int i = 1; i <= number; i++) {      //loop for number times to print all the numbers
            for (j = 1; j <= i;j++ ) {           //loop for number of times the number should print
                s1=s1+i+" ";
            }
        }
        return s1;
    }
}
