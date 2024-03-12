
import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Enemigo enemigo = new Enemigo("Esqueleto", 1000);
        Scanner sc = new Scanner(System.in);
        new Random();
        Item daga = new Item("daga", "arma corta");
        Item espada = new Item("espada", "arma grande");
        Item hacha = new Item("hacha", "talar madera ");
        System.out.print("Introduce el nombre del jugador:");
        Personaje personaje = new Personaje(sc.next());
        personaje.añadirinventario(daga);
        personaje.añadirinventario(espada);
        personaje.añadirinventario(hacha);
        personaje.equiparItem(1);
        boolean mientrasnotermine = false;

        while(!mientrasnotermine) {
            System.out.print("Comienza el juego:");
            System.out.println("¿Que opcion quieres elegir?");
            System.out.println("1 - Para continuar la partida:");
            System.out.println("2 - Para añadir items al inventario:");
            System.out.println("3 - Para ver el inventario:");
            System.out.println("4 - Para equiparte un item:");
            System.out.println("5 - Para finalizar partida:");
            System.out.println("======================");
            int numero = sc.nextInt();
            int vidaPersonaje = 20;
            if (numero == 1) {
                    int vidaEnemigo = (new Random()).nextInt(6) + 1;
                    int dañoPersonaje = personaje.atacar();
                    vidaEnemigo -= dañoPersonaje;
                    if (vidaEnemigo <= 0) {
                        System.out.println("Enemigo derrotado");
                        personaje.experienciaañadida(25);
                        personaje.subirdenivelcoxp();
                        vidaPersonaje = 20;
                    }
                    int turno = 0;
                    while (!mientrasnotermine && vidaPersonaje > 0 && vidaEnemigo > 0){
                        turno++;
                    if (!mientrasnotermine && vidaPersonaje > 0) {
                        int dañoEnemigo = enemigo.atacar(personaje);
                        if (turno % 2 == 0){
                            Dado dado = new Dado();
                            dado.lanzar(4);
                            System.out.println("Personaje ataca con " + personaje.getItem().getnombre() + " y provoca " + dañoPersonaje + " puntos de daño");
                            vidaEnemigo-= dañoPersonaje;

                        }
                        else if (turno % 2 == 1){
                            System.out.println("Enemigo ataca y provoca " + dañoEnemigo + " puntos de daño");
                            if (!personaje.esquivar()){
                                vidaPersonaje -= dañoEnemigo;
                            }
                            else {
                                System.out.println("Personaje esquiva el ataque");
                            }

                        }


                        if (vidaPersonaje <= 0) {
                            System.out.println("Personaje derrotado. Fin del juego.");
                            mientrasnotermine = true;
                        } else if (vidaEnemigo <= 0) {
                            System.out.println("Enemigo derrotado.");
                        }
                        else {
                            System.out.println("Personaje tiene " + vidaPersonaje + " puntos de vida");
                            System.out.println("Enemigo tiene " + vidaEnemigo+ " puntos de vida");
                        }
                    }
                }
            } else if (numero == 2) {
                System.out.println("Introduce el nombre del objeto y la descripcion");
                personaje.añadirinventario(new Item(sc.next(), sc.next()));
            } else if (numero == 4) {
                System.out.println("Introduce un numero del inventario visto anteriormente en ver inventario para equiparte el objeto");
                personaje.equiparItem(sc.nextInt());
            } else if (numero == 3) {
                personaje.listaritems();
            } else if (numero == 5) {
                System.out.print("El juego a terminado");
                mientrasnotermine = true;
            }
        }

    }
}
