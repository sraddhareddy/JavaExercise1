package com.stackeroute.exercise1;

import java.util.Arrays;

public class SortingNumber {
    public String sortTheNumber(int number){
        int temp=number;
        int r,rem;
        int c=0,even=0,i=0,sorted=0;
        while(number>0){
            r=number%10;
            number=number/10;                //counting number of digits in a number
            c=c+1;
        }
        int array[]=new int[c];
        while(temp>0){
            rem=temp%10;
            if(rem%2==0){
                even=even+rem;            //adding even digits
            }
            temp=temp/10;
            array[i]=rem;               //storing those digits in array
            i++;
        }
        Arrays.sort(array);            //sorting using Arrays method
        for(int j=0;j<c;j++){
            sorted=sorted*10+array[j];
        }
        if(even>15){
          return "True";
        }
        else{
            return "False";
        }
    }
    }

