public class Inventario {
    private final Item[] inv = new Item[10];
    private static final int capacidad = 10;
    Item itemequipado;
    public Inventario() {

    }


    public void añadirobjetosinventario(Item item) {
        boolean hasiodinsertado = false;
        int i = 0;

        while(!hasiodinsertado && i < this.inv.length) {
            if (this.inv[i] == null) {
                this.inv[i] = item;
                hasiodinsertado = true;
                Item var10001 = this.inv[i];
                System.out.println("Has introducido el/la " + var10001 + " al inventario ");
            } else {
                ++i;
            }
        }

    }

    public void listaritem() {
        for(int i = 0; i < this.inv.length; ++i) {
            if (this.inv[i] != null) {
                System.out.println(i + 1 + ". " + this.inv[i]);
            }
        }

        System.out.print("Elige un número de ítem para equipar: ");
    }

    public void equiparitem(int numero) {
        if (numero < 10) {
            itemequipado = this.inv[numero];
            System.out.println("Objeto equipado: " + itemequipado.getnombre());
        } else {
            System.out.println("Índice de objeto no válido");
        }

    }

    public Item getItemequipado() {
        return itemequipado;
    }
}
