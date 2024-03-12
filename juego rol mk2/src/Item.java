
public class Item {
    private String nombre;
    private String descripcion;

    public Item(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public String getnombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String toString() {
        return "" + this.nombre;
    }
}
