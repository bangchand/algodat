/**
 * Queue implementation yang memanfaatkan SinglyLinkedList dari folder linked-list
 */
public class LinkedQueue implements Queue {
    private SinglyLinkedList list;

    public LinkedQueue() {
        this.list = new SinglyLinkedList();
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
        // Dequeue: ambil dari paling depan (head) O(1)
        Node removed = list.removeFirst();
        return removed != null ? removed.getValue() : null;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        Node frontNode = list.getHead();
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
        System.out.print("Antrian (front -> rear): ");
        list.printList();
    }
}
