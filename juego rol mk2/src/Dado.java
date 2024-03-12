import java.util.Random;

public class Dado {
    private Random lanzar;

    public Dado() {
        this.lanzar = new Random();
    }

    public int lanzar(int caras) {
        return lanzar.nextInt(caras) + 1;
    }
}
