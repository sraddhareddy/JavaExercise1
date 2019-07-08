package com.stackeroute.exercise1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class repeatingStringTest {
    repeatingString rs;
    @Before
    public void setUp(){
        rs=new repeatingString();
    }
    @After
    public void tearDown(){
        rs=null;
    }
    @Test
    public void givenStringIntegerShouldReturnRepeatedOutput(){
        String result=rs.repeatString("sraddhareddy",5);
        assertEquals("sraddhareddyreddyreddyreddyreddyreddy",result);

    }

    @Test
    public void givenStringIntegerShouldReturnOutput(){            //input2 is greater than the length of the string
        String result=rs.repeatString("sra",4);
        assertEquals("String index out of range","input2 should be less than length of string",result);

    }
    @Test
    public void givenNullIntegerShouldReturnMessage(){
        String result=rs.repeatString(" ",4);
        assertEquals("String index out of range","input2 should be less than length of string",result);

    }


}