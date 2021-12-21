package FranciscoGarretaCalderon.Tema7a9EjerciciosJava;

import java.io.*;

public class InputStreamyPrintStream {

    public static void CopiarArchivo(String fileIn, String fileOut) throws IOException {

            InputStream entrada =  new FileInputStream(fileIn);
            byte[] datosdelarchivo = entrada.readAllBytes();
            PrintStream salida = new PrintStream(fileOut);
            salida.write(datosdelarchivo);

    }
}
