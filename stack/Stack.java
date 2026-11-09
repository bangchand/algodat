package stack;

public interface Stack {
    void push(Object value);
    Object pop();
    Object peek();
    boolean isEmpty();
    int size();
}
