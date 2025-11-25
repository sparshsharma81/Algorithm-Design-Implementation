public class ShortestCommonSuperSequence {
    public static void main(String[] args) {
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";
        int lcsLength = lcs(s1, s2, s1.length(), s2.length());
        int scsLength = s1.length() + s2.length() - lcsLength;
        System.out.println("Length of Shortest Common Supersequence is: " + scsLength);
    }
    private static int lcs(String s1, String s2, int m, int n) {
        if (m == 0 || n == 0) {
            return 0;
        }
        if (s1.charAt(m - 1) == s2.charAt(n - 1)) {
            return 1 + lcs(s1, s2, m - 1, n - 1);
        } else {
            return Math.max(lcs(s1, s2, m - 1, n), lcs(s1, s2, m, n - 1));
        }
    }
}