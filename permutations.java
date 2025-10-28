import java.util.*;
public class permutations {
    public static void main(String args[]){
        int[] arr = {1,2,3,4,5};
        List<Integer>list = new ArrayList<>();
        solve(arrlist,0);
    }
    private static void solve(int[] arr, int idx){
        if(list.size() == arr.length){
            System.out.println(list);
            return;
        }
        for(int i=0;i<arr.length;i++){
            if(!list.contains(arr[i])){
                list.add(arr[i]);
                solve(arr,list);
                list.remove(list.size() -1);
            }
        }
    }
}
