public class Samochod extends Pojazd {
    protected int ileDrzwi;

    public int getIleDrzwi() {
        return ileDrzwi;
    }

    public void setIleDrzwi(int ileDrzwi) {
        this.ileDrzwi = ileDrzwi;
    }

    public Samochod() {
        super();
    }

    public Samochod(String kolor, int przebieg, int ileDrzwi) {
        super(kolor, przebieg, ileDrzwi);
        this.ileDrzwi = ileDrzwi;
    }

    @Override
    public String toString() {
       return "SAMOCHOD.\n"  +  super.toString() + "\nIlość drzwi: " + ileDrzwi;
    }
}