public class BracketStack {
private Node top;
   
    private class Node {
        char data;
        Node next;

        Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public BracketStack() {
        top = null;
    }

    public void push(char data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public char pop() {
        if (isEmpty()) {
            return '\0';
        }

        char value = top.data;
        top = top.next;
        return value;
    }

    public Character peek() {
        if (isEmpty()) {
            return null;
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
