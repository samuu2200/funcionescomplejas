public class JuegoArrays {

    public static int[] getArrayRandom(int elementos) {
        // Definimos el tamaño del array
        int[] numerosArray = new int[elementos];
        for (int i = 0; i < numerosArray.length; i++) {
            numerosArray[i] = (int) (Math.random() * 100);
            System.out.println(numerosArray[i]);
        }
        System.out.println("=====");
        return numerosArray;
    }

    public static int sumarNumerosArray(int[] numerosArray) {
        // Recorremos el array y sumamos sus valores
        int suma = 0;
        for (int i = 0; i < numerosArray.length; i++) {
            suma += numerosArray[i];
        }
        return suma;
    }
}
