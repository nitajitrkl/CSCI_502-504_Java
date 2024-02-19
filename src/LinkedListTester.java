import java.util.Scanner;

public class LinkedListTester {
    public static void main(String[] args) {
        LinkedList sample = new LinkedList();
        sample.add("HELLO");
        sample.add("WORLD");
        sample.add("!!!");
        System.out.println("LinkedList Below: ");
        sample.display();
        System.out.println();
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a String to remove: ");
        sample.remove(in.next().toUpperCase());
        System.out.print("After removing string --> LinkedList: ");
        sample.display();
        System.out.println();
        System.out.print("Enter a position: ");
        int position = in.nextInt();
        String element = sample.access(position);
        if (element != null) {
            System.out.println("Element at index " + position + " : " + element);
        } else {
            System.out.println("No element found at index " + position);
        }
    }
}
