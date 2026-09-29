public abstract class LinkedList {
    protected Node head;
    protected Node tail;
    protected int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public LinkedList(Object value) {
        Node newNode = new Node(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public abstract void append(Object value);
    public abstract void prepend(Object value);
    public abstract Node removeFirst();
    public abstract Node removeLast();
    public abstract Node get(int index);
    public abstract boolean set(int index, Object value);
    public abstract boolean insert(int index, Object value);
    public abstract Node remove(int index);
    public abstract void printList();

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public Node getHead() {
        return head;
    }

    public Node getTail() {
        return tail;
    }
}
