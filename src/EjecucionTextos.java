import java.util.Scanner;

public class EjecucionTextos {

    // Función que nos pasan un String y nos devuelve la suma
    public static void main(String[] args) {
        
        // Creamos la variable con el texto numérico para pasarselo como parametro al método
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un texto numérico: ");
        String textoNumerico = scan.nextLine();
        
        // Llamamos al método de la clase 
        int resultado = JuegoTextos.getSumaTexto(textoNumerico);
        System.out.println("La suma de "  + " es " + resultado);

        scan.close();
        
        /* ------------------------------------- */
        System.out.println("\n ===========================\n");

        //Numero ISBN 
        String numeroISBN = "8441513929";

        boolean respuesta = JuegoTextos.validarISBN(numeroISBN);

        if (!respuesta) {
            System.out.println("ISBN es INCORRECTO");
        } else {
            System.out.println("ISBN es CORRECTO");
        }
    
    }

}
