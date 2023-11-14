package fr.plb.formation.exercice6;

import java.util.Scanner;

public class Main {

    private static final int NB_STUDENTS = 100;

    public static void main(String[] args) {
        // Initialise le scanner pour la saisie clavier
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[NB_STUDENTS];

        System.out.println("Démarrage de la Saisie des notes par élèves :");
        for (int i = 0; ; i++) {

            System.out.println("Prénom de l'élève :");
            String firstName = scanner.next();
            if (firstName.equals("-1")) {
                System.out.println("Arrêt de la saisie.");
                break;
            }

            System.out.println("Nom de l'élève :");
            String lastName = scanner.next();

            System.out.println("Age de l'élève :");
            int age = scanner.nextInt();

            System.out.println("Note de l'élève :");
            float mark = scanner.nextFloat();

            students[i] = new Student(firstName, lastName, mark, age);
        }

        // Affichage de la saisie

        for (int i = 0; i < NB_STUDENTS; i++) {
            Student currentStudent = students[i];
            if (currentStudent != null) {
                currentStudent.display();
            }
        }
        scanner.close();
    }


}
