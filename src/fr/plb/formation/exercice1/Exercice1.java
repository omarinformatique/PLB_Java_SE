package fr.plb.formation.exercice1;

public class Exercice1 {

    public static void main(String[] args) {
        //Écrire un programme qui calcule le TTC d'une paire de chaussures à 56 euros HORS TAXE
        double prixHT = 56.0; // Prix hors taxes en euros
        double tauxTVA = 0.20; // Taux de TVA (20%)

        // Calcul du prix TTC
        double prixTTC = prixHT * (1 + tauxTVA);

        // Affichage du prix TTC de la paire de chaussures
        System.out.println("Le prix TTC de la paire de chaussures à 56 euros HT est : " + prixTTC + " euros");
    }

}
