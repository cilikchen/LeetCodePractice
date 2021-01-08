public class LeetCode1662 {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
//        String w1 = String.join("",word1);
//        String w2 = String.join("",word2);
//
//        return w1.equals(w2);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (String i : word1) {
            sb1.append(i);
        }

        for (String i : word2) {
            sb2.append(i);
        }

        return String.valueOf(sb1).equals(String.valueOf(sb2));

    }
}
