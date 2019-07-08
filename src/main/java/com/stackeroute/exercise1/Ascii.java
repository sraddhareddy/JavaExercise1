package com.stackeroute.exercise1;

public class Ascii {
    public String findingCharacters(char character){

        if(character>=65 && character<=90){       //ASCII values of Capital letters
        return "Capital letter";
    }

        else if(character>=97 && character<=122){   //ASCII values of small letters
             return "small letter";
    }

        else if(character>=48 && character<=57){     //ASCII values of digits
            return "Digit";
    }
        else{                                        //reamining all are special symbols
         return "Special Symbol";
    }
}
}
