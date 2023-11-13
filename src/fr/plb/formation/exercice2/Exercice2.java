package fr.plb.formation.exercice2;

import java.util.Scanner;

public class Exercice2 {

    public static void main(String[] args) {
        // Instanciation du scanner
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Entrez le prix hors taxes (en euros) : ");
        double prixHT = myScanner.nextDouble();

        System.out.print("Entrez le taux de TVA (en pourcentage) : ");
        double tauxTVA = myScanner.nextDouble() / 100.0;

        // Calcul du prix TTC
        double prixTTC = prixHT * (1 + tauxTVA);

        System.out.println("Le prix TTC de la paire de chaussures est : " + prixTTC + " euros");

        // Ferme le scanner
        myScanner.close();
    }
}
