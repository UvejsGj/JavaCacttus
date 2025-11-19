package Java_06;

public class CompoundAssignment {
    public static void main(){
        int a = 1, b = 2, c = 3;

        a += 5; // a = a + 5
        b *= 4; // b = b * 4
        c += a * b; // c = c + a * b
        c %= 6; // c = c % 6 => 8 * 6 = 48 => 51 - 48 => 3

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        // Increment a++ => a = a + 1
        System.out.println("a = "+ a); // 6
        // post increment e rrit vleren ne rreshtin e ri
        // maspari e printon mandej e rrit
        System.out.println("a++ = " + a++);
        System.out.println("a = " + a);
        // pre increment e rrit vleren edhe e printon ne rreshtin e njejte
        System.out.println("++a = " + ++a);
        System.out.println("a = " + a);

        // decrementi a-- pse --a a = a - 1
        System.out.println("c = " + c);
        // post decrement e zvoglon vleren dhe ndodh ne rreshtin e ri
        System.out.println("c-- = " + c--);
        System.out.println("c = " + c);
        // pre increment e zvolo vleren dhe e printon ne rreshtine njejte
        System.out.println("--c = " + --c);
        System.out.println("c = " + c);

    }
}
