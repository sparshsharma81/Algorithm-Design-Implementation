// package Lecture8(Backtracking)(27Oct);
import java.util.*;

public class BackTracking {
    public static void main(String args[]){
        int[] arr = {1,2,3};
        int target =3 ;
        List<Integer>list = new ArrayList<>();
        solve(arr,target,list,0);

    }
    public static void solve(int[]arr ,int target, List<Integer>list, int idx){
        if(target == 0){
            System.out.println(list);
            return ;
        }
        if(target< 0)return;
        for(int i=idx;i<arr.length;i++){
            list.add(arr[i]);
            solve(arr,target-arr[i],list,i);
            list.remove(list.size() -1);
            //this single line is backtracking ..
            //which is kind of recurrsion only
            
        }
    }
    
}
