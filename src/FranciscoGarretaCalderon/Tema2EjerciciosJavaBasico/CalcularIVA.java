package FranciscoGarretaCalderon.Tema2EjerciciosJavaBasico;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;

public class CalcularIVA {

    public static void main(String[] args) {

        double precioAleatorio = ThreadLocalRandom.current().nextDouble(0.05, 1500);
        BigDecimal precio = new BigDecimal(precioAleatorio);

        System.out.format("El precio sin IVA es %.2f €\n", precio);
        total(precio);

    }

    static void total(BigDecimal precio){

        double ivadouble = 0.21f;
        BigDecimal porcientoDeIva = new BigDecimal(ivadouble);

        BigDecimal iva = precio.multiply(porcientoDeIva);
        BigDecimal total = iva.add(precio);
        System.out.format("El IVA es %.2f €\n", iva);
        System.out.format("El precio total es %.2f €", total);

    }



}