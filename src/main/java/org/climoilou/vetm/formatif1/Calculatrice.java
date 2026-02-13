package org.climoilou.vetm.formatif1;

import java.util.Dictionary;
import java.util.List;

public class Calculatrice {


    final List<Character> dictionnaireSeparateur = List.of('\n', ',', '/');
    char separateurDynamique;

    int Add(String... nombres) {

        for (int i = 0; i < nombres.length; i++) {
            for (int j = 0; j < nombres[i].length(); j++) {
                char caractere = nombres[i].charAt(j);
            }
        }
        int result = 0;
        String chaineNumber = "";
        char caractere = ' ';

        if (nombres != null) {
            int dernierIndexArray = nombres.length - 1;
            int dernierIndexSubArray = nombres[dernierIndexArray].length() - 1;
            char dernierCaractere;



            if (!nombres[dernierIndexArray].isEmpty()) {
                dernierCaractere = nombres[dernierIndexArray].charAt(dernierIndexSubArray);
                if (dictionnaireSeparateur.contains(dernierCaractere)) {
                    throw new RuntimeException("Chaine ne peut pas finir avec un separateur.");
                }

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
        }
        return result;
    }
}
