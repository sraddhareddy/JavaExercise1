package com.stackeroute.exercise1;

import java.util.Scanner;

public class UnspecificInput {
        public static void main(String[] args){
            Scanner scan=new Scanner(System.in);
            int sum=0;
            while (scan.hasNext() && (!("\n").equals(scan.hasNext()))) {   //giving numbers until user press enter
                sum = sum + scan.nextInt();

            }

            System.out.println(sum);
        }
    }

