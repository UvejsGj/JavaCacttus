void main() {
    Scanner sc = new Scanner(System.in);

    String fullName = "";

    do {
        System.out.print("Shkruani emrin dhe mbiemrin:");
        fullName = sc.nextLine();
    } while (fullName.isEmpty());

    for (int i = 0; i < fullName.length(); i++) {
//        char shkronja = fullName.charAt(i);
//        System.out.println("");
        System.out.println(fullName.charAt(i));
    }

    System.out.println();

    for (int i = fullName.length() - 1; i >= 0; i--) {
        System.out.println(fullName.toUpperCase().charAt(i));
    }
}