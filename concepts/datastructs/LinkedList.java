package concepts.datastructs;

import pojo.Node;

public class LinkedList {

    Node head;

    public LinkedList() {
        /* Creating a linkedlist with initial data for testing purpose */
        head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);

        head.next = second;
        second.next = third;

        System.out.println("Successfully created a linked list with initial items !!!");
    }

    public void insertDataInToEndOfList(Node data) {
        System.out.println("Adding data to the end of list...");
        Node currentNode = head;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = data;
    }

    public void insertDataIntoStartOfList(Node data) {
        System.out.println("Adding data to the start of list...");
        data.next = head;
        head = data;
    }

    public void insertDataIntoMiddleOfList(Node data, int pos) {
        System.out.println("Adding data to the middle of list...");
        int currentPos = 0;

        Node currentNode = head;
        while (currentNode.next != null && currentPos != pos) {
            currentNode = currentNode.next;
            currentPos++;
        }

        data.next = currentNode.next;
        currentNode.next = data;
    }

    public void deleteFirstOccuranceOfNode(double key) {
        System.out.println("Deleting First Occurance of the Node: " + key);
        Node temp = head, prev = null;
        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }
        
        if (prev != null) {
            prev.next = temp.next;
        }
    }

    public void deleteNodeAtGivenPosition(int position) {
        System.out.println("Deleting the Node at Position: " + position);
        if (head == null) {
            return;
        }

        Node temp = head;
        if (position == 0) {
            head = temp.next;
            return;
        }

        for (int i = 0; temp != null && i < position - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            return;
        }
        temp.next = temp.next.next;
    }

    public boolean findNodeInList(double key) {
        System.out.println("Finding Node with Data: " + key + "  In the List.");
        boolean found = false;

        Node temp = head;
        while (temp != null && temp.data != key) {
            temp = temp.next;
        }

        if (temp != null && temp.data == key) {
            found = true;
        }
        return found;
    }

    public int listLength() {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            temp = temp.next;
            count++;
        }
        return count;
    }

    public Node getNthNodeInList(int n) {
        int count = 0;
        Node temp = head;
        while (temp != null && count < n) {
            temp = temp.next;
            count++;
        }
        return temp;
    }

    public Node getNthNodeFromLast(int n) {
        int length = listLength();
        int m = length - n + 1;

        int count = 1;
        Node temp = head;
        while (temp != null && count < m) {
            temp = temp.next;
            count++;
        }

        return temp;
    }

    public Node getMiddleOfList() {
        Node slowPtr = head;
        Node fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }
        return slowPtr;
    }

    public int countNoOfOccurancesInList(double data) {
        Node temp = head;
        int count = 0;

        while (temp != null) {
            if (temp.data == data) {
                count++;
            }
            temp = temp.next;
        }
        return count;
    }

    public boolean hasLoop() {
        boolean hasLoop = false;
        if(head == null || head.next == null) {
            return false;
        }

        Node fastPtr = head.next;
        Node slowPtr = head;
        while (slowPtr != null && fastPtr != null && slowPtr != fastPtr) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        if (slowPtr == fastPtr) {
            hasLoop = true;
        }

        return hasLoop;
    }

    public void deleteList() {
        head = null;
    }

    public void printList() {
        Node node = head;
        if (node == null) {
            System.out.println("List is Empty");
            return;
        }

        System.out.println("Elements in LinkedList: ");
        while (node != null) {
            System.out.print(node.data + " -> ");
            node = node.next;
        }
        System.out.print("NULL");
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.printList();
        System.out.println();

        /* Inserting data to the end of LinkedList */
        Node dataAtEnd = new Node(4);
        linkedList.insertDataInToEndOfList(dataAtEnd);
        linkedList.printList();
        System.out.println();

        /* Inserting data to the start of LinkedList */
        Node dataAtStart = new Node(0);
        linkedList.insertDataIntoStartOfList(dataAtStart);
        linkedList.printList();
        System.out.println();

        /* Inserting data to the middle of LinkedList */
        Node dataAtMiddle = new Node(2.5);
        linkedList.insertDataIntoMiddleOfList(dataAtMiddle, 2);
        linkedList.printList();
        System.out.println();

        /* Deleting data from middle of LinkedList */
        linkedList.deleteFirstOccuranceOfNode(2.5);
        linkedList.printList();
        System.out.println();

        Node middleOfList = linkedList.getMiddleOfList();
        System.out.println("Middle of LinkedList: " + middleOfList);
        System.out.println();

        /* Deleting data at given position in LinkedList */
        linkedList.deleteNodeAtGivenPosition(2);
        linkedList.printList();
        System.out.println();

        System.out.println("Length of LinkedList: " + linkedList.listLength());
        System.out.println();

        System.out.println("Node 3 found in List: " + linkedList.findNodeInList(3));
        System.out.println("Node 2.5 found in List: " + linkedList.findNodeInList(2.5));
        System.out.println();

        Node nodeInSecondIndex = linkedList.getNthNodeInList(2);
        System.out.println("Finding 2nd Node in the List: " + nodeInSecondIndex);
        System.out.println();

        Node thirdLastNodeInList = linkedList.getNthNodeFromLast(3);
        System.out.println("Finding 2nd Last Node in the List: " + thirdLastNodeInList);
        System.out.println();

        Node middleOfList1 = linkedList.getMiddleOfList();
        System.out.println("Middle of LinkedList: " + middleOfList1);
        System.out.println();

        System.out.println("No of Occurances of 3.0 in List: " + linkedList.countNoOfOccurancesInList(3.0));
        System.out.println();

        Node dataAtEnd2 = new Node(3);
        linkedList.insertDataInToEndOfList(dataAtEnd2);
        System.out.println("No of Occurances of 3.0 in List after inserting additional one: " + linkedList.countNoOfOccurancesInList(3.0));
        System.out.println();

        System.out.println("LinkedList has loop: " + linkedList.hasLoop());
        System.out.println();

        linkedList.deleteList();
        linkedList.printList();
    }

}