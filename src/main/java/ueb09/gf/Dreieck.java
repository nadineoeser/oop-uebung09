package ueb09.gf;

public class Dreieck extends Form {
	private int x1, y1, x2, y2;

	public Dreieck(int x0, int y0, int x1, int y1, int x2, int y2) {
		super(x0, y0);
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	public double[] seitenlaengen() {
		double[] sl = new double[3];

		int dx1 = x1 - getX();
		int dy1 = y1 - getY();
		sl[0] = Math.sqrt(dx1*dx1 + dy1*dy1);

		int dx2 = x2 - getX();
		int dy2 = y2 - getY();
		sl[1] = Math.sqrt(dx2*dx2 + dy2*dy2);

		int dx = x2 - x1;
		int dy = y2 - y1;
		sl[2] = Math.sqrt(dx*dx + dy*dy);

		return sl;
	}
	public String toString() {
		double[] sl = seitenlaengen();
		return "Dreieck an "
				+ "(" + getX() + ", " + getY() + "), "
				+ "(" + x1 + ", " + y1 + ") und "
				+ "(" + x2 + ", " + y2 + ") mit Seitenlängen "
				+ sl[0] + ", " + sl[1] + " und " + sl[2];
	}
}
