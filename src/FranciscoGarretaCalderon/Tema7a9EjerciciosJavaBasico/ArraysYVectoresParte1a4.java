package FranciscoGarretaCalderon.Tema7a9EjerciciosJavaBasico;

import java.util.Vector;

public class ArraysYVectoresParte1a4 {

    public static void main(String[] args) {

        int[] numeros = {5, 8, 32, 68, 14, 39};
        for (int numero : numeros) {
            System.out.println(numero);
        }

        int[][] numeros2D = {
                {2, 8, 5, 16, 32},
                {95, 86, 56, 35, 22}
        };

        for (int i = 0; i < numeros2D.length; i++) {
            for (int j = 0; j < numeros2D[i].length; j++) {
                System.out.format("El valor de i es: %s. El valor de j es: %s.\nEl valor asociado a dicha posición es: %s\n", i, j , numeros2D[i][j]);
            }
        }

        Vector<Integer> vectorcito = new Vector<>();
        vectorcito.add(1);
        vectorcito.add(2);
        vectorcito.add(3);
        vectorcito.add(4);
        vectorcito.add(5);
        vectorcito.remove(1);
        vectorcito.remove(2);
        System.out.println(vectorcito);

        /** Como hemos visto en las clases el uso de vectores para guardar información es muy útil,
         * no obstante presentan un problema importantisimo al usarse de manera incorrecta, si creasemos un vector
         * con capacidad por defecto, y quisiesemos añadir mil elementos al mismo, nos encontraríamos con un uso desmedido
         * de la memoria al tener que estar ampliando constantemente dicho vector, someteríamos al dispositivo que ejecuta
         * el programa a tener que copiar los datos del vector que está lleno al nuevo, ocupando memoria de forma doble o
         * inlcuso haciendo la ejecución del mismo mucho más lenta. En última instancia ésto puede dar lugar a
         * fallos por no poder reservar suficiente memoria para los procesos que se han de llevar a cabo y el fallo total
         * del programa en cuestión*/
    }
}