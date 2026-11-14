public class PriorityNode {
    Object data;
    int priority;
    PriorityNode next;

    public PriorityNode(Object data, int priority) {
        this.data = data;
        this.priority = priority;
        this.next = null;
    }
}
