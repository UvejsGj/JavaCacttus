package Java_03;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Data Types");
        // byte
        // range: -128 -> 127
        // size: 8 bits -> 1 byte
        // byte: 0 or 1
        byte myByte = 120;
        // byte vleraGabim = 200;
        System.out.println("Byte: " + myByte);

        // Hapi 1 -> data tipi
        // Hapi 2 -> emri i variables
        // Hapi 3 -> vlera qe deshironi me rujt ne variabel

        byte b; // deklarim
        b = 20; // inicializim
        System.out.println("Byte: " + b);

        // short
        // range: -32758 -> 32767
        // size: 16 bits -> 2 bytes
        short myShort = 10000;
        short vitiAktual = 2025;
        System.out.println("Short: " + myShort);
        System.out.println("Viti aktual: " + vitiAktual);

        // int
        // range: -2'31 -> 2'31
        // size: 32 bits -> 4 bytes

        int myInt = 123456789;
        int numriPopullsis = 1700000;
        System.out.println("Int: " + myInt);
        System.out.println("Numri popullsis: " + numriPopullsis);

        // long
        // range: -2'63 -> 2'63
        // size: 64bits -> 8 bytes
        long myLong = 2389042395973249239L;
        long distanceToSun = 149600000000L;
        // long mosha = 18L; 64 bit ne memorie edhe pse keni shrkujt nje vlere te vogel
        System.out.println("Long: " + myLong);
        // System.out.println("Mosha: " + mosha);
        System.out.println("DistanceToSun: " + distanceToSun);

        // float
        // range: -3.4028235E+38 -> 3.4028235E+38
        // size 32 bits -> 4 bytes
        // prefix: F per float
        float myFloat = 123456.1234F;
        float price = 12.99F;
        System.out.println("Float: " + myFloat);
        System.out.println("Price: " + price);

        // double
        // range: -1.7976931348623157E+308 -> 1.7976931348623157E+308
        // size: 64 bits -> 8 bytes
        double myDouble = 123456.12345D;
        double pi = 3.14592653589793D;
        System.out.println("Double: " + myDouble);
        System.out.println("Pi: " + pi);

        // char
        // range: 0 -> 65535
        // size: 16bit/8 -> 2 byte
        char myChar = 'A';
        char letterA = 65;
        int digitOfA = myChar;
        char smiley = '☺';
        System.out.println("Char: " + myChar);
        System.out.println("Letter A: " + letterA);
        System.out.println("Digit of A: " + digitOfA);
        System.out.println("Smiley: " + smiley);

        // boolean
        // range: true -> false
        boolean myBoolean = true;
        boolean isStudent = true;
        int piket = 80;
        boolean kaKaluarProvimin = (piket > 50);
        System.out.println("Boolean: " + myBoolean);
        System.out.println("Is student: " + isStudent);
        System.out.println("Ka kaluar provimin: " + kaKaluarProvimin);

        // string literals
        System.out.println("\'Thojza njefishe");
        System.out.println("\"Thojza dyfishe\"");
        System.out.println("\\Backslash\\");
        System.out.println("New \nline");
        System.out.println("\tTab");
        System.out.println("Backspace \btest");
    }
}
