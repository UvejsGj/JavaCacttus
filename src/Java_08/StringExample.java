package Java_08;

public class StringExample {
    public static void main(String[] args) {
        // String methods => metodat e string-ut


        String fjalia = "Sot eshte dite e merkure dhe kemi test ne bazat e web-it";

        System.out.println(fjalia);

        // charAt(parametri)
        System.out.println("charAt: " + fjalia.charAt(0));

        // length()
        System.out.println("Gjatesia e kesaj fjalie eshte: " + fjalia.length());

        // format()
        System.out.println("format(): " + String.format("%s %S", "Emri", "Mbiemri"));

        // substring(1 ose 2 parametra) => preje tekstin ne baze te indeksit qe une po e jap
        // substring(indeks) => preje tekstin prej indeksit deri ne fund
        // substring(indeksi1, indeksi2) => preje tekstin prej tu e perfshi indeksin1 deri te indeksi2 por jo indeksin2
        System.out.println("substring(4): " + fjalia.substring(4));
        System.out.println("substring(0, 3): " + fjalia.substring(0, 3));

        // contains()
        System.out.println("contains(merkure): " + fjalia.contains("merkure"));
        System.out.println("contains(premte): " + fjalia.contains("premte"));

        // join()
        System.out.println("join(): " + String.join("Emri", " - ", "Mbiemri", "Mosha"));
        System.out.println("join(): " + String.join(" - ", "Emri", "Mbiemri", "Mosha"));

        // equals()
        System.out.println("equals(): " + "Uvejs".equals("Uvejs")); // true ose false

        // isEmpty(), isBlank
        System.out.println("isEmpty(): " + " ".trim().isEmpty());
        System.out.println("isEmpty(): " + " ".isBlank());

        // trim()
        System.out.println("isEmpty(), trim(): " + " ".trim().isEmpty());
        System.out.println("trim(): " + " J".trim());

        // concat()
        System.out.println("concat(): " + "Jon".concat("Arbnor"));

        //replace()
        System.out.println("replace(): " + fjalia.replace("merkure", "premte"));

        // split()
        System.out.println("split(): " + fjalia.split(" ")[0]);
        System.out.println("split(): " + "1,2,3".split(",")[0]);

        // indexOf()
        System.out.println("indexOf('S'): " + fjalia.indexOf("S"));
        System.out.println("indexOf('s', 10): " + fjalia.indexOf("s", 10));

        // toLowerCase(), toUpperCase()
        System.out.println("toLowerCase(): " + fjalia.toLowerCase());
        System.out.println("toUpperCase(): " + fjalia.toUpperCase());

        // valueOf()
        System.out.println("valueOf(): " + String.valueOf(123));

        // repeat()
        System.out.println("repeat(): " + "Msoni ma shume te shpija".repeat(5));

        // startsWith(), endsWith()
        System.out.println("startsWith(): " + fjalia.startsWith("S"));
        System.out.println("endsWith(): " + fjalia.endsWith("it"));
    }
}
