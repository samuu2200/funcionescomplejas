import java.util.Scanner;

public class EjecucionArrays {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Definimos el tamaño del array
        int[] numerosArray = new int[3];

        // Recorremos el array para agregarles un valor
        for (int i = 0; i < numerosArray.length; i++) {
            System.out.print("Introduce los valores del array: ");
            numerosArray[i] = scan.nextInt();
        }

        // Llamamos a la clase JuegoArray para que sume sus valores
        int sumaArray = JuegoArrays.sumarNumerosArray(numerosArray);
        
        System.out.println(sumaArray);
        scan.close();
    }

}
