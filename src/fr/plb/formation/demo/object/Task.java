package fr.plb.formation.demo.object;

import java.util.Objects;

public class Task { //extends Object {

    private Long id;
    private String content;

    public Task(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    @Override
    public boolean equals(Object o) {
        // Vérification si l'instance de la tache actuelle (this)
        // est la même instance que celle sur laquelle on test l'égalité equals()
        if (this == o) return true;
        // Vérification que l'objet comparé n'est pas null
        // ET si les objets comparés sont des instances de la mm classe (Task)
        if (o == null || getClass() != o.getClass()) return false;
        // L'objet o n'est pas null
        // Les objets comparés sont tous les deux des instances de Task
        // DONC ==> DownCasting (Substition)
        Task task = (Task) o;
        // Comparaison de nos deux instances de type Task :
        // Comparaison des attributs SOUHAITÉS
        return id.equals(task.id) && content.equals(task.content);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, content);
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", content='" + content + '\'' +
                '}';
    }
}
