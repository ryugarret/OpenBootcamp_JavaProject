package FranciscoGarretaCalderon.Tema7a9EjerciciosJavaBasico.ProyectoLibre;

import java.util.HashMap;
import java.util.concurrent.ThreadLocalRandom;

public class Picaro extends Luchador{
    public Picaro(){}

    public Picaro(boolean jugador, String clase) {
        super(jugador, clase);
        this.velocidad = ThreadLocalRandom.current().nextInt(5, 10)  + 5;
        this.vida = ThreadLocalRandom.current().nextInt(10, 16);
        this.fuerza = ThreadLocalRandom.current().nextInt(14, 19);
        this.defensa = ThreadLocalRandom.current().nextInt(7, 10);
    }

    public void golpear(Luchador combatiente1, Luchador combatiente2, HashMap<String, Integer> marcador) {
        if (combatiente2.clase.equals("Lancero") && combatiente1.fuerza < 19) {
            combatiente1.fuerza += 5;
            if (combatiente1.jugador) {
                System.out.println("Ganas 5 de fuerza al enfrentarse a un Lancero");
            } else {
                System.out.println("El enemigo gana 5 de fuerza al enfrentarse a un Lancero");
            }
        }
        combatiente1.ofensiva = combatiente1.fuerza - combatiente2.defensa;
        if (combatiente1.ofensiva <= 0) combatiente1.ofensiva = 1;
        combatiente2.vida = combatiente2.vida - combatiente1.ofensiva;
        if (combatiente2.vida <= 0) combatiente2.vida = 0;
        if (combatiente1.jugador) {
            System.out.println("Tu ataque es " + combatiente1.fuerza + " y la defensa del enemigo es " + combatiente2.defensa + ".");
            System.out.println("Haces " + combatiente1.ofensiva + " de daño, ahora el enemigo tiene " + combatiente2.vida + " de vida.");
        } else {
            System.out.println("El ataque del enemigo es " + combatiente1.fuerza + " y tu defensa es " + combatiente2.defensa + ".");
            System.out.println("Te hacen " + combatiente1.ofensiva + " de daño, ahora tienes " + combatiente2.vida + " de vida.");
        }
        if (combatiente2.vida == 0) {
            if (combatiente1.jugador) {
                System.out.println("¡El enemigo cae derrotado, has ganado el combate!");
                marcador.put("Ganadas", marcador.get("Ganadas") + 1);
            } else {
                System.out.println("¡Caes derrotado, has perdido el combate!");
                marcador.put("Perdidas", marcador.get("Perdidas") + 1);
            }
        } else {
            combatiente2.golpear(combatiente2, combatiente1, marcador);
        }
    }
}