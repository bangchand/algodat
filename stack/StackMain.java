public class StackMain {
    public static void main(String[] args) {
        System.out.println("--- Tes Stack (Menggunakan SinglyLinkedList) ---");
        LinkedStack s = new LinkedStack();
        s.push("A");
        s.push("B");
        s.push("C");
        s.printStack();

        System.out.println("Peek: " + s.peek());
        System.out.println("Pop : " + s.pop());
        s.printStack();

        System.out.println("\n--- Tes Infix to Postfix ---");
        String[] rumus = {
            "A + B * C",
            "(A + B) * C",
            "A + B * C - D / E",
            "2 + 3 * 4"
        };

        for (int i = 0; i < rumus.length; i++) {
            String infix = rumus[i];
            String postfix = InfixToPostfix.convert(infix);
            System.out.println("Infix  : " + infix);
            System.out.println("Postfix: " + postfix);
            System.out.println();
        }
    }
}
