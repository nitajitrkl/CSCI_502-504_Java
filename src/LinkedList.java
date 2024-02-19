import java.util.Objects;

class LinkedList {
    void add(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node lastNode = head;
        while (lastNode.next != null) {
            lastNode = lastNode.next;
        }
        lastNode.next = newNode;
    }
    void remove(String data) {
        Node current = head;
        if (current != null && Objects.equals(current.data, data)) {
            head = current.next;
            return;
        }
        Node previous = null;
        while (current != null && !Objects.equals(current.data, data)) {
            previous = current;
            current = current.next;
        }
        if (current == null) {
            return;
        }
        assert previous != null;
        previous.next = current.next;
    }
    String access(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.data;
            }
            count++;
            current = current.next;
        }
        return null;
    }
    void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
    Node head;
}
class Node {
    Node(String data) {
        this.data = data;
        this.next = null;
    }
    String data;
    Node next;
}