// package Lecture23(Predict_The_Winner)(28Nov);

public class Predict_Winner {
    public static void main(String args[]){
        //now we are performing the predict the winner problem with dynamic programming approach
        //we will use memoization technique to optimize our solution
        

    }
    public boolean predictTheWinner(int[] nums) {
        int total =0;
        for(int i : nums)total+=i;
        int k = min(nums,0,nums.length-1);
        int p = total - k;
        return k>=p;
    }
    private int maxScore(int[] nums, int l , int r){
        if(l == r)return nums[l];
        int left = nums[l] + min(nums,l+1,r);
        int right = nums[r] + min(nums,l,r-1);
        return Math.max(left,right);
    }
    private int min(int[] nums, int l , int r){
        if(l == r)return 0;
        //this approach is when the player 2 play optimally..so we get the leftoverss....so sad
        int scoreleft = maxScore(nums,l+1,r);
        int scoreright = maxScore(nums,l, r-1);
        return Math.min(scoreleft , scoreright);

    }
}
