package org.climoilou.vetm.formatif1;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {

    Calculatrice calculatrice;
    final static String NUMBERS_EMPTY = "";
    final static int NUMBER_ZERO = 0;
    final static String ONE_NUMBER = "2";
    final static int NUMBER_TWO = 2;

    @BeforeEach
     void setUp() throws Exception {
        calculatrice = new Calculatrice();
    }

    @Test
    public void givenEmptyString_whenAdd_thenReturnZero() {

        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.Add(NUMBERS_EMPTY);

        assertEquals(NUMBER_ZERO, result);

    }

    @Test
    public void givenTwoString_whenAdd_thenReturnTwo() {

        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.Add(ONE_NUMBER);
        assertEquals(NUMBER_TWO, result);
    }

}