public class JuegoTextos {

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

            // Esta conversión primitiva primitiva recupera el valor ASCII del char que estamos recorriendocle
            int numero = Integer.parseInt(numeroString);

            //Sumamaos los números
            suma += numero;

        }
        
        //Devolvemos la suma de los textos
        return suma;
        
    }

}
