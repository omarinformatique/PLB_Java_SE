package fr.plb.formation.demo.inheritance;

public class Chat extends Animal {

    public Chat(String race, float poids, int age) {
        super(race, poids, age);
    }

    @Override
    public void direBonjour() {
        System.out.println("## JE SUIS UN CHAT ##");
        super.direBonjour();
    }

    @Override
    public int getAge() {
        return super.getAge() * 7;
    }

    @Override
    public void crier() {
        System.out.println("Miaou Miaou");
    }
}
