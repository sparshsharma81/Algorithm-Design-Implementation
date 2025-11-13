// package Lecture16(No.of_distinct_subsequence);

public class uncrossedlines {
    public static void main(String args[]){
        //soo the main logic is 
        int[] nums1 = {1,4,2};  
        int[] nums2 = {1,2,4};
        System.out.println(sovle(nums1,nums2,0,0));
    }
    private static int solve(int[] nums1, int[] nums2, int i, int j){
        if(i>=nums1.length || j>= nums2.length)return 0;
        if(nums1[i] == nums2[j]){
            return 1 + solve(nums1,nums2,i+1,j+1);
        }
        return Math.max(solve(nums1,nums2,i+1,j), solve(nums1,nums2,i,j+1));
    }
}
