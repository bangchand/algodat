package queue;

public interface Queue {
    void enqueue(Object value); // Tambah data di belakang (rear)
    Object dequeue();           // Ambil dan hapus data di depan (front)
    Object peek();              // Lihat data di paling depan (front)
    boolean isEmpty();          // Cek apakah kosong
    int size();                 // Jumlah data
}

