package fr.plb.formation.exercice7;

import java.util.Scanner;

public class BanqueInteractive {

    private Banque banque;
    private Scanner scanner;

    public BanqueInteractive(String banqueNom) {
        this.banque = new Banque(banqueNom);
        this.scanner = new Scanner(System.in);
    }

    public void lancer() {
        System.out.println("Quelle opération voulez-vous effectuer ?");
        System.out.println("1) Ajouter un client");
        System.out.println("2) Effectuer une opération sur un client");
        System.out.println("3) Afficher un bilan général");
        System.out.println("4) Quitter");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> interactionAjoutClient();
            case 2 -> interactionOperationClient();
            case 3 -> bilanGeneral();
            case 4 -> quitter();

        }
    }

    private void quitter() {
        // TODO
    }

    private void bilanGeneral() {
        // TODO
    }

    private void interactionOperationClient() {
        // TODO
    }

    private void interactionAjoutClient() {
        // TODO : pour demander à l’utilisateur le nom du nouveau client et pour l’ajouter
    }
}
