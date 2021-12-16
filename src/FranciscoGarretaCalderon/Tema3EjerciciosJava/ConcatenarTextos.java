package FranciscoGarretaCalderon.Tema3EjerciciosJava;

public class ConcatenarTextos {

    public static void main(String[] args) {

        String[] textos = {"Este programa", "al ejecutarse","debería mostrar", "todos estos", "textos concatenados."};
        String textoCompleto = "";

        for(String texto : textos) textoCompleto = textoCompleto + " " + texto;

        System.out.println(textoCompleto);

    }

}
