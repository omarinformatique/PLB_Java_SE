package fr.plb.formation.demo.object;

public class Main {

    public static void main(String[] args) {
        Task t1 = new Task(1L, "Réviser la partie héritage");
        Task t2 = new Task(2L,"Revoir le projet Banque");
        Task t3 = new Task(3L, "Corriger le projet");
        Task t4 = new Task(1L, "Réviser la partie héritage");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);


        // Compare les références mémoires DONC différentes
        System.out.println(t1 == t4); // Affichera certainement FAUX

        // Compare l'égalité entre les objets ( méthode equals() )
        System.out.println(t1.equals(t4));

    }
}
