import java.util.*;
public class SubsetPartision {
    public static void main(String[] args){
        int[] arr = {1,5,11,5};
        int total = 0;
        for(int a: arr){
            total+= a;
        }
        System.out.println(solve(arr,0,0,total));
    }
    private static boolean solve(int[] arr, int idx, int sum , int total){
        if(idx>= arr.length)return false;
        if(sum == total)return true;
        boolean a = solve(arr,idx+1,sum,total);
        boolean b = false;
        if(total >= arr[idx]){
            b = solve(arr,idx+1,sum+arr[idx],total-arr[idx]);

        }
        return a || b;
    }
}