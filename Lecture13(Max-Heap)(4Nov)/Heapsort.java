
import java.util.Arrays;

// package Lecture13(Max-Heap)(4Nov);

public class Heapsort {
    public static void main(String[] args){
        int[] arr = {5,7,2,9,11};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    private static void sort(int[] arr){
        int n = arr.length;
        for(int i = n-1;i>=0;i--){
            heapify(arr,n,i);
        }

        for(int i = n-1;i>0;i--){
            swap(arr,0,i);
            heapify(arr,i,0);
        }
    }
    
    private static void heapify(int[] arr, int n, int i){
        int pi =i;
        int max = pi;
        while(true){
            int lc = 2 * pi + 1; //this is left child
            int rc = 2 * pi + 2;  //this is right child

            if(lc < n && arr[lc] > arr[pi]){
             max = lc;
            }
            if(rc< n && arr[rc] > arr[max]){
             max = rc;
            }

            if(max == pi){
             break;
            }
            swap(arr,max,pi);
            pi = max;
        }
    }
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
