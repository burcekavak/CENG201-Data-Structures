public class MiddleNodeDemo {

    public static void main(String[] args) {

        // Test 1: Odd number of nodes
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.append(40);
        list1.append(50);

        System.out.println("Test 1: Odd number of nodes");
        list1.display();

        Node middle1 = list1.findMiddle();
        System.out.println("Middle node: " + middle1.data);

        System.out.println();

        // Test 2: Even number of nodes
        SinglyLinkedList list2 = new SinglyLinkedList();

        list2.append(10);
        list2.append(20);
        list2.append(30);
        list2.append(40);
        list2.append(50);
        list2.append(60);

        System.out.println("Test 2: Even number of nodes");
        list2.display();

        Node middle2 = list2.findMiddle();
        System.out.println("Middle node: " + middle2.data);

        System.out.println();

        // Test 3: Empty list
        SinglyLinkedList list3 = new SinglyLinkedList();

        System.out.println("Test 3: Empty list");
        System.out.println("Middle node: " + list3.findMiddle());

    }
}