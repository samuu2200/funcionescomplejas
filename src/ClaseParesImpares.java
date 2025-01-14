public class ClaseParesImpares {

    public static void getRangoNumeros(int inicio, int fin, boolean pares) {
        if (pares == true) {
            getNumerosPares(inicio, fin);
        } else {
            getNumerosImpares(inicio, fin);
        }
    }

    private static void getNumerosPares(int inicio, int fin) {
        //Bucle desde inicio hasta fin
        for (int i = inicio; i <= fin; i++) {
            //Preguntamos por los pares
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
            }
        }
    }

    private static void getNumerosImpares(int inicio, int fin) {
        //Bucle desde inicio hasta fin
        for (int i = inicio; i <= fin; i++) {
            //Preguntamos por los impares
            if (i % 2 != 0) {
                System.out.println("Impar: " + i);
            }
        }
    }

}
