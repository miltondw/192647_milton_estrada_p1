import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Variables
        int cantidadDevectores = 5;
        int[] vector1 = new int[cantidadDevectores];
        int[] vector2 = new int[cantidadDevectores];
        int[] vector3 = new int[cantidadDevectores];
        for (int i = 0; i < cantidadDevectores; i++) {
            System.out.printf("Ingresa %d para el vector 1 \n", (i + 1));
            vector1[i] = sc.nextInt();
        }
        for (int i = 0; i < cantidadDevectores; i++) {
            System.out.printf("Ingresa %d para el vector 2 \n", (i + 1));
            vector2[i] = sc.nextInt();
        }
        for (int i = 0; i < cantidadDevectores; i++) {
            vector3[i] = vector1[i] + vector2[i];
        }
        System.out.print("Vector 1: ");
        for (int i = 0; i < cantidadDevectores; i++) {
            System.out.print(vector1[i] + " ");
        }
        System.out.println("");
        System.out.print("Vector 2: ");
        for (int i = 0; i < cantidadDevectores; i++) {
            System.out.print(vector2[i] + " ");
        }
        System.out.println("");
        System.out.print("Vector 3: ");
        for (int i = 0; i < cantidadDevectores; i++) {
            System.out.print(vector3[i] + " ");
        }
        System.out.println("");

        sc.close();
    }
}
