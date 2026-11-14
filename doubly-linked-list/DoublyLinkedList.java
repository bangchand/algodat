public class DoublyLinkedList {
    private DoubleNode head;
    private DoubleNode tail;
    private int length;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public DoublyLinkedList(Object value) {
        DoubleNode newNode = new DoubleNode(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(Object value) {
        DoubleNode newNode = new DoubleNode(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        length++;
    }

    public void prepend(Object value) {
        DoubleNode newNode = new DoubleNode(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        length++;
    }

    public DoubleNode removeFirst() {
        if (length == 0) return null;
        DoubleNode temp = head;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            head = head.getNext();
            head.setPrev(null);
            temp.setNext(null);
        }
        length--;
        return temp;
    }

    public DoubleNode removeLast() {
        if (length == 0) return null;
        DoubleNode temp = tail;
        if (length == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.getPrev();
            tail.setNext(null);
            temp.setPrev(null);
        }
        length--;
        return temp;
    }

    public DoubleNode getHead() {
        return head;
    }

    public DoubleNode getTail() {
        return tail;
    }

    public int getLength() {
        return length;
    }

    public boolean isEmpty() {
        return length == 0;
    }

    public void printList() {
        DoubleNode current = head;
        System.out.print("[ ");
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
        System.out.println("]");
    }
}

