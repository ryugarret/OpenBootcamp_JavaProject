package FranciscoGarretaCalderon.Tema7a9EjerciciosJavaBasico;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        System.out.println("Introduce un texto a invertir");
        Scanner sc = new Scanner(System.in);
        String texto = sc.nextLine();
        System.out.println(reverse(texto));

    }

    public static String reverse(String texto) {

        char[] preReverso = texto.toCharArray();
        StringBuilder postReverso = new StringBuilder();
        for (int i = preReverso.length - 1; i >= 0; i--) {
            postReverso.append(preReverso[i]);
        }

        return postReverso.toString();

    }



}
