package ueb09.gf;

public class Zeichenprogramm {
	public static void main(String[] args) {
		// 1. Datenstruktur erstellen, welche die geometrischen Formen speichern soll
		Form[] fs = new Form[3];

		// 2. Je ein/en Kreis, Viereck und Dreieck erstellen, und in obige Struktur einfuegen
		fs[0] = new Kreis(5, 10, 5);
		fs[1] = new Rechteck(0, 0, 3, 2);
		fs[2] = new Dreieck(0, 0, 1, 0, 0, 1);

		// 3. Alle Formen mit `toString` auf der Konsole ausgeben.
		for (Form f : fs)
			System.out.println(f);
	}
}
