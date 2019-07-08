package com.stackeroute.exercise1;

public class Finding {

    public  String vowelConsonant(String s)
    {
        String result="";
        for(int i=0;i<s.length();i++)
        {
            char  c=s.charAt(i);
            if( (c >= 'a' && c<= 'z') || (c >= 'A' && c<= 'Z'))        //checking for character or not
            {
                if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||      //checking vowel or not
                        c=='I'||c=='O'||c=='U')
                {
                    result+= "Vowels";
                }
                else
                {
                    result+= "Consonants";                              //if not vowels return as consonants
                }

            }
            else
            {
                result+="Error";                        //if input is not a character return error message
            }

        }
        return result;
    }
        }// class


