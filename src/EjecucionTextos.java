import java.util.Scanner;

public class EjecucionTextos {

    public static void main(String[] args) {
        
        // Creamos la variable con el texto numérico para pasarselo como parametro al método
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce un texto numérico: ");
        String textoNumerico = scan.nextLine();
        
        // Llamamos al método de la clase 
        int resultado = JuegoTextos.getSumaTexto(textoNumerico);
        System.out.println("La suma de "  + " es " + resultado);

        scan.close();
    }

}
