import java.util.LinkedList;
class Queue {
    private final LinkedList<String> line;
    public Queue() {
        line = new LinkedList<String>();
    }
    public void enqueue(String person) {
        line.addLast(person);
    }
    public String dequeue() {
        if (line.isEmpty()) {
            return null;
        }
        return line.removeFirst();
    }
    public void display() {
        System.out.println("Line progress NOW: ");
        for (String person : line) {
            System.out.println(person);
        }
    }
}