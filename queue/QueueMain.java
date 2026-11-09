public class QueueMain {

    // 3. Checking Palindrome (menggunakan Queue dan Stack)
    public static boolean isPalindrome(String text) {
        Queue queue = new LinkedQueue();
        Stack stack = new LinkedStack();

        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c != ' ') {
                queue.enqueue(c);
                stack.push(c);
            }
        }

        while (!queue.isEmpty()) {
            char dariDepan = (char) queue.dequeue();
            char dariBelakang = (char) stack.pop();
            if (dariDepan != dariBelakang) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("1. Implementing Queue using Linked-List");
        System.out.println("==============================================");
        LinkedQueue lq = new LinkedQueue();
        lq.enqueue("A");
        lq.enqueue("B");
        lq.enqueue("C");
        lq.printQueue();
        System.out.println("Dequeue: " + lq.dequeue());
        lq.printQueue();

        System.out.println("\n==============================================");
        System.out.println("2. Implementing Queue using DoublyLinked-List");
        System.out.println("==============================================");
        DoublyLinkedQueue dlq = new DoublyLinkedQueue();
        dlq.enqueue("X");
        dlq.enqueue("Y");
        dlq.enqueue("Z");
        dlq.printQueue();
        System.out.println("Dequeue: " + dlq.dequeue());
        dlq.printQueue();

        System.out.println("\n==============================================");
        System.out.println("3. Checking Palindrome");
        System.out.println("==============================================");
        String[] kataList = {"kasur rusak", "katak", "algodat"};
        for (int i = 0; i < kataList.length; i++) {
            String kata = kataList[i];
            System.out.println("\"" + kata + "\" -> " + (isPalindrome(kata) ? "PALINDROM" : "BUKAN PALINDROM"));
        }

        System.out.println("\n==============================================");
        System.out.println("4. Implementing Queue using Circular Array");
        System.out.println("   (Sesuai contoh di slide)");
        System.out.println("==============================================");
        CircularArrayQueue caq = new CircularArrayQueue(8);
        caq.enqueue('b');
        caq.enqueue('c');
        caq.enqueue('d');
        caq.enqueue('e');
        caq.enqueue('f');
        caq.enqueue('g');
        caq.enqueue('h');
        caq.printQueue();

        System.out.println("enqueue('i') -> saat antrian penuh:");
        caq.enqueue('i');
        caq.printQueue();

        System.out.println("remove() / dequeue(): " + caq.dequeue());
        System.out.println("remove() / dequeue(): " + caq.dequeue());
        caq.printQueue();

        System.out.println("enqueue('j') -> berputar ke indeks depan:");
        caq.enqueue('j');
        caq.printQueue();

        System.out.println("\n==============================================");
        System.out.println("5. Implementing Priority Queue");
        System.out.println("==============================================");
        PriorityQueue pq = new PriorityQueue();
        pq.enqueue("Pasien Biasa (A)", 3);
        pq.enqueue("Pasien Gawat Darurat (B)", 1);
        pq.enqueue("Pasien Lansia (C)", 2);
        pq.printQueue();

        System.out.println("Dilayani lebih dulu: " + pq.dequeue());
        pq.printQueue();
    }
}
