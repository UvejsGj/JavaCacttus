package Java_03;

public class Variables {
    // maina shkurtes per metoden main()
    public static void main(String[] args) {
        // type => short, long, byte, char, boolean
        // identifier => emri i variables
        // mundemi me inicializu direkt tu e perdor '=' => assigment operatori tu ja dhon vleren
        // psh: int x = 10;
        // psh: int x;

        int x = 10;
        System.out.println("Vlera e x: " + x);

        // nese keni disa variable qe i kane tipet e njejta; mundemi me i deklaru dhe inicializu me ni rresht;
        // int y;
        // int z;
        // int c;

        int y, z = 30, c; // deklarimi i  tri variablave te tipit int me emrat y, z, c (tipit te njejt)
        y = 20;
        // z = 30;
        c = 40;

        System.out.println("Vlera e y: " + y);
        System.out.println("Vlera e z: " + z);
        System.out.println("Vlera e c: " + c);

        int a = z + y;
        System.out.println("Vlera e a: " + a);


    }
}
