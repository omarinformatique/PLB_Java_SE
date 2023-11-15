package fr.plb.formation.demo.inheritance;

public abstract class Animal {
    private String race;
    private float poids;
    private int age;

    public Animal(String race, float poids, int age) {
        this.race = race;
        this.poids = poids;
        this.age = age;
    }

    // Pas de corps de méthode car Méthode abstraite
    // Obligatoirement redefini dans la classe fille
    public abstract void crier();

    public void direBonjour() {
        System.out.println("Hey, ma race est : " + getRace());
        System.out.println("Je fais " + getPoids() + " kg");
        System.out.println("J'ai " + getAge() + " ans");
    }

    public String getRace() {
        return race;
    }

    public float getPoids() {
        return poids;
    }

    public int getAge() {
        return age;
    }
}
