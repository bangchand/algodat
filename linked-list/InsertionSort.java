public class InsertionSort {
    public static void sort(LinkedList list) {
        if (list.isEmpty() || list.getLength() == 1) return;

        Node sorted = null;
        Node current = list.getHead();

        while (current != null) {
            Node next = current.getNext();

            if (sorted == null || (int) current.getValue() < (int) sorted.getValue()) {
                current.setNext(sorted);
                sorted = current;
            } else {
                Node temp = sorted;
                while (temp.getNext() != null && (int) temp.getNext().getValue() <= (int) current.getValue()) {
                    temp = temp.getNext();
                }
                current.setNext(temp.getNext());
                temp.setNext(current);
            }

            current = next;
        }

        list.head = sorted;
        Node tail = sorted;
        while (tail != null && tail.getNext() != null) {
            tail = tail.getNext();
        }
        list.tail = tail;
    }
}
