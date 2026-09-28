class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(13);
        myLinkedList.append(69);
        myLinkedList.append(67);
        
        System.out.println("Isi Linked List awal:");
        myLinkedList.printList();
        
        System.out.println("\nMenambahkan 10 di awal (prepend):");
        myLinkedList.prepend(10);
        myLinkedList.printList();
        
        System.out.println("\nMenyisipkan 99 pada index 2:");
        myLinkedList.insert(2, 99);
        myLinkedList.printList();
        
        System.out.println("\nMenghapus elemen terakhir:");
        myLinkedList.removeLast();
        myLinkedList.printList();
        
        System.out.println("\nPanjang Linked List sekarang: " + myLinkedList.getLength());
    }
}