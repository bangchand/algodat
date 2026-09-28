class Node {
    private int value;
    private Node next;

    Node(int value) {
        this.value = value;
    }

    void setNext(Node node) {
        this.next = node;
    }

    Node getNext() {
        return this.next;
    }

    int getValue() {
        return this.value;
    }

    void setValue(int value) {
        this.value = value;
    }
}