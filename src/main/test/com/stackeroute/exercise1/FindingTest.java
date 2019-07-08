package com.stackeroute.exercise1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindingTest {
    Finding app;

    @Before
    public void setUp() {
        app = new Finding();
    }

    @After
    public void teardown() {
        app = null;
    }

    @Test
    public void givenTwoStringShouldVowels() {
        //arrange

        //act
        String result = app.vowelConsonant("nan");
        //assert
        assertEquals("ConsonantsVowelsConsonants", result);    //string input
    }
     @Test
         public void givenCharacterShouldReturnError(){
         String result=app.vowelConsonant("#");
         assertEquals("Error",result);                    //error condition
        }
    @Test
    public void  testSingleCharacterShouldReturnMessage(){
        String result=app.vowelConsonant("s");                 //consonant input
         assertEquals("Consonants",result);
    }
    @Test
    public void  testCharacterShouldReturnMessage(){
        String result=app.vowelConsonant("s");               //giving wrong expected and using assertNotEquals
        assertNotEquals("Vowels",result);
    }

}
