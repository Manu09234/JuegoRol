//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Personaje {
    private String nombre;
    int nivel;
    int experienciaacumulada;
    Inventario inventario;
    Item item;
    Enemigo enemigo;
    Dado dado;

    public Personaje(String nombre) {
        this.nombre = nombre;
        this.nivel = 1;
        this.experienciaacumulada = 0;
        this.item = null;
        this.inventario = new Inventario();
        this.dado = new Dado();
    }

    public String getnombre() {
        return this.nombre;
    }

    public Item getItem() {
        return inventario.itemequipado;
    }

    public int getnivel() {
        return this.nivel;
    }

    public int getExperienciaacumulada() {
        return this.experienciaacumulada;
    }

    public void experienciaañadida(int cantidad) {
        this.experienciaacumulada += cantidad;
    }

    public void subirdenivel() {
        ++this.nivel;
    }

    public void añadirinventario(Item item) {
        this.inventario.añadirobjetosinventario(item);
    }

    public void listaritems() {
        this.inventario.listaritem();
    }

    public void equiparItem(int numero) {
        inventario.equiparitem(numero);
    }

    public void luchar(Enemigo enemigo) {
        this.experienciaacumulada += enemigo.getExperienciaorotga();
        this.subirdenivelcoxp();
    }

    public void subirdenivelcoxp() {
        int almacen = 0;
        int experienciaasubir = 100;
        int nivelasubir = (this.experienciaacumulada + almacen) / experienciaasubir;
        almacen = (this.experienciaacumulada + almacen) % experienciaasubir;
        this.nivel += nivelasubir;
    }

    public int atacar() {
        int daño = 0;
        if (getItem() != null) {
            switch (getItem().getnombre()) {
                case "hacha":
                    daño = (int) (Math.random() * 6) + 1;
                    System.out.println("Personaje ataca con hacha y provoca " + daño + " puntos de daño");
                    break;
                case "espada":
                    daño = (int) (Math.random() * 4) + 1;
                    System.out.println("Personaje ataca con espada y provoca " + daño + " puntos de daño");
                    break;
                case "daga":
                    daño = (int) (Math.random() * 2) + 1;
                    System.out.println("Personaje ataca con daga y provoca " + daño + " puntos de daño");
                    break;
            }
        }
        return daño;
    }
    public boolean esquivar() {
        int lanzamiento = dado.lanzar(4);
        String tipoArma = getItem().getnombre();

        switch (tipoArma) {
            case "hacha":
                return (lanzamiento == 1);
            case "espada":
                return (lanzamiento == 2);
            case "daga":
                return (lanzamiento == 3);
            default:
                System.out.println("Tipo de arma no reconocido: " + tipoArma);
                return false;
        }
    }




}
