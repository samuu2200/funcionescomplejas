import java.util.Scanner;

public class EjecucionNumero {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("Conjetura de Collatz");
        System.out.println("Introduzca un número");
        String entrada = scan.nextLine();
        int numero = Integer.parseInt(entrada);

        HerramientasNumeros.mostrarCollatz(numero);

        scan.close();
    }


}
