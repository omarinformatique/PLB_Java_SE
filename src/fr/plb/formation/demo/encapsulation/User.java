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

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}
