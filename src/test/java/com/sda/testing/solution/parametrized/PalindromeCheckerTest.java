package com.sda.testing.solution.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @ParameterizedTest
    @CsvSource({"słowo,false","anna,true","inne,false"})
    void isPalidromeTrue(String string, boolean expected){
        //when
        boolean actual=PalindromeChecker.isPalindrome(string);
        //then
        assertEquals(expected,actual);
    }

}