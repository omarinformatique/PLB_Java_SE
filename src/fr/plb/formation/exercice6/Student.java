package fr.plb.formation.exercice6;

public class Student {

    // Attributs
    String firstname;
    String lastname;
    float mark;
    int age;

    // Constructeur
    public Student(String firstname, String lastname, float mark, int age) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.mark = mark;
        this.age = age;
    }


    void display() {
        System.out.println(this.firstname + " " + this.lastname + " -->" + this.mark);
    }
}
