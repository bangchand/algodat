public class SortingMain {
    public static void main(String[] args) {
        int[] data = {4, 8, 2, 7, 9, 6, 5, 1, 3};

        LinkedList list1 = new SinglyLinkedList();
        LinkedList list2 = new SinglyLinkedList();
        LinkedList list3 = new SinglyLinkedList();
        LinkedList list4 = new SinglyLinkedList();
        LinkedList list5 = new SinglyLinkedList();

        for (int i = 0; i < data.length; i++) {
            list1.append(data[i]);
            list2.append(data[i]);
            list3.append(data[i]);
            list4.append(data[i]);
            list5.append(data[i]);
        }

        System.out.print("Data Awal      : ");
        list1.printList();

        BubbleSort.sort(list1);
        System.out.print("Bubble Sort    : ");
        list1.printList();

        SelectionSort.sort(list2);
        System.out.print("Selection Sort : ");
        list2.printList();

        InsertionSort.sort(list3);
        System.out.print("Insertion Sort : ");
        list3.printList();

        MergeSort.sort(list4);
        System.out.print("Merge Sort     : ");
        list4.printList();

        QuickSort.sort(list5);
        System.out.print("Quick Sort     : ");
        list5.printList();
    }
}
