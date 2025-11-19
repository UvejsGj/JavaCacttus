package Java_06;

public class BooleanLogicalOperators {
    public static void main(String[] args) {
        // operatores logjik
        // && (AND)
        // || (or)
        // ^ (xor)
        // ! (not)

        boolean a = true;
        boolean b = false;

        System.out.println("a && b: " + (a && b)); // false
        System.out.println("a || b: " + (a || b)); // true
        System.out.println("a ^ b = " + (a ^ b)); // true
        System.out.println("!a = " + !a); // !true => false
        System.out.println("!b = " + !b);
    }
}
