/**
 * Stack implementation yang memanfaatkan SinglyLinkedList dari folder linked-list
 */
public class LinkedStack implements Stack {
    private SinglyLinkedList list;

    public LinkedStack() {
        this.list = new SinglyLinkedList();
    }

    @Override
    public void push(Object value) {
        // Push menambahkan elemen di paling depan (prepend) O(1)
        list.prepend(value);
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        // Pop mengambil elemen paling depan (removeFirst) O(1)
        Node removed = list.removeFirst();
        return removed != null ? removed.getValue() : null;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        Node topNode = list.getHead();
        return topNode != null ? topNode.getValue() : null;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.getLength();
    }

    public void printStack() {
        System.out.print("Stack (top -> bottom): ");
        list.printList();
    }
}
