package stack;

public class InfixToPostfix {

    // Fungsi cek derajat/prioritas operator
    public static int derajat(char op) {
        if (op == '+' || op == '-') {
            return 1;
        } else if (op == '*' || op == '/') {
            return 2;
        } else if (op == '^') {
            return 3;
        }
        return 0; // untuk tanda kurung '(' atau karakter lain
    }

    // Fungsi konversi infix ke postfix
    public static String convert(String infix) {
        String postfix = "";
        Stack stack = new LinkedStack();

        for (int i = 0; i < infix.length(); i++) {
            char c = infix.charAt(i);

            // Kalau spasi, lewati saja
            if (c == ' ') {
                continue;
            }

            // 1. Kalau operand (huruf atau angka), langsung masukkan ke postfix
            if (Character.isLetterOrDigit(c)) {
                postfix += c;
            }
            // 2. Kalau kurung buka '(', push ke stack
            else if (c == '(') {
                stack.push(c);
            }
            // 3. Kalau kurung tutup ')', pop semua sampai ketemu '('
            else if (c == ')') {
                while (!stack.isEmpty() && (char) stack.peek() != '(') {
                    postfix += stack.pop();
                }
                stack.pop(); // buang '(' dari stack
            }
            // 4. Kalau operator (+, -, *, /, ^)
            else {
                // Selama derajat operator di atas stack >= derajat operator sekarang, pop ke postfix
                while (!stack.isEmpty() && (char) stack.peek() != '(' && derajat((char) stack.peek()) >= derajat(c)) {
                    postfix += stack.pop();
                }
                // Push operator sekarang ke stack
                stack.push(c);
            }
        }

        // Pop sisa operator di stack
        while (!stack.isEmpty()) {
            postfix += stack.pop();
        }

        return postfix;
    }
}
