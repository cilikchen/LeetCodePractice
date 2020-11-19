import java.util.Stack;

public class LeetCode394 {
    public String decodeString(String s) {
        Stack<Integer> count = new Stack<>();
        Stack<Character> alpha = new Stack<>();
        int i =0;
        while (i<s.length()){
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int start = i;
                while (s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9') i++;
                count.push(Integer.parseInt(s.substring(start, i + 1)));
            }else if(ch == '['){
                alpha.push('[');
            }else if (ch == ']'){
                StringBuilder sb = new StringBuilder();
                char temp = alpha.pop();
                while (temp!='['){
                    sb.append(temp);
                    temp = alpha.pop();
                }
                sb.reverse();
                int repeat = count.pop();
                StringBuilder sb2 = new StringBuilder();
                for(int j = 0; j < repeat; j ++){
                    sb2.append(sb);
                }
                for(int j=0;j<sb2.length();j++){
                    alpha.push(sb2.charAt(j));
                }

            }else{
                alpha.push(ch);
            }
            i++;
        }

        StringBuilder sb = new StringBuilder();
        while (!alpha.empty()){
            sb.append(alpha.pop());
        }
        sb.reverse();

        return sb.toString();

    }
}
