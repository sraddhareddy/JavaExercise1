package com.stackeroute.exercise1;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.*;

public class OddNumberTest {
    OddNumber od;
    @Before
    public void setUp(){
        od=new OddNumber();
    }

    @Test
    public void givenNumberShouldReturnMessage(){
     String result=od.checkOdd(25);              //number is in between range
     assertEquals("Tom",result);
    }

    @Test
    public void givenNumberShouldReturnJerryMessage(){
        String result=od.checkOdd(26);              //number is within the range but even number
        assertEquals("Jerry",result);
    }

    @Test
    public void givenNumberShouldReturnNoneMessage(){
        String result=od.checkOdd(125);          //out of range
        assertEquals("none",result);
    }

    @Test
    public void givenNumberZeroShouldReturnMessage(){
        String result=od.checkOdd(0);            //if number is 0
        assertEquals("none",result);
    }

}