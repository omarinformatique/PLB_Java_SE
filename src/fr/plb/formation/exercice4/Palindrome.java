package fr.plb.formation.exercice4;

import java.util.Scanner;

public class Palindrome {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String[] words = new String[]{"radar", "test", "kayak", "boris"};
    private static final String[] sentences = new String[]{"J'adore le java", "Engage le jeu que je le gagne", "Elu par cette crapule"};

    public static void main(String[] args) {
        System.out.println("Vous souhaitez tester :");
        System.out.println("1) Un mot");
        System.out.println("2) Une phrase");
        System.out.println("3) Une saisie personnalisée");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> wordScenario();
            case 2 -> sentenceScenario();
            case 3 -> customInputScenario();
        }
        scanner.close();
    }

    private static void customInputScenario() {
        System.out.println("Quelle est votre phrase ?");
        scanner.nextLine();
        String value = scanner.nextLine();
        isPalindrome(value);
    }

    private static void sentenceScenario() {
        System.out.println("Choix de phrase(s)");
        display(sentences);
        int choice = scanner.nextInt();
        isPalindrome(sentences[choice - 1]);
    }

    private static void isPalindrome(String value) {
        String reformatedStr = value.replaceAll("\\s", "").toLowerCase();

        if (new StringBuilder(reformatedStr).reverse().toString().equals(reformatedStr)) {
            System.out.println("Oui, " + value + " est un palindrome !");
        } else {
            System.out.println("Non, " + value + " n'est pas un palindrome ..");
        }
    }

    private static void display(String[] values) {
        int index = 1;
        for (String v : values) {
            System.out.println(index + ") " + v);
            index++;
        }
    }

    private static void wordScenario() {
        System.out.println("Choix de mot(s)");
        display(words);
        int choice = scanner.nextInt();
        isPalindrome(words[choice - 1]);
    }
}
