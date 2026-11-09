package stack;

public class LinkedStack implements Stack {
    private Node top;
    private int size;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(Object value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        size++;
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            System.out.println("Stack kosong!");
            return null;
        }
        Object item = top.data;
        top = top.next;
        size--;
        return item;
    }

    @Override
    public Object peek() {
        if (isEmpty()) {
            return null;
        }
        return top.data;
    }

    @Override
    public boolean isEmpty() {
        return top == null;
    }

    @Override
    public int size() {
        return size;
    }

    public void printStack() {
        Node current = top;
        System.out.print("Stack (top -> bottom): ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
