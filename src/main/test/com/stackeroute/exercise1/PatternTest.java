package com.stackeroute.exercise1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PatternTest {
    Pattern p;
    @Before
    public void setUp(){
        p=new Pattern();
    }
   @Test
    public void givenNumberShouldReturnPattern(){
        String result=p.printPattern(2);
        assertEquals("1 2 2",result.trim());
   }
   @Test
    public void givenZeroShouldReturnNothing(){
        String result=p.printPattern(0);        //what if number is 0
        assertEquals("",result);
   }
    @Test
    public void testNumberShouldReturnPattern(){
        String result=p.printPattern( 5);
        assertEquals("1 2 2 3 3 3 4 4 4 4 5 5 5 5 5",result);
    }
}