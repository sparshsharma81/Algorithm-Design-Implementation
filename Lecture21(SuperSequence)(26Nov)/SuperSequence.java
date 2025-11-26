import java.util.*;//now we are importing everything from util package
public class SuperSequence {
    public static void main(String args[]){
        String s1 = "abca";
        String s2 = "cab";
        int m = s1.length();
        int n = s2.length();
        int[][] dp = new int[m+1][n+1];

        for(int i=1;i<=m;i++){
            for(int j=1;j<=n;j++){
                if(s1.charAt(i-1) == s2.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1] + 1;

                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        for(int[] a : dp){
            System.out.println(Arrays.toString(a));
        }
    }
    
    //method 2 
    public static void solve2(String s1, String s2){
    int m = s1.length();
    int n = s2.length();
    int i = m ;
    int j = n ;
    String s=  "";
    while(i>0 && j>0){
        if(s1.charAt(i-1) == s2.charAt(j-1)){
            s = s1.charAt(i-1) + s;
            i--;
            j--;
        }
        else{
            if(dp[i-1][j] > dp[i][j-1]){
                s = s1.charAt(i-1) + s;
                i--;
            }
            else{
                s = s2.charAt(j-1) + s;
                j--;
            }
        }
    }
    while(i>0){
        s = s1.charAt(i-1) + s;
        i--;
    }
    while(j>0){
        s = s2.charAt(j-1) + s;
        j--;
    }
    System.out.println(s);
}