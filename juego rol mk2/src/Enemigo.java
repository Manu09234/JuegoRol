import java.util.Random;

public class Enemigo {
    private String nombre;
    private int experienciaorotga;

    public Enemigo(String nombre, int experienciaorotga) {
        this.nombre = nombre;
        this.experienciaorotga = experienciaorotga;
    }

    public String getnombre() {
        return this.nombre;
    }

    public int getExperienciaorotga() {
        return this.experienciaorotga;
    }

    public int atacar(Personaje personaje) {
        int daño = (new Random()).nextInt(3) + 1;
        if (personaje.getItem() != null) {
            switch (personaje.getItem().getnombre()) {
                case "Hacha":
                    if ((new Random()).nextInt(4) == 0) {
                        System.out.println("Personaje esquiva el ataque");
                        return 0;
                    }
                    break;
                case "Espada":
                    if ((new Random()).nextInt(2) == 0) {
                        System.out.println("Personaje esquiva el ataque");
                        return 0;
                    }
                    break;
                case "Daga":
                    if ((new Random()).nextInt(4) < 3) {
                        System.out.println("Personaje esquiva el ataque");
                        return 0;
                    }
            }
        } else {
            System.out.println("Personaje no tiene un objeto equipado para atacar.");
        }

        return daño;
    }
}
