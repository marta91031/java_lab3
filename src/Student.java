public class Student {
    //a) Stworzyć publiczną klasę Student z 2-ma polami String, 1 polem int i 1 polem boolean,
    //klasa ma się znajdować w osobnym pliku Student.java

    String firstName;
    String lastName;
    int age;
    boolean scholarship;

    Student (String firstName, String lastName, int age, boolean scholarship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.scholarship = scholarship;
    }
}
