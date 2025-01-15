public class JuegoTextos {

    public static boolean validarISBN(String numeroISBN) {
        // Recorremos el String de números y sacamos su caracter
        int numISBN = 0;
        int suma = 0;
        for (int i = 0; i < numeroISBN.length(); i++) {
            // Recuperamos los caracteres del String
            char charNumero = numeroISBN.charAt(i);

            // Convertimo de char a String
            String textoISBN = String.valueOf(charNumero);

            // Pasamos el String a números
            numISBN = Integer.parseInt(textoISBN);

            // Multiplicamos el número ISBN por la posición que ocupa
            int resultadoMultiplicacion = numISBN * (i + 1);

            // Sumamas todos los resultados de la multiplicación
            suma += resultadoMultiplicacion;

        }

        System.out.println("El resultado de la multiplicación es: " + suma);

        // Dividimos el resultado entre 11 y si el resto da 0 es correcto
        if (suma % 11 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static int getSumaTexto(String texto) {

        // Creamos una variable letra que va almacenar los caracteres del String
        char letra = 0;
        int suma = 0;
        for (int i = 0; i < texto.length(); i++) {
            letra = texto.charAt(i);

            // Mostramos el resultado
            System.out.println(letra);

            // Convertir el char a String
            String numeroString = String.valueOf(letra);

            // Esta conversión primitiva primitiva recupera el valor ASCII del char que
            // estamos recorriendocle
            int numero = Integer.parseInt(numeroString);

            // Sumamaos los números
            suma += numero;

        }

        // Devolvemos la suma de los textos
        return suma;

    }

}
