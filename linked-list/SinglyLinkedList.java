public class SinglyLinkedList extends LinkedList {
    public SinglyLinkedList() {
        super();
    }

    public SinglyLinkedList(Object value) {
        super(value);
    }

    @Override
    public void append(Object value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.setNext(newNode);
            tail = newNode;
        }
        length++;
    }

    @Override
    public void prepend(Object value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.setNext(head);
            head = newNode;
        }
        length++;
    }

    @Override
    public Node removeFirst() {
        if (length == 0) return null;
        Node temp = head;
        head = head.getNext();
        temp.setNext(null);
        length--;
        if (length == 0) {
            tail = null;
        }
        return temp;
    }

    @Override
    public Node removeLast() {
        if (length == 0) return null;
        Node temp = head;
        Node pre = head;
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
        return temp;
    }

    @Override
    public Node get(int index) {
        if (index < 0 || index >= length) return null;
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    @Override
    public boolean set(int index, Object value) {
        Node temp = get(index);
        if (temp != null) {
            temp.setValue(value);
            return true;
        }
        return false;
    }

    @Override
    public boolean insert(int index, Object value) {
        if (index < 0 || index > length) return false;
        if (index == 0) {
            prepend(value);
            return true;
        }
        if (index == length) {
            append(value);
            return true;
        }
        Node newNode = new Node(value);
        Node temp = get(index - 1);
        newNode.setNext(temp.getNext());
        temp.setNext(newNode);
        length++;
        return true;
    }

    @Override
    public Node remove(int index) {
        if (index < 0 || index >= length) return null;
        if (index == 0) return removeFirst();
        if (index == length - 1) return removeLast();

        Node prev = get(index - 1);
        Node temp = prev.getNext();

        prev.setNext(temp.getNext());
        temp.setNext(null);
        length--;
        return temp;
    }

    @Override
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.getValue());
            if (temp.getNext() != null) {
                System.out.print(" -> ");
            }
            temp = temp.getNext();
        }
        System.out.println();
    }
}
