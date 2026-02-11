package org.climoilou.vetm.formatif1;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceTest {


    @Test
    public void givenEmptyString_whenAdd_thenReturnZero() {
        String numbers = "";
        Calculatrice calculatrice = new Calculatrice();

        int result = calculatrice.Add(numbers);

        assertEquals(0,result);

    }
    @Test
    public void givenTwoString_whenAdd_thenReturnTwo(){
        String numbers = "2";
        Calculatrice calculatrice = new Calculatrice();
        int result = calculatrice.Add(numbers);
        assertEquals(2,result);
    }

}