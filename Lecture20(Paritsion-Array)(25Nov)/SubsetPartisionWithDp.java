public class SubsetPartisionWithDp {
    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        int total = 0;
        for (int a : arr) {
            total += a;
        }
        int[][] a = new int[arr.length + 1][total + 1];

        System.out.println(solve(arr, 0, 0, total, a));
    }
    private static int solve(int[] arr, int idx, int sum, int total , int[][] dp){
        if(idx>= arr.length)return 0;
        if(sum == total)return 1;
        if(dp[idx][total] != -1){
            return dp[idx][total];
            
        }
        int a = solve(arr,idx+1,sum,total,dp);
        int b =0;
        if(total >= arr[idx]){
            b = solve(arr,idx+1,sum+arr[idx],total-arr[idx],dp);
        }
        if(a== 1 || b ==1){
            dp[idx][total] = 1;
        }
        else{
            dp[idx][total] = 0;
        }
        // dp[idx][total] = a || b;
        return dp[idx][total];
    }
}
