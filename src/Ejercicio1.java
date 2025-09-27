import java.util.Scanner;

public class Ejercicio1 {
    /*
     * ## Ejercicio 1
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Definicion de variables
        float numberA;
        float numberB;

        System.out.println("**** Ejercicio 1 ****");
        System.out.println("---------------------");

        System.out.println("Ingresa dos numeros Reales: ");
        // Entrada de datos
        System.out.print("Ingresa el valor de a: ");
        numberA = sc.nextFloat();
        System.out.print("Ingresa el valor de b: ");
        numberB = sc.nextFloat();
        // Suma y Diferencia al NumberA ser mayor que el B
        if (numberA > numberB) {
            System.out.println("Suma: " + (numberA + numberB));
            System.out.println("Diferencia: " + (numberA - numberB));
        }
        if (numberA <= numberB) {
            System.out.println("Producto: " + (numberA * numberB));
            if (numberB == 0) {
                System.out.println("Division no definida (b es 0)");
            } else {
                System.out.println("División es: " + (numberA / numberB));
            }
        }
        sc.close();
    }
}
