package org.climoilou.vetm.formatif1;

public class Calculatrice {


    int Add(String nombres) {

        int result = 0;

        if (!nombres.isEmpty()) {
            for (int i = 0; i < nombres.length(); i++) {
                result += Integer.parseInt(String.valueOf(nombres.charAt(i)));
            }
        }

        return result;

    }
}
