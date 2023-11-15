package fr.plb.formation.demo.inheritance;

public class Main {


    public static void main(String[] args) {
        Animal animal1 = new Chien("Golden retriever", 28, 5);
        Animal animal2 = new Loup("Loup noir du Canada", 80, 10);
        Animal animal3 = new Chat("Persan", 4, 2);

        Animal[] animaux = new Animal[3];
        animaux[0] = animal1;
        animaux[1] = animal2;
        animaux[2] = animal3;

        for (Animal a : animaux) {
            a.direBonjour();
            a.crier();
            System.out.println("####");
        }

    }

}
