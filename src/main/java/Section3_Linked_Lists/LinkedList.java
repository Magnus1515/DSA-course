package Section3_Linked_Lists;

class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
    }
}

public class LinkedList {
    private Node head;
    private Node tail; //Cola o el final
    private int length;

    // Constructor
    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    // Get index method
    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    // Set value at index method
    public boolean set(int index, int value) {
        // first getting the index from the node
        Node temp = get(index);
        // if is different from null continue to change that value wit the new one
        if (temp != null) {
            temp.value = value;
            return true;
            // different case return false because doesn't exist
        } else {
            return false;
        }
    }

    public void prepend(int value) {
        Node newNode = new Node(value);

        // Other way to do it head.next == null that means is empty
        if (length == 0) {
            head = newNode;
            tail = newNode;

        } else {
            newNode.next = head;
            head = newNode;
        }
        length++;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node temp = head;

        head = head.next;
        temp.next = null;
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;

    }


    public Node removeLast() {
        if (length == 0) {
            return null;
        }
        // Starting initializing temp and pre
        Node temp = head;
        Node pre = head;

        // This way we know when temp gets to the final of the linked list
        // that's why is the second step so when is null finished the while loop
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        // Now assign tail = pre because we know is the pre last one
        // So we can delete it safety
        tail = pre;
        tail.next = null;
        // And of course reduce our length because now we have one less item
        length--;

        // This is a potential edge case where the linked list contains no items
        // So It is necessary to check for this condition and assign a null value accordingly
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp;
    }

    public boolean insert(int index, int value) {
        // if index or length is grater than index then return false
        if (index < 0 || index > length) {
            return false;
        }

        if (index == 0) {
            prepend(value);
            return true;
        }

        if (index == length) {
            append(value);
            return true;
        }

        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.next = temp.next;
        temp.next = newNode;
        length++;
        return true;

    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        if (index == 0) {
            return removeFirst();
        }

        // Using natural numbers
        if (index == length - 1) {
            return removeLast();
        }

        // Example Link List = 0[11] -> 1[3] -> 2[23] -> 3[7]
        // Deleting target index 2 [23]

        // prev = get(index - 1) = prev (2 -1) - prev = get(1) -> 1[3]
        // prev = 1[3]
        // temp = prev.nex - temp = 2[23]
        Node prev = get(index - 1);
        Node temp = prev.next;
        //Changing the pointing to the next node after deleting
        prev.next = temp.next;
        // Important to clarify null the next node because is already the end of it
        temp.next = null;
        length--;
        return temp;
    }

    // Example Link List = 0[11] -> 1[3] -> 2[23] -> 3[7]
    // First reverse head and tail
    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        // Temp is going to be in head node
        // before temp and after temp
        Node after = temp.next;
        // before node is null because head is the first one so everything behind that is empty or null
        Node before = null;

        for (int i = 0; i < length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }
    }
}
//    public void reverse2(Node head){
//
//        Node prev = null;
//
//        while (head != null){
//            Node after = head.next;
//            head.next = prev;
//            prev = head;
//            head = after;
//        }
//    }




