package org.climoilou.vetm.formatif1;

public class Calculatrice {
    int Add(String nombres) {
        int result = 0;
        char c = ' ';
        if (!nombres.isEmpty()) {
            for (int i = 0; i < nombres.length(); i++) {
                c = nombres.charAt(i);
                if (Character.isDigit(c)){
                    result += Character.getNumericValue(c);
                }
            }
        }
        return result;
    }
}
