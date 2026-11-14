public class DoubleNode {
    private Object value;
    private DoubleNode prev;
    private DoubleNode next;

    public DoubleNode(Object value) {
        this.value = value;
        this.prev = null;
        this.next = null;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}

