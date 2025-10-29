package Java_03;

public class Variables {
    // maina shkurtes per metoden main()
    public static void main(String[] args) {
        // type => short, long, byte, char, boolean
        // identifier => emri i variables
        // mundemi me inicializu direkt tu e perdor '=' => assigment operatori tu ja dhon vleren
        // psh: int x = 10;
        // psh: int x;
//
//        int x = 10;
//        System.out.println("Vlera e x: " + x);
//
//        // nese keni disa variable qe i kane tipet e njejta; mundemi me i deklaru dhe inicializu me ni rresht;
//        // int y;
//        // int z;
//        // int c;
//
//        int y, z = 30, c; // deklarimi i  tri variablave te tipit int me emrat y, z, c (tipit te njejt)
//        y = 20;
//        // z = 30;
//        c = 40;
//
//        System.out.println("Vlera e y: " + y);
//        System.out.println("Vlera e z: " + z);
//        System.out.println("Vlera e c: " + c);
//
//        int a = 55;
//        System.out.println("Vlera e a: " + a);
//
//        // Variable scope => jetgjatsia e variables mrenda nje blloki
//        // {} klase ose metode (scope-i)
//
////        if (a > 10) {
////            a = 20;
////            int n = 50;
////            x = n;
////            System.out.println("Vlera e a brenda scope te if: " + a);
////            System.out.println("Vlera e n brenda scope te if: " + n);
////        }
////
////        System.out.println("Vlera e a jashte scope te if-it: " + a);
////        System.out.println("Vlera e x jashte scope te if-it: " + x);
//
//        // konstanten => final
//        final double PI = 3.14159;
//        final short WEEK_DAYS;
//        WEEK_DAYS = 7;
//
//        // WEEK_DAYS = 8; => error smundesh me inicializu perseri konstanten
//        System.out.println("PI: " + PI);
//        System.out.println("VWEEK_DAYS: " + WEEK_DAYS);

        String emri = "Uvejs";
        String mbiemri = " Gjelaj";
        int mosha = 18;
        short vitiLindjes = 2007;
        double gjatesia = 1.75;
        boolean jamStudent = true;

        System.out.printf("%nUne quhem " + emri + mbiemri);
        System.out.printf("%nMosha ime eshte: " + mosha);
        System.out.printf("%nViti i lidjes: " + vitiLindjes);
        System.out.printf("%nGjatesia ime eshte: " + gjatesia);
        System.out.printf("%nJam student: " + jamStudent);
    }
}
