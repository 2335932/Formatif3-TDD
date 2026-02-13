package org.climoilou.vetm.formatif1;

public class Calculatrice {


    int Add(String... nombres) {

        int result = 0;
        char c = ' ';
        if (nombres != null) {
            for (int i = 0; i < nombres.length; i++) {
                for (int j = 0; j < nombres[i].length(); j++) {
                    c = nombres[i].charAt(j);
                    if (Character.isDigit(c)){
                        result += Character.getNumericValue(c);
                    }
                }
            }
        }
        return result;
    }
}
