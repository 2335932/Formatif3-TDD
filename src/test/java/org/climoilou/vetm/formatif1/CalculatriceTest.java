package org.climoilou.vetm.formatif1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    private static final String MANY_NUMBERS = "1,2,3,4,5,6,7,8";
    private static final int MANY_NUMBERS_RESULT = 36;
    Calculatrice calculatrice;
    final static String NUMBERS_EMPTY = "";
    final static int NUMBER_ZERO = 0;
    final static String ONE_NUMBER = "2";
    final static int NUMBER_TWO = 2;
    final static String MULTIPLE_NUMBER = "2,1";
    final static int ADDITION_NUMBER = 3;

    @BeforeEach
     void setUp() throws Exception {
        calculatrice = new Calculatrice();
    }

    @Test
    public void givenEmptyString_whenAdd_thenReturnZero() {


        int result = calculatrice.Add(NUMBERS_EMPTY);

        assertEquals(NUMBER_ZERO, result);

    }

    @Test
    public void givenOneNumberString_whenAdd_thenReturnThisNumber() {
        int result = calculatrice.Add(ONE_NUMBER);

        assertEquals(NUMBER_TWO, result);
    }

    @Test
    public void givenTwoNumberString_whenAddTwoNumber_thenReturnSumOfTwoNumber(){
        int result = calculatrice.Add(MULTIPLE_NUMBER);

        assertEquals(ADDITION_NUMBER,result);
    }

    @Test
    public void givenAnyAmountOfNumericArgs_whenAdd_thenReturnSumOfAllNumericArgs(){
        int result = calculatrice.Add(MANY_NUMBERS);
        assertEquals(MANY_NUMBERS_RESULT, result);
    }
}