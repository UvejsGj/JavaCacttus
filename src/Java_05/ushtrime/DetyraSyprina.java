package Java_05.ushtrime;

import java.util.Scanner;

public class DetyraSyprina {
    static void main(String[] args) {
        // syprina e trekendshit => s = 1/2 * b * h
        Scanner sc = new Scanner(System.in);
//
//        System.out.print("Shkruani bazen: ");
//        double b = sc.nextDouble();
//
//        System.out.print("Shkruani lartesine: ");
//        double h  = sc.nextDouble();
//
//        double s = 0.5 * b * h;
//
//        Syprina e katrorit =
//        System.out.println("Syprina e trekendshit eshte: " + s);
//
//        System.out.print("Shkruani brijen a: ");
//        double a = sc.nextDouble();
//
//        // double s = a * a
//        double s = Math.pow(a, 2);
//        System.out.println("Syprina e katrorit eshte: " + s);

        // syprina e drejtkendshit => s = length * width
//        System.out.print("Shkruani gjatesine: ");
//        double l = sc.nextDouble();
//
//        System.out.print("Shkruani gjeresine: ");
//        double w = sc.nextDouble();
//
//        double s = l * w;
//
//        System.out.print("Syprina e drejtkendshit eshte: " + s);

        // syprina e rrethit => s = pi * r^2
        final double PI = 3.14;

        System.out.print("Shkruani rrezen: ");
        double r = sc.nextDouble();

//        double s = PI * r * r;
        double s = PI * Math.pow(r, 2);

        System.out.print("Syprina e rrethit eshte: " + s);
    }
}
