public class SinglyLinkedList {

    Node head;

    // Add a new node at the end of the list
    public void append(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    // Display all nodes
    public void display() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }

        System.out.println("null");
    }

    // Find the middle node
    // If the list has an even number of nodes, return the second middle node
    public Node findMiddle() {
        if (head == null) {
            return null;
        }

        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        int middleIndex = count / 2;
        current = head;

        for (int i = 0; i < middleIndex; i++) {
            current = current.next;
        }

        return current;
    }

    public void deleteMiddle() {
    if (head == null) {
        return;
    }

    int count = 0;
    Node current = head;

    while (current != null) {
        count++;
        current = current.next;
    }

    int middleIndex = count / 2;

    if (middleIndex == 0) {
        head = head.next;
        return;
    }

    current = head;

    for (int i = 0; i < middleIndex - 1; i++) {
        current = current.next;
    }

    current.next = current.next.next;
}

}