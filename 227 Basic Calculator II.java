import java.util.Stack;

public class LeetCode227 {
    public int calculate(String s) {
        StringBuffer br = new StringBuffer();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch != ' ') {
                br.append(ch);
            }

        }

        s = br.toString();

        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        int i = 0;
        int j = s.length();
        StringBuffer sb = new StringBuffer();
        while (i < j) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                sb.append(ch);
            } else {
                numStack.push(Integer.parseInt(sb.toString()));
                sb = new StringBuffer();

                if (ch == '+' || ch == '-') {
                    while (!opStack.isEmpty()) {
                        numStack.push(cal(numStack.pop(), numStack.pop(), opStack.pop()));

                    }
                    opStack.push(ch);
                } else if (ch == '*' || ch == '/') {
                    while (!opStack.isEmpty()) {
                        if (opStack.peek() == '*' || opStack.peek() == '/') {

                            numStack.push(cal(numStack.pop(), numStack.pop(), opStack.pop()));
                        } else break;

                    }
                    opStack.push(ch);
                }
            }

            if (i == j - 1) {
                numStack.push(Integer.parseInt(sb.toString()));
            }
            i++;
        }

        while (!opStack.isEmpty()) {
            numStack.push(cal(numStack.pop(), numStack.pop(), opStack.pop()));

        }

        return numStack.peek();
    }

    private int cal(int num2, int num1, char op) {
        if (op == '+') {
            return (num1 + num2);
        } else if (op == '-') {
            return (num1 - num2);
        } else if (op == '*') {
            return (num1 * num2);
        } else if (op == '/') {
            return (num1 / num2);
        } else return 0;
    }
}