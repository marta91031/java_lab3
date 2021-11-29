public class Student {
         /* zad.2
            a) Stworzyć klasę Student z polami prywatnymi
            - Osoba osoba,
            - WydzialEnum wydzial;
            b) stworzyć enum WydzialEnum (w nowym pliku) z kilkoma polami,
            c) stworzyc konstruktory, gettery i settery
            d) nadpisać metodę toString aby zwracała wszystkie elementy ładnie przedstawione :)
         */

    private Osoba osoba;
    private WydzialEnum wydzial;

    Student () {

    }

    Student (Osoba osoba, WydzialEnum wydzial) {
        this.osoba = osoba;
        this.wydzial = wydzial;
    }

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }

    public WydzialEnum getWydzial() {
        return wydzial;
    }

    public void setWydzial(WydzialEnum wydzial) {
        this.wydzial = wydzial;
    }

    @Override
    public String toString() {
        return  osoba.pokazDane() + "\nWydział: " + wydzial ;
    }
}

enum WydzialEnum {
    Mechaniczny, ETI, Ekonomii, Oceanotechniki, Matematyki
}



