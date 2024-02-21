public class QueueTester {
    public static void main(String[] args) {
        Queue sample = new Queue();
        sample.enqueue("Ajit");
        sample.enqueue("Amit");
        sample.enqueue("Anil");
        sample.display();
        String removedPerson = sample.dequeue();
        if (removedPerson != null) {
            System.out.println("Removed from line: " + removedPerson);
        } else {
            System.out.println("The line is empty");
        }
        sample.enqueue("Ajay");
        System.out.println("Ajay has joined the line...");
        sample.display();
    }
}
