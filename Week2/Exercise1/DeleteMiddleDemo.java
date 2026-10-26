public class DeleteMiddleDemo {

    public static void main(String[] args) {

        // Test 1: Odd number of nodes
        SinglyLinkedList list1 = new SinglyLinkedList();

        list1.append(10);
        list1.append(20);
        list1.append(30);
        list1.append(40);
        list1.append(50);

        System.out.println("Test 1: Odd number of nodes");
        System.out.print("Before deletion: ");
        list1.display();

        list1.deleteMiddle();

        System.out.print("After deletion: ");
        list1.display();

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
        System.out.print("Before deletion: ");
        list2.display();

        list2.deleteMiddle();

        System.out.print("After deletion: ");
        list2.display();

        System.out.println();

        // Test 3: One node
        SinglyLinkedList list3 = new SinglyLinkedList();
        list3.append(100);

        System.out.println("Test 3: One node");
        System.out.print("Before deletion: ");
        list3.display();

        list3.deleteMiddle();

        System.out.print("After deletion: ");
        list3.display();

        System.out.println();

        // Test 4: Empty list
        SinglyLinkedList list4 = new SinglyLinkedList();

        System.out.println("Test 4: Empty list");
        System.out.print("Before deletion: ");
        list4.display();

        list4.deleteMiddle();

        System.out.print("After deletion: ");
        list4.display();
    }
}
