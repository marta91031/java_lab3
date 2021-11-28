import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /* ćw 3 klasy */

        /*  zad.1 - Najpierw należy uzupełnić kod w klasie Punkt.java,
            a) stworzyć objekt punktA typu Punkt,
            w konstruktorze zainicjować zmienną pX --> np. new Punkt(7), wykonać metodę punktA.toString();
            b) następnie ponownie wywopać konstruktor inicjalizujący wszystkie pola z klasy
            --> np. punkt = new Punkt(1, 2, 3);, wykonać metodę punktA.toString();
            c) nadpisać wartości pól z objektu punktA za pomocą setterów i
            ponownie wywołać metodę toString();
            d) wypisać wartości pól (za pomocą getterów),
            e) wywołać metody suma i róznica (obie wersje) z klasy punkt
        */

        Punkt punktA = new Punkt(7);
        System.out.println(punktA.toString());

        Punkt punktB = new Punkt(8,4,22);
        System.out.println(punktB.toString());

        punktA.setpX(6);
        punktA.setpY(1);
        punktA.setpZ(3);
        System.out.println(punktA.toString());

        System.out.println("Wartości za pomocą getterów: x=" + punktA.getpX() + ", y=" + punktA.getpY() + ", z=" + punktA.getpZ());

        System.out.println(punktA.suma());
        System.out.println(punktA.roznica());
        System.out.println(punktA.roznica(10,10,10));
    }
}
