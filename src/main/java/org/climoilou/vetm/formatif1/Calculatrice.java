package org.climoilou.vetm.formatif1;

import java.util.Dictionary;
import java.util.List;

public class Calculatrice {


    final List<Character> dictionnaireSeparateur = List.of('\n');

    int Add(String... nombres) {

        int result = 0;
        String chaineNumber = "";
        char caractere = ' ';

        if (nombres != null) {
            for (int i = 0; i < nombres.length; i++) {
                for (int j = 0; j < nombres[i].length(); j++) {
                    caractere = nombres[i].charAt(j);
                    if (!dictionnaireSeparateur.contains(caractere)) {
                        chaineNumber = chaineNumber.concat(String.valueOf(caractere));
                    } else {
                        result += Integer.parseInt(chaineNumber);
                        chaineNumber = "";
                    }
                }
                result += Integer.parseInt(chaineNumber);
            }
        }
        return result;
    }
}
