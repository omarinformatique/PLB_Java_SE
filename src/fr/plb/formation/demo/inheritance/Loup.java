package fr.plb.formation.demo.inheritance;

public class Loup extends Animal {

    public Loup(String race, float poids, int age) {
        super(race, poids, age);
    }

    @Override
    public void direBonjour() {
        System.out.println("## JE SUIS UN LOUP ##");
        super.direBonjour();
    }

    @Override
    public void crier() {
        System.out.println("Aouuuuuuh");
    }
}
