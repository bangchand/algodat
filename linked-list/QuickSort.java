public class QuickSort {
    public static void sort(LinkedList list) {
        if (list.isEmpty() || list.getLength() == 1) return;
        quickSort(list.getHead(), list.getTail());
    }

    private static void quickSort(Node start, Node end) {
        if (start == null || end == null || start == end || start == end.getNext()) {
            return;
        }

        Node prevPivot = null;
        Node pivot = start;
        int pivotVal = (int) start.getValue();

        Node j = start.getNext();
        while (j != null && j != end.getNext()) {
            if ((int) j.getValue() < pivotVal) {
                prevPivot = pivot;
                pivot = pivot.getNext();
                Object temp = pivot.getValue();
                pivot.setValue(j.getValue());
                j.setValue(temp);
            }
            j = j.getNext();
        }

        Object temp = start.getValue();
        start.setValue(pivot.getValue());
        pivot.setValue(temp);

        if (prevPivot != null && start != pivot) {
            quickSort(start, prevPivot);
        }
        if (pivot != end && pivot.getNext() != null) {
            quickSort(pivot.getNext(), end);
        }
    }
}
