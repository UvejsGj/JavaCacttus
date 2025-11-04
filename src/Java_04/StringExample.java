package Java_04;

public class StringExample {
    public static void main(String[] args) {
//        String numri7 = "7";
//        int numri2 = 2;
//        System.out.println("72? " + (numri7 + numri2));

        // String nuk eshte tip primitiv eshte tip komplex (klase_
        char A = 'A';
        char B = 'B';
        String AB = "AB";

        String text = "Ky eshte nje text";
//        System.out.printf("Numri i shkronjave ne kete teskt eshte: " + text.length());
        int gjatesiaTekstit = text.length();
        int shkronjaFundit = gjatesiaTekstit -1;
        System.out.println("Shkronja e fundit e tekstit eshte: " + text.charAt(shkronjaFundit));
        // System.out.println("Gjatesia e tekstit: " + text.length() + " " + text.charAt(0));
    }
}
