import java.util.Scanner;
public class EjecucionTabla {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Introduzca un número para la tabla de multiplicar: ");
        String entrada = scan.nextLine();
        int numero = Integer.parseInt(entrada);

        HerramientaTabla.mostrarTablaMultiplicar(numero);
        
        scan.close();
    }

}
