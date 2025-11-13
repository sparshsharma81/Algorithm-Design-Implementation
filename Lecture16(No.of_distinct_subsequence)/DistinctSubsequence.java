// package Lecture16(No.of_distinct_subsequence);

public class DistinctSubsequence {
    public static void main(String args[]){
        String s = "baag";
        String t = "bag";
        int k = solve(s,t,s.length()-1,t.length()-1);

        System.out.println(k);
        //now here we need to return k
    }
    private static int solve(String s, String t, int i, int j){
        if(j < 0)return 1;
        if(i < 0)return 0;
        int inc =0;
        if(s.charAt(i) == t.charAt(j)){
            inc = solve(s, t, i-1, j-1);

        }
        int notice = solve(s,t,i-1,j);
        return inc + notice;
    }
}
