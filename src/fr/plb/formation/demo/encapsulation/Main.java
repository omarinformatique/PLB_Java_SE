package fr.plb.formation.demo.encapsulation;

public class Main {

    public static void main(String[] args) {
        User u1 = new User(1L, "John", "D", 30);
        u1.setLastName("DOE");

        System.out.println(u1.getLastName());
    }
}
