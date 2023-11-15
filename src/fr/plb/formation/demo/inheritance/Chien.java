package fr.plb.formation.demo.inheritance;

public class Chien extends Animal {

    public Chien(String race, float poids, int age) {
        super(race, poids, age);
    }

    @Override
    public void direBonjour() {
        System.out.println("## JE SUIS UN CHIEN ##");
        super.direBonjour();
    }

    @Override
    public void crier() {
        System.out.println("Wouf Wouf");
    }
}
