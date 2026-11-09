/**
 * Queue implementation yang memanfaatkan DoublyLinkedList dari folder doubly-linked-list
 */
public class DoublyLinkedQueue implements Queue {
    private DoublyLinkedList list;

    public DoublyLinkedQueue() {
        this.list = new DoublyLinkedList();
    }

    @Override
    public void enqueue(Object value) {
        // Enqueue: masukkan di belakang (tail) O(1)
        list.append(value);
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        // Dequeue: ambil dari depan (head) O(1)
        DoubleNode removed = list.removeFirst();
        return removed != null ? removed.getValue() : null;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        DoubleNode frontNode = list.getHead();
        return frontNode != null ? frontNode.getValue() : null;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public int size() {
        return list.getLength();
    }

    public void printQueue() {
        System.out.print("DoublyLinkedQueue (front -> rear): ");
        list.printList();
    }
}
