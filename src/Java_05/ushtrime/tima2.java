package Java_05.ushtrime;

import java.time.LocalDate;
import java.util.Scanner;

public class tima2 {
    public static void main(String[] args) {
        Scanner skaneri = new Scanner(System.in);

        System.out.print("Shkruani sa 1 centsha keni: ");
        int cent1 = skaneri.nextInt();

        System.out.print("Shkruani sa 2 centsha keni: ");
        int cent2 = skaneri.nextInt();

        System.out.print("Shkruani sa 5 centsha keni: ");
        int cent5 = skaneri.nextInt();

        System.out.print("Shkruani sa 10 centsha keni: ");
        int cent10 = skaneri.nextInt();

        System.out.print("Shkruani sa 20 centsha keni: ");
        int cent20 = skaneri.nextInt();

        System.out.print("Shkruani sa 50 centsha keni: ");
        int cent50 = skaneri.nextInt();

        System.out.print("Sa 1 euro i keni: ");
        int euro1 = skaneri.nextInt();

        System.out.print("Sa 2 euro i keni: ");
        int euro2 = skaneri.nextInt();

        double cent1Total = cent1 * 0.01;
        double cent2Total = cent2 * 0.02;
        double cent5Total = cent5 * 0.05;
        double cent10Total = cent10 * 0.10;
        double cent20Total = cent20 * 0.20;
        double cent50Total = cent50 * 0.50;
        double euro1Total = euro1 * 1.0;
        double euro2Total = euro2 * 2.0;

        double totalParate = cent1Total + cent2Total + cent5Total + cent10Total  + cent20Total + cent50Total + euro1Total + euro2Total;

        System.out.println("---------------------------");
        System.out.printf("1 centshe: %d    %.2f EUR%n", cent1, cent1Total);
        System.out.printf("2 centshe:  %d    %.2f EUR%n", cent2, cent2Total);
        System.out.printf("5 centshe:  %d    %.2f EUR%n", cent5, cent5Total);
        System.out.printf("10 centshe: %d    %.2f EUR%n", cent10, cent10Total);
        System.out.printf("20 centshe: %d    %.2f EUR%n", cent20, cent20Total);
        System.out.printf("50 centshe: %d    %.2f EUR%n", cent50, cent50Total);
        System.out.printf("1 euro:     %d    %.2f EUR%n", euro1, euro1Total);
        System.out.printf("2 euro:     %d    %.2f EUR%n", euro2, euro2Total);
        System.out.println("---------------------------");
        System.out.println("Total parate: " + totalParate);
        System.out.println("---------------------------");
        LocalDate dataAktuale = LocalDate.now();
        System.out.printf("Data:        %s%n", dataAktuale);
        System.out.println("---------------------------");
    }
}
