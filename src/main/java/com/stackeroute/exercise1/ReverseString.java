package com.stackeroute.exercise1;

public class ReverseString {
    public String stringReverse(String original){
    String reverse="";

    int length=original.length();
        for(int i=length-1;i>=0;i--){      //reversing the string,so indexing starts from length-1
        char ch=original.charAt(i);
        reverse=reverse + ch;            //concat each character to produce the reverse
    }
        return reverse;
}
}
