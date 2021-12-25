package FranciscoGarretaCalderon.Tema3EjerciciosJavaBasico;

public class ConcatenarTextos {

    public static void main(String[] args) {

        String[] textos = {"Este programa", " al ejecutarse"," debería mostrar", " todos estos", " textos concatenados."};
        StringBuilder textoCompleto = new StringBuilder();

        for(String texto : textos) textoCompleto.append(texto);

        System.out.println(textoCompleto);

    }

}
