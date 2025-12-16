package Java_10;

import java.util.Scanner;

public class PqFor {
    public  static void main(String[] args) {
//        int f = 0, g = 1;
//
//        for (int i = 0; i <= 10; i++) {
//            System.out.println(f); // 0
//            f = f + g; // 1
//            g = f - g; // 0;
//        }

//        for (int i = 0; i >= 0; i++) {
//            System.out.println(i);
//        }

//        for (int i = 0; i <= 3; i++) {
//            System.out.println("i = " + i);
//
//            for (int j = 1; j <= 2; j++) {
//                System.out.println(" j = " + j);
//            }
//        }

        Scanner sc = new Scanner(System.in);

        System.out.print("Shkruaj numrin e rreshtave: ");
        int rreshtat = sc.nextInt();

        // printojm rreshtat
        for  (int i = 1; i <= rreshtat; i++) {
            // per cdo rresht duhet mi printu 10 *
            for (int z = 1; z <= 10; z++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
