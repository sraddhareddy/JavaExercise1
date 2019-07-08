package com.stackeroute.exercise1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AsciiTest {
    Ascii as;
    @Before
    public void setUp(){
        as=new Ascii();
    }
    @After
    public void tearDown(){
        as=null;
    }
    @Test
    //arrange
    public void testCharacterShouldReturnType(){
        //act
        String result=as.findingCharacters('f');      //small letter
        //assert
        assertEquals("small letter",result);
    }

    @Test
    public void testNumberShouldReturnDigit(){
        String result=as.findingCharacters('2');      //digit as input
        assertEquals("Digit",result);
    }

    @Test
    public void testSpaceShouldReturnSpecialSymbol(){
        String result=as.findingCharacters(' ');         //character space as input
        assertEquals("Special Symbol",result);
    }

    @Test
    public void testCapitalShouldReturnCapital(){        //capital letter
        String result=as.findingCharacters('S');
        assertEquals("Capital letter",result);
    }

}