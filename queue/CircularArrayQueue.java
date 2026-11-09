public class CircularArrayQueue implements Queue {
    private Object[] data;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularArrayQueue(int capacity) {
        this.capacity = capacity;
        this.data = new Object[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    @Override
    public void enqueue(Object value) {
        if (size == capacity) {
            System.out.println("Queue penuh! Tidak bisa menambah: " + value);
            return;
        }
        rear = (rear + 1) % capacity;
        data[rear] = value;
        size++;
    }

    @Override
    public Object dequeue() {
        if (isEmpty()) {
            System.out.println("Queue kosong!");
            return null;
        }
        Object item = data[front];
        data[front] = null;
        front = (front + 1) % capacity;
        size--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return data[front];
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    public void printQueue() {
        System.out.print("CircularArrayQueue: [ ");
        for (int i = 0; i < size; i++) {
            int index = (front + i) % capacity;
            System.out.print(data[index] + " ");
        }
        System.out.println("] (front=" + front + ", rear=" + rear + ", size=" + size + ")");
    }
}
