public class PriorityQueue {
    private PriorityNode front;
    private int size;

    public PriorityQueue() {
        front = null;
        size = 0;
    }

    public void enqueue(Object value, int priority) {
        PriorityNode newNode = new PriorityNode(value, priority);

        if (isEmpty() || priority < front.priority) {
            newNode.next = front;
            front = newNode;
        } else {
            PriorityNode current = front;
            while (current.next != null && current.next.priority <= priority) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
        size++;
    }

    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Priority Queue kosong!");
            return null;
        }
        Object item = front.data;
        front = front.next;
        size--;
        return item;
    }

    public Object peek() {
        if (isEmpty()) return null;
        return front.data;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return size;
    }

    public void printQueue() {
        PriorityNode current = front;
        System.out.print("PriorityQueue (front -> rear): ");
        while (current != null) {
            System.out.print("[" + current.data + " (prio:" + current.priority + ")] ");
            current = current.next;
        }
        System.out.println();
    }
}
