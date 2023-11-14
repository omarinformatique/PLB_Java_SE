package fr.plb.formation.demo.object;

public class Main {

    public static void main(String[] args) {
        Task t1 = new Task("Réviser la partie héritage");
        Task t2 = new Task("Revoir le projet Banque");
        Task t3 = new Task("Corriger le projet");

        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println(t3.toString());

    }
}
