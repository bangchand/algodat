package queue;

public class LinkedQueue implements Queue {
    private Node front;
    private Node rear;
    private int size;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;
    }

    @Override
    public void enqueue(Object value) {
        Node newNode = new Node(value);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        Object item = front.data;
        front = front.next;
        size--;

        if (front == null) {
            rear = null; // jika queue jadi kosong
        }
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return front.data;
    }

    @Override
    public boolean isEmpty() {
        return front == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void printQueue() {
        Node current = front;
        System.out.print("Antrian (front -> rear): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

