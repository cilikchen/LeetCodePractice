import java.util.Stack;

public class LeetCode224 {
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
        char[] sChar = s.toCharArray();
        int number = 0;

        while (i < j) {
            char ch = sChar[i];
            if (ch >= '0' && ch <= '9') {
                if(number ==-1){
                    number =0;
                }
                number = number * 10 + ch - '0';
            } else if(ch == '+' || ch == '-'||ch == '(' || ch == ')' ){
                if(number!=-1){
                    numStack.push(number);
                    number = -1;
                }
                if (ch == '(') {
                    opStack.push(ch);
                } else if (ch == '+' || ch == '-') {
                    if (!opStack.isEmpty()) {
                        if (opStack.peek() != '(') {
                            numStack.push(cal(numStack.pop(), numStack.pop(), opStack.pop()));
                        }
                    }
                    opStack.push(ch);

                } else {
                    while (opStack.peek() != '(' ) {
                        numStack.push(cal(numStack.pop(), numStack.pop(), opStack.pop()));
                    }
                    opStack.pop();
                }
            }
            if (i == j - 1 && (ch >= '0' && ch <= '9')) {
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
