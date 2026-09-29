class LinkedList<T> implements ListADT<T> {
    private Node<T> head;
    private Node<T> tail;
    private int length;

    public LinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    public LinkedList(T value) {
        Node<T> newNode = new Node<T>(value);
        this.head = newNode;
        this.tail = newNode;
        this.length = 1;
    }

    public void append(T value) {
        Node<T> newNode = new Node<T>(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    public T removeLast() {
        if (length == 0) return null;
        Node<T> temp = head;
        Node<T> pre = head;
        while (temp.getNext() != null) {
            pre = temp;
            temp = temp.getNext();
        }
        tail = pre;
        tail.setNext(null);
        length--;
        if (length == 0) {
            head = null;
            tail = null;
        }
        return temp.getValue();
    }

    public void prepend(T value) {
        Node<T> newNode = new Node<T>(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    public T removeFirst() {
        if (length == 0) return null;
        Node<T> temp = head;
        head = head.getNext();
        temp.setNext(null);
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp.getValue();
    }

    private Node<T> getNode(int index) {
        if (index < 0 || index >= length) return null;
        Node<T> temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    public T get(int index) {
        Node<T> temp = getNode(index);
        return temp != null ? temp.getValue() : null;
    }

    public boolean set(int index, T value) {
        Node<T> temp = getNode(index);
        if (temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }

    public boolean insert(int index, T value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node<T> newNode = new Node<T>(value);
        Node<T> temp = getNode(index - 1);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        length++;
        return true;
    }

    public T remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node<T> prev = getNode(index - 1);
        Node<T> temp = prev.getNext();

        prev.setNext(temp.getNext());
        temp.setNext(null);
        length--;
        return temp.getValue();
    }

    public void printList() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.getValue() + (temp != tail ? " -> " : ""));
            temp = temp.getNext();
        }
        System.out.println();
    }

    public int getLength() {
        return length;
    }
}
