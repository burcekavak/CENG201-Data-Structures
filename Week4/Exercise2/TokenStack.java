public class TokenStack {
    private Node top;

    private class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public TokenStack() {
        top = null;
    }

    public void push(String data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public String pop() {
        if (isEmpty()) {
            return null;
        }

        String value = top.data;
        top = top.next;
        return value;
    }

    public String peek() {
        if (isEmpty()) {
            return null;
        }

        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }
}
