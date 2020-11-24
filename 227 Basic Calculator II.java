import java.util.Stack;

public class LeetCode227 {
    public int calculate(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<Character> opStack = new Stack<>();
        int i = 0;
        int j = s.length();
        char[] sChar = s.toCharArray();
        int number =0;
        //StringBuffer sb = new StringBuffer();
        while (i < j) {
            char ch = sChar[i];
            if (ch >= '0' && ch <= '9') {
                number = number*10 + ch-'0';
                //sb.append(ch);
            } else if(ch == '+' || ch == '-' ||ch == '*' || ch == '/'){
                //numStack.push(Integer.parseInt(sb.toString()));
                numStack.push(number);
                number =0;
                //sb = new StringBuffer();
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
                numStack.push(number);
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
