public class InfixToPostfix {

    public static int derajat(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;
        }
        return 0;
    }

    public static String convert(String infix) {
        String postfix = "";
        Stack stack = new LinkedStack();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            if (c == ' ') {
                continue;
            }

            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            } else if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                while (!stack.isEmpty() && (char) stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop(); // buang '('
            } else {
                while (!stack.isEmpty() && (char) stack.peek() != '(' && derajat((char) stack.peek()) >= derajat(c)) {
                    postfix += stack.pop();
                }
                stack.push(c);
            }
        }

        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }
}
