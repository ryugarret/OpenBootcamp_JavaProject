package FranciscoGarretaCalderon.Tema7a9EjerciciosJavaBasico;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Dividirporcero {

    public static void DividePorCero(int a, int b) throws ArithmeticException {

        System.out.println((double) a / b);

    }

    public static void main(String[] args) {

        boolean comprobante = false;
        int uno = 0;
        int dos = 0;

        while (!comprobante) {

            System.out.println("Introduce dos números enteros");
            Scanner sc = new Scanner(System.in);

            try {

                uno = sc.nextInt();
                dos = sc.nextInt();
                comprobante = true;

            } catch (InputMismatchException e) {

                System.out.println("¡Hay que introducir números enteros!");

            }

            sc.reset();

        }

        try {

            DividePorCero(uno,dos);

        } catch (ArithmeticException e) {

            System.out.println("Esto no puede hacerse");

        } finally {

            System.out.println("Demo de código");

        } 



    }


}
