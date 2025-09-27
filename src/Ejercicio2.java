import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // Definicion de variables
        int cantitadEstudiantes = 3;
        float[] notas = new float[cantitadEstudiantes];
        final int LONGITUD_NOTAS = notas.length;
        float Promocionado = 4.5f;
        float nota;
        float Regular = 4.5f;
        float Reprobado = 4.0f;
        float sumaDeNotas = 0f;
        float promedio = 0f;

        System.out.println("**** Ejercicio 2 ****");
        System.out.println("---------------------");
        for (int i = 0; i < LONGITUD_NOTAS; i++) {
            System.out.printf("Ingresa la nota %d con una escala entre 0.0 y 5.0: ", (i + 1));
            nota = sc.nextFloat();
            // **Validación:** cada nota debe estar en `[0.0, 5.0]`. Si alguna no lo está,
            // imprime `Nota invalida` y **termina** el ejercicio.
            if (nota > 5 && nota < 0) {
                System.out.println("Nota invalida");
                break;
            } else {
                notas[i] = nota;
                sumaDeNotas += nota;
            }
        }
        promedio = sumaDeNotas / cantitadEstudiantes;
        /*
         * * `Promocionado` si **promedio ≥ 4.5**
         * `Regular` si **4.0 ≤ promedio < 4.5**
         * `Reprobado` si **promedio < 4.0**
         */
        if (promedio >= Promocionado) {
            System.out.printf("Promocionado: %.2f%n", promedio);
        }
        if (promedio > Reprobado && promedio <= Regular) {
            System.out.printf("Regular: %.2f%n", promedio);

        }
        if (promedio < Reprobado) {
            System.out.printf("Reprobado: %.2f%n", promedio);
        }
        sc.close();

    }
}
