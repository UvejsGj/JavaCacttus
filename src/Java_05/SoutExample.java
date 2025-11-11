package Java_05;

public class SoutExample {
    public static void main(String[] args) {
        System.out.println(5 + 2); // 7
        System.out.println("5" + "2"); // I bashkon dy tekstet
        System.out.println("5" + 2); // i bashkon per shkak se dy katetogi te ndryshe
        System.out.println(5 + "2"); // njejt
        System.out.println("" + 5 + 2); // int plus string = string plus int = string dmth njejt
        System.out.println("" + (5 + 2)); // 7
        System.out.println(5 + 2 + ""); // 7
        System.out.println(5 - 2); // 3
        System.out.println(5 * 2); // 10
        System.out.println(5 / 2); // 2
        System.out.println(5.0 / 2); // 2.5
        System.out.println(5 % 2); // 1
        System.out.println(5.5 / 2); // 2.75

        System.out.println(1 + ((2 - 4) * 3) + 5);
        // 1 + (-2 * 3) + 5 =
        // 1 + (-6) + 5
        // -5 + 5 = 0
    }
}
