public class QueueTester {
    public static void main(String[] args) {
        Queue queue = new Queue();

        // Adding people to the queue
        queue.enqueue("Alice");
        queue.enqueue("Bob");
        queue.enqueue("Charlie");

        // Displaying the current state of the queue
        queue.display();

        // Removing a person from the front of the queue
        String removedPerson = queue.dequeue();
        if (removedPerson != null) {
            System.out.println("Removed from the front of the queue: " + removedPerson);
        } else {
            System.out.println("The queue is empty.");
        }

        // Displaying the current state of the queue after removal
        queue.display();
    }
}
