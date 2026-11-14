public class SelectionSort {
    public static void sort(LinkedList list) {
        if (list.isEmpty() || list.getLength() == 1) return;

        Node current = list.getHead();
        while (current != null) {
            Node min = current;
            Node next = current.getNext();

            while (next != null) {
                if ((int) next.getValue() < (int) min.getValue()) {
                    min = next;
                }
                next = next.getNext();
            }

            Object temp = current.getValue();
            current.setValue(min.getValue());
            min.setValue(temp);

            current = current.getNext();
        }
    }
}
