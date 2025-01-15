public class JuegoArrays {

    public static int sumarNumerosArray(int[] numerosArray) {
        // Recorremos el array y sumamos sus valores
        int suma = 0;
        for (int i = 0; i < numerosArray.length; i++) {
            suma += numerosArray[i];
        }
        return suma;
    }
}
