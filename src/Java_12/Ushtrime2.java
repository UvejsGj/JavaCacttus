void main() {
    printNumbers(5);
    printNumbers(20);
    printNumbers(100);
    printList("34543");
}

public void printNumbers(int n){
    for (int i = 1; i <= n; i++) {
        System.out.print(i + " ");
    }
    System.out.println();
}

public void printList(String numbers) {
    for (int i = 0; i <= numbers.length(); i++) {
        System.out.print(numbers.charAt(i) + " ");
    }
}