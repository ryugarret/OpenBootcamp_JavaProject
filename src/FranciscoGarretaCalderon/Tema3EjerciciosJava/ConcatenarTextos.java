package FranciscoGarretaCalderon.Tema3EjerciciosJava;

public class ConcatenarTextos {

    public static void main(String[] args) {

        String[] textos = {"Este programa", " al ejecutarse"," debería mostrar", " todos estos", " textos concatenados."};
        StringBuilder textoCompleto = new StringBuilder();

        for(String texto : textos) textoCompleto.append(texto);

        System.out.println(textoCompleto);

    }

}
