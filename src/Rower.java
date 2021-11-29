public class Rower extends Pojazd {
    private boolean czyElektryczny;


    public Rower() {
        super();
        this.czyElektryczny = false;
    }

    public Rower(String kolor, int przebieg, int iloscKol) {
        super(kolor, przebieg, iloscKol);
        this.czyElektryczny = false;
    }

    public Rower(String kolor, int przebieg, int iloscKol, boolean czyElektryczny) {
        super(kolor, przebieg, iloscKol);
        this.czyElektryczny = czyElektryczny;
    }

    private String czyElektrycznyCheck (boolean czyElektryczny) {
        if (czyElektryczny)
            return "\nPosiada wspomaganie elektryczne.";
        else
            return "";
    }

    @Override
    public String toString() {
        return  "ROWER.\n"  +  super.toString() + czyElektrycznyCheck(czyElektryczny);
    }
}