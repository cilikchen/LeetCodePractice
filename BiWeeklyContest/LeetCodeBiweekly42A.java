import java.util.*;
import java.util.Queue;

public class LeetCodeBiweekly42A {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> Q_students = new LinkedList<>();
        Queue<Integer> Q_sandwiches = new LinkedList<>();
        int n = students.length * sandwiches.length;
        for (int i = 0; i < students.length; i++) {
            Q_students.add(students[i]);
            Q_sandwiches.add(sandwiches[i]);
        }
        while (!Q_students.isEmpty() && !Q_sandwiches.isEmpty() && n > 0) {
            if (Q_students.peek() == Q_sandwiches.peek()) {
                Q_students.poll();
                Q_sandwiches.poll();
            } else {
                int a = Q_students.poll();
                Q_students.add(a);
            }
            n--;
        }
        return Q_students.size();

    }
}
