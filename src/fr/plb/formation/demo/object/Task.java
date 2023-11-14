package fr.plb.formation.demo.object;

public class Task extends Object {

    private String content;

    public Task(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return this.content;
    }
}
