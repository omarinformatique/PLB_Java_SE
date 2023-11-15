package fr.plb.formation.demo.encapsulation;

public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private int age;

    public User(Long id, String firstName, String lastName, int age) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void celebrateBirthDay() {
        this.age++;
    }

}
