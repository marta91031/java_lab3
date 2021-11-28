import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        /* ćw 2 klasy */
        /* zad.1

            b) stworzyć 3 objekty klasy student i wstawić je do tablicy
            c) wyświetlić dane z tablicy, użyć pętli for lub forEach
            d) dane powinny być estetycznie przedstawione
         */

        Student [] students = new Student[3];
        students[0] = new Student("Katarzyna","Nowaczek", 21, true);
        students[1] = new Student("Mariola","Adamska", 22, false);
        students[2] = new Student("Mateusz","Kawowski", 21, false);

        for (Student s:students ) {
            System.out.print("Imię: " + s.firstName);
            System.out.print("\tNazwisko: " + s.lastName);
            System.out.print("\tWiek: " + s.age);
            if(s.scholarship)
                System.out.print("\tStypendium: TAK");
            else
                System.out.print("\tStypendium: NIE");
            System.out.println();
        }
    }
}
