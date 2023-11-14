package fr.plb.formation.exercice7;

public class Main {

    public static void main(String[] args) {

        Compte compte1 = new Compte(1, 1000);
        compte1.afficherSolde();

        Compte compte2 = new Compte(2);
        compte2.afficherSolde();

        compte1.virer(500, compte2);

        compte1.afficherSolde();
        compte2.afficherSolde();

    }
}
