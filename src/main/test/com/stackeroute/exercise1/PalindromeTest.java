package com.stackeroute.exercise1;

import org.junit.*;

import static org.junit.Assert.*;

public class PalindromeTest {
    Palindrome p;
@Before
public void setUp(){
     p=new Palindrome();
}
    @After
    public void tearDown(){
    p=null;
    }
    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Started Execution");
    }
    @AfterClass
    public static void tearDownAfterClass(){
        System.out.println("All Executed Successfully");
    }

    @Test
    public void givenOneNumberShouldReturnMessage(){
        String result=p.isPalindrome(2334);        //non palindrome number
        assertEquals("Failure",result);
    }


    @Test
    public void givenZeroShouldReturnFailureMessage(){
        String result=p.isPalindrome(0);         //0 as input
        assertEquals("Failure",result);
    }

    @Test
    public void givenNumberShouldReturnMessage(){
        String result=p.isPalindrome(12221);          //even though number is palindrome sum of the digits is less than 25
        assertEquals("Failure",result);
    }

    @Test
    public void givenPalindromeNumberShouldReturnMessage(){
        String result=p.isPalindrome(19991);          //sum of the numbers is greater than 25
        assertEquals("Success",result);
    }
}


