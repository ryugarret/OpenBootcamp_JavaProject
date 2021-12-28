package FranciscoGarretaCalderon.Tema7a9EjerciciosJavaBasico.ProyectoLibre;

import   java.util.HashMap;

public abstract class Luchador{

    boolean jugador;
    String clase;
    int velocidad;
    int vida;
    int fuerza;
    int defensa;
    int ofensiva;

    public Luchador() {}

    public Luchador(boolean jugador, String clase) {
        this.clase = clase;
        this.jugador = jugador;
    }

    public abstract void golpear(Luchador luchador, Luchador enemigo,  HashMap<String, Integer> marcador);
}