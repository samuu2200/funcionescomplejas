import java.util.Scanner;

public class EjecucionParesImpares {



    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        System.out.println("Programa Pares Impares");
        System.out.println("Introduzca un Inicio");
        String entrada = scan.nextLine();
        int inicio = Integer.parseInt(entrada);

        System.out.println("Introduzca número Final");
        entrada = scan.nextLine();
        int fin = Integer.parseInt(entrada);

        ClaseParesImpares.getNumerosImpares(inicio, fin);

        ClaseParesImpares.getRangoNumeros(inicio, fin, true);
        ClaseParesImpares.getRangoNumeros(inicio, fin, false);
    }

}
