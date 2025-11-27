// package Lecture22(Target_Sum)(27Nov);

public class target_sum {
    public static void main(String args[]){
        target_sum ts = new target_sum();
        int[] nums = {1,1,1,1,1};
        int target = 3;
        int a = ts.findTargetSumWays(nums,target);
        System.out.println(a);
    }
     public int findTargetSumWays(int[] nums, int target) {
        int a = solve(nums,target,0,0);
        return a;
    }
    private int solve(int[] nums, int target,int sum,int i){
        if(i == nums.length){
            return(sum == target)?1 : 0;
        // if(sum == target)return 1;
        }
        
        int min = solve(nums,target,sum-nums[i],i+1);
        int plus = solve(nums,target,sum+nums[i],i+1);
        return min+plus;

    }
}
