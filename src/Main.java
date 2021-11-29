import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        /* ćw 4 klasy */

        ArrayList <Student> students = new ArrayList<Student>();

        Osoba o1 = new Osoba ("Marta", "Kwiatkowska", 63834);
        Osoba o2 = new Osoba("Zuzanna", "Jabłońska", 47935);
        Osoba o3 = new Osoba("Harry", "Potter", 76543);
        Osoba o4 = new Osoba("Remigiusz", "Wojtkowiak", 74732);
        Osoba o5 = new Osoba("Anita", "Wołoszczyk", 73744);

        Student s1 = new Student(o1, WydzialEnum.Matematyki);
        Student s2 = new Student(o2, WydzialEnum.Ekonomii);
        Student s3 = new Student(o3, WydzialEnum.ETI);
        Student s4 = new Student(o4,WydzialEnum.Mechaniczny);
        Student s5 = new Student(o5, WydzialEnum.Oceanotechniki);

        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);
        students.add(s5);

        for (Student s:students) {
            System.out.println(s.toString());
            System.out.println("------------------------------------------");
        }


        /* zad.3
            a) W klasie Main stworzyć 5 różnych studentów, (można za pomocą tego samego objektu)
            b) dodać studentów do Listy ArrayList,
            c) przeiterować listę za pomocą pętli forEach wywołując na każdym objekcie metodę toString() (w każdej iteracji);
         */

    }
}
