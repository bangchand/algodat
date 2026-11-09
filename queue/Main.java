package queue;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Simulasi Antrian Bank (Queue) ===");
        Queue antrianBank = new LinkedQueue();

        // 1. Pelanggan datang dan mengambil nomor antrian (Enqueue)
        System.out.println("\nPelanggan datang mengantre:");
        antrianBank.enqueue("Budi");
        antrianBank.enqueue("Siti");
        antrianBank.enqueue("Andi");

        // Tampilkan antrian
        ((LinkedQueue) antrianBank).printQueue();
        System.out.println("Jumlah orang mengantre: " + antrianBank.size());

        // 2. Cek siapa yang paling depan tanpa dilayani dulu (Peek)
        System.out.println("\nSiapa paling depan? -> " + antrianBank.peek());

        // 3. Teller memanggil dan melayani antrian terdepan (Dequeue - FIFO)
        System.out.println("\nTeller memanggil antrian...");
        System.out.println("Melayani: " + antrianBank.dequeue());

        ((LinkedQueue) antrianBank).printQueue();

        System.out.println("\nPelanggan baru datang: Dewi");
        antrianBank.enqueue("Dewi");
        ((LinkedQueue) antrianBank).printQueue();

        System.out.println("\nTeller melayani lagi:");
        System.out.println("Melayani: " + antrianBank.dequeue());
        System.out.println("Melayani: " + antrianBank.dequeue());

        ((LinkedQueue) antrianBank).printQueue();
        System.out.println("Sisa orang dalam antrian: " + antrianBank.size());
    }
}

