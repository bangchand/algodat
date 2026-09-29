class Main {
    public static void main(String[] args) {
        Book buku1 = new Book("Bumi Manusia", "Pramoedya Ananta Toer");
        Book buku2 = new Book("Laskar Pelangi", "Andrea Hirata");
        
        ListADT<Book> bookList = new LinkedList<>(buku1);
        bookList.append(buku2);
        System.out.println(bookList.get(1).judul);
        
        bookList.printList();
    }
}

