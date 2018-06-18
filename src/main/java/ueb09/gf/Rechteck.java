package ueb09.gf;

public class Rechteck extends Form {
	private int breite;
	private int hoehe;

	public Rechteck(int x, int y, int breite, int hoehe) {
		super(x, y);

		this.breite = breite;
		this.hoehe = hoehe;
	}

	public String toString() {
		return "Rechteck (" + getX() + ", " + getY() + ") bis "
				+ "(" + (getX() + breite) + ", " + (getY() + hoehe) + ") "
				+ " mit Breite " + breite + " und Höhe " + hoehe;
	}
}
