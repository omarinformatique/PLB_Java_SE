package fr.plb.formation.exercice3;

public class Exercice3 {

    public static void main(String[] args) {
        double capital = 8502.0; // Montant initial sur le PEL en euros
        double tauxInteret = 0.0327; // Taux d'intérêt annuel en décimal (3,27%)
        double tauxPrelevementsSociaux = 0.172; // Taux de prélèvements sociaux en décimal (17,20%)
        int anneeDebut = 2000; // Année de début
        int anneeFin = 2023; // Année de fin

        for (int annee = anneeDebut; annee <= anneeFin; annee++) {
            // Calcul des intérêts pour cette année
            double interets = capital * tauxInteret;

            // Calcul des prélèvements sociaux sur les intérêts
            double prelevementsSociaux = interets * tauxPrelevementsSociaux;

            // Mise à jour du capital avec les intérêts
            capital += interets;

            // Affichage des résultats pour cette année
            System.out.println("Année " + annee + ":");
            System.out.println("   Intérêts : " + interets + " euros");
            System.out.println("   Prélèvements sociaux : " + prelevementsSociaux + " euros");
            System.out.println("   Nouveau capital : " + capital + " euros");
        }
    }
}
