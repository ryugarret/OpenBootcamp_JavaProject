package FranciscoGarretaCalderon.Tema7a9EjerciciosJava;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayList5y6 {

    public static void main(String[] args) {

        ArrayList<String> lista = new ArrayList<>();
        lista.add("Gominolas");
        lista.add("Pan");
        lista.add("Leche");
        lista.add("Papel de cocina");

        for (String nombre : lista) {
            System.out.println(nombre);
        }

        LinkedList<String> lista2 = new LinkedList<>(lista);

        for (String nombre : lista2) {
            System.out.println(nombre);
        }

        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            numeros.add(i+1);

        }

        for (int i = 0; i < numeros.size(); i++) {

            if (numeros.get(i)%2 == 0) {
                numeros.remove(i);
            }

        }

        for (int numero : numeros) {

            System.out.println(numero);
        }

    }

}
