package ueb09.gf;

public class Kreis extends Form {
    private int r;
    public Kreis(int x, int y, int r) {
        super(x, y);

        this.r = r;
    }

    public String toString() {
        return "Kreis um (" + getX() + ", " + getY() + ") mit Radius " + r;
    }
}
