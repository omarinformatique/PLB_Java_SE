package fr.plb.formation.exercice7;

public class Compte {

    // Attributs
    private int numero;
    private float solde;

    // Constructeurs
    public Compte(int numero) {
        this.numero = numero;
        this.solde = 0;
    }

    public Compte(int numero, float solde) {
        this.numero = numero;
        this.solde = solde;
    }

    // Méthodes
    void virer(float valeur, Compte destinaire) {
        this.retrait(valeur);
        destinaire.depot(valeur);
    }

    void depot(float valeur) {
        this.solde += valeur;
    }

    void retrait(float valeur) {
        this.solde -= valeur;
    }

    float getSolde() {
        return this.solde;
    }

    void afficherSolde() {
        System.out.println("Solde du compte " + this.numero + " -> " + this.solde + "$");
    }
}
