package ueb09.fz;

import sun.jvm.hotspot.oops.BranchData;

public class Motorrad extends Kraftfahrzeug {

	public Motorrad(String hersteller, String modell, int ps, int tankvolumen) {
		super(hersteller, modell, new Bremse[] {
				new Scheibenbremse(),
				new Scheibenbremse()
		}, ps, 0, tankvolumen, 100);
	}

	public void anlassen() {
		System.out.println("Starte Motor...");
	}
}
