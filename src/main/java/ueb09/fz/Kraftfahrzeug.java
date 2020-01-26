package ueb09.fz;

public class Kraftfahrzeug extends Fahrzeug {

    private int ps;
    private int hubraum;
    private int tankvolumen;
    private int zulGesamtGewicht;

    public Kraftfahrzeug(String hersteller, String modell, Bremse[] bremsen, int ps, int hubraum, int tankvolumen, int zulGesamtGewicht) {
        super(hersteller, modell, bremsen);

        this.ps = ps;
        this.hubraum = hubraum;
        this.tankvolumen = tankvolumen;
        this.zulGesamtGewicht = zulGesamtGewicht;
    }

    public String toString() {
        return super.toString() + " "
                + ps + " PS, "
                + hubraum + " Hubraum, "
                + tankvolumen + " Tankvolumen, "
                + zulGesamtGewicht + " zul. Gesamtgewicht";
    }
}
