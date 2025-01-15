public class HerramientaTabla {

    public static void mostrarTablaMultiplicar(int numero) {

        for (int i = 1; i <= 10; i++) {
            //Podemos representar todos los formatos
            HerramientaTabla.getMensajeTabla(numero, i, "x");
            HerramientaTabla.getMensajeTabla(numero, i, "*");
            HerramientaTabla.getMensajeTabla(numero, i, "por");

        }
    }

    private static String getMensajeTabla(int num, int multi, String sep) {
        int operacion = num * multi;
        return num + sep + multi + "=" + operacion;
    }

}
