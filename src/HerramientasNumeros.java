public class HerramientasNumeros {

    public static void mostrarCollatz(int numero) {

        while (numero != 1) {
            //String mensaje = getMensajeCollatz(numero);
            //System.out.print(mensaje);
            int num = getNumeroCollatz(numero);
            System.out.println(num);
        }
        
    }

    //Creamos un método private que nos devolverá un mensaje
    private static String getMensajeCollatz(int numero) {
        String mensaje = "";
        if (numero % 2 == 0) {
            //Dividimos entre 2
            numero = numero / 2;
            mensaje = "Par: " + numero;
            
        } else {
            //Multiplicamos * 3 + 1
            numero = numero * 3 + 1;
            mensaje = "Impar: " + numero;
        }

        return mensaje;
    }

    //Creamos un método private que nos devolverá un número
    private static int getNumeroCollatz(int numero) {
        if (numero % 2 == 0) {
            //Dividimos entre 2
            numero = numero / 2;
        } else {
            //Multiplicamos * 3 + 1
            numero = numero * 3 + 1;
        }

        return numero;
    }
    

}
