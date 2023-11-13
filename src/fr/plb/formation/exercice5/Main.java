package fr.plb.formation.exercice5;

import java.util.Scanner;

public class Main {

    private static final int NB_STUDENTS = 100;

    public static void main(String[] args) {
        // Initialise le scanner pour la saisie clavier
        Scanner scanner = new Scanner(System.in);
        String[] firstNames = new String[NB_STUDENTS];
        Float[] marks = new Float[NB_STUDENTS];

        System.out.println("Démarrage de la Saisie des notes par élèves :");
        for (int i = 0; ; i++) {
            System.out.println("Prénom de l'élève :");
            String firstName = scanner.next();
            if (firstName.equals("-1")) {
                System.out.println("Arrêt de la saisie.");
                break;
            }
            System.out.println("Note de l'élève :");
            Float mark = scanner.nextFloat();
            if (mark == -1) {
                System.out.println("Arrêt de la saisie.");
                break;
            }
            firstNames[i] = firstName;
            marks[i] = mark;
        }

        // Affichage de la saisie
        for (int i = 0; i < NB_STUDENTS; i++) {
            if (firstNames[i] != null) {
                System.out.println(firstNames[i] + " --> " + marks[i]);
            }
        }
        scanner.close();
    }


}
