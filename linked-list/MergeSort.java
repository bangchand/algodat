public class MergeSort {
    public static void sort(LinkedList list) {
        if (list.isEmpty() || list.getLength() == 1) return;

        list.head = mergeSort(list.getHead());

        Node tail = list.head;
        while (tail != null && tail.getNext() != null) {
            tail = tail.getNext();
        }
        list.tail = tail;
    }

    private static Node mergeSort(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node mid = getMiddle(head);
        Node rightHead = mid.getNext();
        mid.setNext(null);

        Node left = mergeSort(head);
        Node right = mergeSort(rightHead);

        return merge(left, right);
    }

    private static Node getMiddle(Node head) {
        Node slow = head;
        Node fast = head.getNext();
        while (fast != null && fast.getNext() != null) {
            slow = slow.getNext();
            fast = fast.getNext().getNext();
        }
        return slow;
    }

    private static Node merge(Node left, Node right) {
        if (left == null) return right;
        if (right == null) return left;

        Node result;
        if ((int) left.getValue() <= (int) right.getValue()) {
            result = left;
            result.setNext(merge(left.getNext(), right));
        } else {
            result = right;
            result.setNext(merge(left, right.getNext()));
        }
        return result;
    }
}
