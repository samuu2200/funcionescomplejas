import java.util.Scanner;

public class EjecucionArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Llamamos a la clase JuegoArray.getArrayRamdom
        int[] numerosArray = JuegoArrays.getArrayRandom(4);

        // Llamamos a la clase JuegoArray para que sume sus valores
        int suma = JuegoArrays.sumarNumerosArray(numerosArray);
        
        System.out.println(suma);
        scan.close();
    }

}
