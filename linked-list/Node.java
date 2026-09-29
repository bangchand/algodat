class Node<T> {
    private T value;
    private Node<T> next;

    Node(T value) {
        this.value = value;
    }

    void setNext(Node<T> node) {
        this.next = node;
    }

    Node<T> getNext() {
        return this.next;
    }

    T getValue() {
        return this.value;
    }

    void setValue(T value) {
        this.value = value;
    }
}