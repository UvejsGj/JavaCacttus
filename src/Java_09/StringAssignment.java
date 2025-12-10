package Java_09;

import java.util.Scanner;

public class StringAssignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani nje tekst: ");
        String tekst = sc.nextLine();

        if (tekst.isBlank()) {
            System.out.println("Ju nuk keni shkruar asnje test");
        } else {
            // a)
            int gjatesiaETekstit = tekst.length();
            System.out.println("Numri i shkronjave ne kete tekst eshte: " + gjatesiaETekstit);

            // b)
            System.out.printf("Shkruaj indeksin nga 0 deri ne %d%n", gjatesiaETekstit);
            int index = sc.nextInt();
//            System.out.println(tekst.substring(index));

            if (index > gjatesiaETekstit) {
                System.out.printf("Indeksi lejuar eshte prej 0 deri ne %d", gjatesiaETekstit);
            } else {
                System.out.println(tekst.substring(index));
            }
        }
    }
}
