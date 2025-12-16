package Java_10;

import java.util.Scanner;

public class Detyra5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruani numrin deri ku doni te iteroni: ");
        int numri = sc.nextInt();

        // numrat cift
        for (int i = 1; i <= numri; i++) {
            // i eshte numer cift
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
