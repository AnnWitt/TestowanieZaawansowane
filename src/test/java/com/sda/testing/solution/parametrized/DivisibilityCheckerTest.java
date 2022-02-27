package com.sda.testing.solution.parametrized;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class DivisibilityCheckerTest {

    @ParameterizedTest(name = "run #{index} with [{arguments{]")// po kolei rozne wartosci
    @ValueSource(ints = {-3,-6,0,3,9,12,15,10,7}) //załatwia given
    void shouldBeDivisibleBy3(int number) {
        //when
        boolean actual = DivisibilityChecker.isDivisibleBy3(number);
        //then
        assertTrue(actual);
    }

    @ParameterizedTest(name = "run #{index} with [{arguments{]")// po kolei rozne wartosci
    @ValueSource(ints = {-3,-6,0,3,9,12,15,10,7}) //załatwia given
    void shouldNotBeDivisibleBy3(int number) {
        //when
        boolean actual = DivisibilityChecker.isDivisibleBy3(number);
        //then
        assertFalse(actual);
    }

    @ParameterizedTest
    @CsvSource({"0,true","1,false", "-3,true","3,false","-8, false"})
    void shouldCheckDivisibility(int number,boolean expected) {
        //when
        boolean actual = DivisibilityChecker.isDivisibleBy3(number);
        //then
       // assertEquals(np 7,actual);
        assertEquals(expected,actual);
    }

}