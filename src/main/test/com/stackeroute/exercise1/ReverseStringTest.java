package com.stackeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseStringTest {
ReverseString rs;
    @Before
    public void set(){
        rs=new ReverseString();
    }
    @After
    public void tear(){
        rs=null;
    }
    @Test
    public void givenStringShouldReturnReversedString(){
        String result=rs.stringReverse("sraddha");
        assertEquals("ahddars",result);
    }
    @Test
    public void givenSentenceWithSpaceString() {
        String result=rs.stringReverse("hello world");
        assertEquals("dlrow olleh",result);
    }
    @Test
    public void testSpaceString() {
        String result=rs.stringReverse("  ");
        assertEquals("  ",result);
    }


}