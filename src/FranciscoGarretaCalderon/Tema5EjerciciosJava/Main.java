package FranciscoGarretaCalderon.Tema5EjerciciosJava;

public class Main {
    public static void main(String[] args) {

        CocheCRUD coche = new CocheCRUDImpl();

        coche.save();
        coche.findAll();
        coche.delete();

    }

}