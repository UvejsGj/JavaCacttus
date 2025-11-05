package Java_04;

import java.util.Scanner;

public class scannerExample {
    public static void main(String[] args) {
        // System.in i tregon qe jemu tu dasht me lexu prej tastieres
        Scanner scanner = new Scanner(System.in);

//        System.out.println("Shkruani nje tekst");
//        // lexo tekstin qe e kem shkru tu e perdor metoden nextLine() dhe ruaje te variabla userInput
//        String userInput = scanner.nextLine();
//        System.out.println("Ju keni shkruar: " + userInput);

//          while (true) {
//              System.out.println("Shkruani nje tekst");
//              String input = scanner.nextLine();
//              System.out.println("Ju keni shkruaj: "  + input);
//
//        System.out.print("Shkruani emrin: ");
//        String emri = scanner.nextLine();
//
//        System.out.print("Shkruani mbiemrin: ");
//        String mbiemri = scanner.nextLine();
//
//        System.out.print("Shkruani moshen: ");
//        int mosha = scanner.nextInt();
//
//        System.out.print("Shkruani gjatesine: ");
//        float gjatesia = scanner.nextFloat();
//
//        System.out.print("A jeni student?: (true/false)");
//        boolean student = scanner.nextBoolean();
//
//        System.out.println("======== Studenti ========");
//        System.out.println("Emri: " + emri);
//        System.out.println("Mbiemri: " + mbiemri);
//        System.out.println("Mosha: " + mosha);
//        System.out.println("Gjatesia: " + gjatesia);
//        System.out.println("Studenti: " + student);
//              if (input.equals("ndalo")) {
//                  break;
//              }
//          }
//
         // DETYR KLASE

//        System.out.print("Zgjedhni ekipin tuaj te preferuar: ");
//        String input = scanner.nextLine();
//        System.out.println("Ju keni zgjedhur: " + input);

        System.out.print("Sa gola i ka dhene Kosova: ");
        int kosova = scanner.nextInt();

        System.out.print("Sa gola i ka dhene Shqiperia: ");
        int shqiperia = scanner.nextInt();

        System.out.println("Kosova - Shqiperia: " + kosova + ":" + shqiperia);

    }
}
