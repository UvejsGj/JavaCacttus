package Java_04;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        // System.in i tregon qe jemu tu dasht me lexu prej tastieres
        Scanner scanner = new Scanner(System.in);

        System.out.println("Shkruani nje tekst");
        // lexo tekstin qe e kem shkru tu e perdor metoden nextLine() dhe ruaje te variabla userInput
        String userInput = scanner.nextLine();
        System.out.println("Ju keni shkruar: " + userInput);
    }
}
