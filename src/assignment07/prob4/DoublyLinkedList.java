package assignment07.prob4;

public class DoublyLinkedList {

    Node header;

    DoublyLinkedList() {
        header = new Node();
    }

    // 1. Adds to the end of the list
    public void addLast(String item) {
        Node newNode = new Node();
        newNode.value = item;

        Node current = header;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
        newNode.previous = current;
    }

    // 2. Remove by passing object
    public boolean remove(String item) {
        // Start from the first element
        Node current = header.next;
        while (current != null) {
            if (current.value.equals(item)) {
                if (current.next != null) {
                    current.next.previous = current.previous;
                }
                if (current.previous != null) {
                    current.previous.next = current.next;
                }
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // 3. Remove the first node
    public boolean removeFirst() {
        if (header.next == null) {
            return false; // List is empty
        }
        Node firstNode = header.next;
        header.next = firstNode.next;
        if (firstNode.next != null) {
            firstNode.next.previous = header;
        }
        return true;
    }

    // 4. Prints the list from last to first
    public void printReverse() {
        Node current = header.next;
        if (current == null) {
            return; // List is empty
        }
        while (current.next != null) {
            current = current.next;
        }
        while (current != header) {
            System.out.print(current.value + " ");
            current = current.previous;
        }
        System.out.println();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        toString(sb, header.next); // Skip header node for printing
        return sb.toString();
    }

    private void toString(StringBuilder sb, Node n) {
        if (n == null) return;
        if (n.value != null) sb.append(" " + n.value);
        toString(sb, n.next);
    }

    class Node {
        String value;
        Node next;
        Node previous;

        public String toString() {
            return value == null ? "null" : value;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addLast("Bob");
        list.addLast("Harry");
        list.addLast("Steve");
        list.addLast("Sulu");
        list.addLast("Bishnu");
        list.addLast("Kheang");
        list.addLast("Alex");
        list.addLast("Ram");
        System.out.println(list);

        list.remove("Harry");
        System.out.println("After removing 'Harry': " + list);

        list.removeFirst();
        System.out.println("After removing first element: " + list);

        System.out.print("List in reverse order: ");
        list.printReverse();
    }
}
