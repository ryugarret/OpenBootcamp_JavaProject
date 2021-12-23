package FranciscoGarretaCalderon.Tema7a9EjerciciosJava.ProyectoLibre;

import java.io.*;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MiniJuego {

    public static void main(String[] args) {


        String[] comandos = {"jugar", "ayuda", "marcador", "cargar partida", "guardar partida", "hablame de ti", "salir"};
        boolean inputEsComando;
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> marcador = new HashMap<> ();
        marcador.put ("Ganadas", 0);
        marcador.put ("Perdidas", 0);
        boolean loop = true;


        System.out.println("Bienvenido, escribe jugar para comenzar o ayuda para más información");

        while (loop) {

            System.out.println("Elige tu siguiente acción");
            String comandoActual = sc.nextLine();
            inputEsComando = false;

            for (String comando : comandos) {

                if (comandoActual.equalsIgnoreCase(comando)) {

                    inputEsComando = true;
                    break;

                }

            }

            if (inputEsComando) {

                if (comandoActual.equalsIgnoreCase("ayuda")) {

                    System.out.println("Los comandos que puedes usar son:\nJugar: Te permite echar una partida.");
                    System.out.println("Ayuda: Te enseña este mensaje, un poco obvio, ¿no?\nCargar partida: Lee un archivo txt con una partida guardada.");
                    System.out.println("Guardar partida: te permite guardar tus estadísticas en un archivo txt");
                    System.out.println("Hablame de ti: Te cuento cosas sobre mi ^-^\nSalir: Te permite finalizar el programa y dejar de jugar. ¡Recuerda guardar partida antes!");

                } else if (comandoActual.equalsIgnoreCase("jugar")) {

                    boolean enCombate = true;

                    while(enCombate) {

                        System.out.println("Elige uno de los luchadores.\nCazador\nGuerrero\nLancero\nPícaro");
                        String luchador = sc.nextLine();

                        if (luchador.equalsIgnoreCase("Cazador")) {

                            Cazador pjJugador = new Cazador(true, "Cazador");
                            int claseEnemigo = ThreadLocalRandom.current().nextInt(1, 5);
                            if (claseEnemigo == 1) {

                                Cazador pjEnemigo = new Cazador(false, "Cazador");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 2) {

                                Guerrero pjEnemigo = new Guerrero(false, "Guerrero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 3) {

                                Lancero pjEnemigo = new Lancero(false, "Lancero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else {

                                Picaro pjEnemigo = new Picaro(false, "Pícaro");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            }

                            enCombate = false;

                        } else if (luchador.equalsIgnoreCase("Guerrero")) {

                            Guerrero pjJugador = new Guerrero(true, "Guerrero");
                            int claseEnemigo = ThreadLocalRandom.current().nextInt(1, 5);
                            if (claseEnemigo == 1) {

                                Cazador pjEnemigo = new Cazador(false, "Cazador");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 2) {

                                Guerrero pjEnemigo = new Guerrero(false, "Guerrero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 3) {

                                Lancero pjEnemigo = new Lancero(false, "Lancero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else {

                                Picaro pjEnemigo = new Picaro(false, "Pícaro");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            }

                            enCombate = false;

                        } else if (luchador.equalsIgnoreCase("Lancero")) {

                            Lancero pjJugador = new Lancero(true, "Lancero");
                            int claseEnemigo = ThreadLocalRandom.current().nextInt(1, 5);
                            if (claseEnemigo == 1) {

                                Cazador pjEnemigo = new Cazador(false, "Cazador");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 2) {

                                Guerrero pjEnemigo = new Guerrero(false, "Guerrero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 3) {

                                Lancero pjEnemigo = new Lancero(false, "Lancero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else {

                                Picaro pjEnemigo = new Picaro(false, "Pícaro");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            }

                            enCombate = false;

                        } else if (luchador.equalsIgnoreCase("Picaro") || luchador.equalsIgnoreCase("Pícaro")) {

                            Picaro pjJugador = new Picaro(true, "Pícaro");
                            int claseEnemigo = ThreadLocalRandom.current().nextInt(1, 4);
                            if (claseEnemigo == 1) {

                                Cazador pjEnemigo = new Cazador(false, "Cazador");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 2) {

                                Guerrero pjEnemigo = new Guerrero(false, "Guerrero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 3) {

                                Lancero pjEnemigo = new Lancero(false, "Lancero");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            } else if (claseEnemigo == 4) {

                                Picaro pjEnemigo = new Picaro(false, "Pícaro");

                                if (pjJugador.velocidad >= pjEnemigo.velocidad) {

                                    pjJugador.golpear(pjJugador, pjEnemigo, marcador);

                                } else {

                                    pjEnemigo.golpear(pjEnemigo, pjJugador, marcador);

                                }

                            }

                            enCombate = false;

                        }

                    }

                } else if (comandoActual.equalsIgnoreCase("marcador")) {

                    System.out.println("Este es tu marcador\n" + marcador + "\n");

                } else if (comandoActual.equalsIgnoreCase("cargar partida")) {

                    boolean cargandoPartida = true;

                    while (cargandoPartida) {

                        System.out.println("Introduce la ruta completa del archivo de guardado, para cancelar escribe salir");
                        String linea;
                        InputStream archivo;
                        BufferedReader datos;
                        String direccionArchivo = sc.nextLine();
                        if (direccionArchivo.equalsIgnoreCase("salir")) break;

                        try {

                            archivo = new FileInputStream(direccionArchivo);
                            datos = new BufferedReader(new InputStreamReader(archivo));

                            while ((linea = datos.readLine()) != null) {

                                String[] partes = linea.split(":", 2);

                                if (partes.length >= 2) {

                                    String key = partes[0];
                                    int value = Integer.parseInt(partes[1]);
                                    marcador.put(key, value);

                                } else {

                                    System.out.println("Ignorando linea: " + linea);

                                }
                            }

                            cargandoPartida = false;
                            System.out.println("¡Partida cargada con exito!");

                        } catch (IOException e) {

                            System.out.println("Error: " + e.getMessage());

                        }


                    }

                } else if (comandoActual.equalsIgnoreCase("guardar partida")) {

                        PrintStream archivo;

                    try {

                        String datos = "Ganadas:" + marcador.get("Ganadas") + "\nPerdidas:" + marcador.get("Perdidas") ;
                        archivo = new PrintStream("ArchivoDeGuardado.txt");
                        archivo.append(datos);

                    } catch (IOException e) {

                        System.out.println("Error: " + e.getMessage());

                    }

                    System.out.println("¡Partida guardada con exito!\nEl archivo de guardado está en: " + System.getProperty("user.dir"));

                } else if (comandoActual.equalsIgnoreCase("hablame de ti")) {

                    System.out.println();

                    try {

                        InputStream historiaDelJuego = new FileInputStream("src/FranciscoGarretaCalderon/Tema7a9EjerciciosJava/ProyectoLibre/etc/Historia del juego.txt");
                        BufferedInputStream historiaAMemoria = new BufferedInputStream(historiaDelJuego);

                        try{

                            int caracter = historiaAMemoria.read();
                            while (caracter != -1) {

                                System.out.print((char)caracter);
                                caracter = historiaAMemoria.read();

                            }

                            System.out.println();

                        } catch (IOException e) {

                            System.out.println("Error: " + e.getMessage());

                        }

                    } catch (IOException e) {

                        System.out.println("Error: " + e.getMessage());

                    }

                } else if (comandoActual.equalsIgnoreCase("salir")) {

                    loop = false;

                }

            }

        }

        System.out.println("Gracias por jugar ^-^");

    }

}