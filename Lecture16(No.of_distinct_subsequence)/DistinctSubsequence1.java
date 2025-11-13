// package Lecture16(No.of_distinct_subsequence);

public class DistinctSubsequence1 {
    public static void main(String[] args){
        //now we are trying method 2 to solve this distinctsubsequence problem
        String s = "babgbag";   
        String t = "bag";
        int[][] dp = new int[s.length()][t.length()];
        for(int[] a: dp){
            Arrays.fill(a,-1);

        }
        int k = solve(s,t,s.length()-1,t.length() -1,dp);
        System.out.println(k);
    }
    private static int solve(String s, String t, int i , int j, int[][] dp){
        if(j < 0)return 1;
        if(i<0)return 0;
        if(dp[i][j] != -1)return dp[i][j];
        int inc =0;
        if(s.charAt(i) == t.charAt(j)){
            inc = solve(s,t,i-1,j-1,dp);
        }
        int notice = solve(s,t,i-1,j,dp);
        return dp[i][j] = inc + notice;
    }

}
