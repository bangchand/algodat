public class BubbleSort {
    public static void sort(LinkedList list) {
        if (list.isEmpty() || list.getLength() == 1) return;

        boolean swapped;
        do {
            swapped = false;
            Node current = list.getHead();
            while (current.getNext() != null) {
                Node next = current.getNext();
                if ((int) current.getValue() > (int) next.getValue()) {
                    Object temp = current.getValue();
                    current.setValue(next.getValue());
                    next.setValue(temp);
                    swapped = true;
                }
                current = next;
            }
        } while (swapped);
    }
}
