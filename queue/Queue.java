// ADT Queue
public interface Queue {
    void enqueue(Object value);
    Object dequeue();
    Object peek();
    boolean isEmpty();
    int size();
}
