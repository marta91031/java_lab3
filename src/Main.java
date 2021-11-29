import java.util.ArrayList;
import java.util.List;
import java.util.stream.StreamSupport;

public class Main {

    public static void main(String[] args) {
        /* ćw 5 Dziedziczenie */

        /* zad.1 Proszę wybrać dowolny temat budowania struktur klas np. samochody, dom, biblioteka, nauka, zabawki, kosmetyki, biuro podróży ... .
                 Będziemy budować podobną strukturę kodu jak w przykładzie 5,
            a) Proszę stworzyć układ klas dziedziczących po sobie,
            b) proszę użyć pól i metod protected jak i private,
            c) proszę stworzyć konstruktory, metody: toString(), settery i gettery,
            d) proszę używać super do wywołania konstruktorów i metod z klas nadrzędnych
            (można wygenerować je --> prawy przycisk myszki --> generate --> settery, gettery, ...),
            e) w klasie Main proszę stworzyć objekty podobnie jak w przykładzie 5,
            oraz stworzyć listę typu najbardziej generycznego np. List<Budynek>
         */

        Pojazd p1 = new Pojazd("fioletowy", 675445, 1);
        Samochod s1 = new Samochod("czerwony", 45335, 5);
        Rower r1 = new Rower("biały", 117, 3, true);
        Rower r2 = new Rower("niebieski", 787, 2);

        List <Pojazd> pojazdy = new ArrayList<Pojazd>();
        pojazdy.add(p1);
        pojazdy.add(s1);
        pojazdy.add(r1);
        pojazdy.add(r2);

        for (Pojazd poj:pojazdy) {
            System.out.println(poj.toString());
            System.out.println("--------------------");
        }
    }
}
