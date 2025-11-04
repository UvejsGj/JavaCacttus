package Java_04;

public class operators {
        public static void main(String[] args) {

            // double x = 10.0;
            // double y = 4.0;
//
//            double x = 10.0, y = 4.0;
//
//            double shuma = x + y;
//            double zbritja = x - y;
//            double prodhimi = x * y;
//            double heresi = x / y;
//            double mbetja = x % y;
//            System.out.println("Mbledhja: " + shuma); // 14.0
//            System.out.println("Zbritja: " + zbritja); // 6.0
//            System.out.println("Prodhimi: " + prodhimi); // 40.0
//            System.out.println("Heresi: " + heresi); // 2.5
//            System.out.println("Mbetja: " + mbetja); // 2.0 => 2 * 4 = 8 => mbetja eshte 2

            int a = 125;
            int b = 24;

            System.out.printf("%nNumrat: %d, %d", a, b);
            System.out.printf("%nOutput:");
            System.out.printf("%n========================================");
            System.out.printf("%n========================================");
            System.out.printf("%nShuma e %d dhe %d eshte: %d", a, b, a + b);
            System.out.printf("%nZbritja e %d dhe %d = %d", a, b, a - b);
            System.out.printf("%nProdhimi i %d dhe %d eshte: %d", a, b, a * b);
            System.out.printf("%nHeresi i %d dhe %d eshte %d", a, b, a / b);
            System.out.printf("%nMbetja (Modulusi %%) i %d dhe %d eshte %d", a, b, a % b);
            System.out.printf("%n========================================");
            System.out.printf("%n========================================");
        }
}
