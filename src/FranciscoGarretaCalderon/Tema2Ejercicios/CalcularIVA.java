package FranciscoGarretaCalderon.Tema2Ejercicios;
import java.util.concurrent.ThreadLocalRandom;

public class CalcularIVA {

    public static void main(String[] args) {

        double precio = ThreadLocalRandom.current().nextDouble(0.05, 1500);
        System.out.format("El precio sin IVA es %.2f €\n", precio);
        total(precio);

    }

    static void total(double precio){

        double iva = precio * 0.21;
        double total = iva + precio;
        System.out.format("El precio total es %.2f €", total);

    }



}
