import java.util.*;

public class LeetCodeBiweekly39C {

    class Node {
        int id;
        int depth;
        int direction;
    }

    public int minimumJumps(int[] forbidden, int a, int b, int x) {
        Deque<Node> q = new LinkedList<Node>();
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        Node initial = new Node();
        initial.depth = 0;
        initial.id = 0;
        initial.direction = 0;

        for (int i = 0; i < forbidden.length; i++) {
            visited.add(forbidden[i]);
        }

        q.push(initial);

        while (!q.isEmpty()) {
            Node f = q.getFirst();
            q.pop();
            if (f.id == x) {
                return f.depth;
            }

            if (f.id + a <= x && f.id + a - b - b < 4000 && !visited.contains(f.id + a)) {
                visited.add(f.id + a);
                Node temp = new Node();
                temp.depth = f.depth + 1;
                temp.id = f.id + a;
                temp.direction = 0;
                q.push(temp);

            }
            if (f.direction != 1) {
                if (f.id - b >= 0 && !visited.contains(f.id - b)) {
                    visited.add(f.id - b);
                    Node temp = new Node();
                    temp.depth = f.depth + 1;
                    temp.id = f.id - b;
                    temp.direction = 1;
                    q.push(temp);

                }
            }


        }
        
        return -1;
    }
}
