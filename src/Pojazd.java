public class Pojazd {
    protected String kolor;
    protected int przebieg;
    protected int iloscKol;

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getIloscKol() {
        return iloscKol;
    }

    public void setIloscKol(int iloscKol) {
        this.iloscKol = iloscKol;
    }

    public Pojazd() {

    }

    public Pojazd(String kolor, int przebieg, int iloscKol) {
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.iloscKol = iloscKol;
    }

    @Override
    public String toString() {
        return "Kolor: " + kolor +
                "\nPrzebieg: " + przebieg +
                "\nIlość kół: " + iloscKol;
    }
}



