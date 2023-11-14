package fr.plb.formation.exercice7;

public class Client {

    private String nom;
    private Compte[] comptes;
    private int nbComptes;

    public Client(String nom) {
        this.nom = nom;
        this.comptes = new Compte[10];
        this.comptes[0] = new Compte(++nbComptes);
    }

    public String getNom() {
        return nom;
    }

    public float getSolde() {
        float totalSolde = 0;
        for (int i = 0; i < nbComptes; i++) {
            totalSolde += this.comptes[i].getSolde();
        }
        return totalSolde;
    }

    public void afficherSolde() {
        System.out.println("Solde des comptes de " + this.nom + " : " + this.getSolde() + "$");
    }

}
