package Section3_Linked_Lists;

public class Main {
    public static void main(String[] args) {

//        LinkedList myLinkedList = new LinkedList(4);
//
//        myLinkedList.getHead();
//        myLinkedList.getTail();
//        myLinkedList.getLength();
//
//        myLinkedList.printList();

        LinkedList myLinkedList = new LinkedList(1);

        myLinkedList.append(2);
        myLinkedList.append(3);
        myLinkedList.append(4);

        myLinkedList.reverse2(1);
//        myLinkedList.append(23);
//        myLinkedList.append(7);
//
//        myLinkedList.set(1, 4);
//        myLinkedList.insert(1,1);
//        myLinkedList.printList();
//
//
//        myLinkedList.prepend(1);
//        myLinkedList.printList();
        myLinkedList.printList();
        // Trying to remove last function
        // 2 items - Returns 2 Node
        //System.out.println(myLinkedList.removeLast().value);
        // 1 Item - Returns 1 Node
        //System.out.println(myLinkedList.removeLast().value);
        // 0 Item - Returns null
        //System.out.println(myLinkedList.removeLast());
//        System.out.println(myLinkedList.get(3));
        // 2 items - Returns 2 Node
        //System.out.println(myLinkedList.removeFirst().value);
        // 1 Item - Returns 1 Node
        //System.out.println(myLinkedList.removeFirst().value);
        // 0 Item - Returns null
        //System.out.println(myLinkedList.removeLast());
    }
}
