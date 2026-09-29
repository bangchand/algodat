public interface ListADT<T> {
    void append(T value);
    void prepend(T value);
    T removeLast();
    T removeFirst();
    T get(int index);
    boolean set(int index, T value);
    boolean insert(int index, T value);
    T remove(int index);
    void printList();
    int getLength();
}
