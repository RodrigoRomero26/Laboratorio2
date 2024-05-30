public class ClasificacionErrores {
    public static void main(String[] args) {
        int[] numeros = {1, 2, 3, 4, 5};
        System.out.println("El tercer elemento es: " + numeros[2]); // Error logico solucionado, el tercer elemento corresponde a la posicion 2
        String mensaje = "hola";
        System.out.println(mensaje.length()); // Error de ejecución solucionado, un mensaje null no tiene length

        for(int i = 0; i < numeros.length; i++) { // Error de ejecución solucionado, debe ser < a length no <=
            System.out.println("Número: " + numeros[i]);
        }
        int resultado = dividir(10, 2);
        System.out.println("Resultado de la división: " + resultado); // Error de ejecución solucionado, no se puede divir por 0

        System.out.println(saludo("Juan")); // Error de compilación, esta linea funciona sin cambiar nada
    }

    public static int dividir(int a, int b) {
        return a / b; // Error de ejecución solucionado, en los paramentros no deben haber 0
    }

    public static String saludo(String nombre) {
        return "Hola, " + nombre;
    }
}
