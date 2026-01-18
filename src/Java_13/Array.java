void main() {
    int numri1 = 1;
    int numri2 = 2;
    int numri3 = 3;

    // Scanner sc = new Scanner(System.in);
    // Array => varg

    int[] numrat; // vargu i tipit int
    // inicializimi ne heap
    // rezervimi i hapesires per ruajtjen e 3 numrave
    // tipet primitive vlera fillestare (vlera default) 0 => [0, 0, 0]
    // perveq boolean false => [false, false]
    // ndersa tiper primitive vleren default e kane null => [null, null]
    numrat = new int[3];
    byte[] byteArray = new byte[5];
    String[] stringArray = new String[10];

    numrat[0] = 1;
    numrat[1] = 2;
    numrat[2] = 3;

    System.out.println("Numri i dyte: " + numrat[2]);
    System.out.println("Numri i elementeve: " + numrat.length);

//    String[] emrat = new String[2];
//    emrat[0] = "Arbnor";
//    emrat[1] = "Filan";
//    String[] emarat = new String[] {"Arbnor", "Erlent"};
    String[] emrat = {"Arbnor", "Erlent", "Jon"};
    System.out.println("Emri i pare: " + emrat[0]);

}