import java.util.LinkedList;

class Queue {
    private final LinkedList<String> queue;

    public Queue() {
        queue = new LinkedList<>();
    }

    public void enqueue(String person) {
        queue.addLast(person);
    }

    public String dequeue() {
        if (isEmpty()) {
            return null;
        }
        return queue.removeFirst();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void display() {
        System.out.println("Current state of the queue:");
        for (String person : queue) {
            System.out.println(person);
        }
    }
}