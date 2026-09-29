public class Main {
    public static void main(String[] args) {
        LinkedList listBuku = new SinglyLinkedList();

        Book b1 = new Book("Laskar Pelangi", 100);
        Book b2 = new Book("Bumi Manusia", 350);
        Book b3 = new Book("Filosofi Teras", 280);

        listBuku.append(b1);
        listBuku.append(b2);
        listBuku.append(b3);

        System.out.println("Daftar buku:");
        listBuku.printList();
        System.out.println("Jumlah buku: " + listBuku.getLength());

        System.out.println("\nAmbil buku index 1:");
        Node n = listBuku.get(1);
        if (n != null) {
            Book b = (Book) n.getValue();
            System.out.println(b.getTitle() + " - " + b.getPage() + " halaman");
        }

        System.out.println("\nSetelah remove first:");
        listBuku.removeFirst();
        listBuku.printList();
    }
}

