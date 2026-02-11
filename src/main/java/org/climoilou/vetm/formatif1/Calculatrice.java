package org.climoilou.vetm.formatif1;

public class Calculatrice {


     int Add(String nombres) {
        int result = 0;
        if (!nombres.isEmpty()) {
            result = Integer.parseInt(nombres);
        }
        return result;
    }


}
