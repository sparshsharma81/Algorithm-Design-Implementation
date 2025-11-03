import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.*;
public class heap {
    List<Integer>heap = new ArrayList<Integer>();
    public int parent(int ci){
        return (ci - 1)/2;

    }
    public void swap(int ci, int pi){
        int val1 = heap.get(pi);
        int val2 = heap.get(ci);
        heap.set(val1,ci);
        heap.set(val2,pi);


    }

    public int remove(){
        int ans = heap.get(0);
        int last = heap.remove(heap.size() -1);
        if(heap.size() != 0){
            heap.set(0,last);
            //0th index pr last element ko set kar do
            while(true){
           int pi=0;
           int min = pi;
           int lc = 2 * pi + 1; //this is left child
           int rc = 2 * pi + 2;  //this is right child

           if(lc < heap.size() && heap.get(lc) < heap.get(pi)){
            min = lc;
           }
           if(rc< heap.size() && heap.get(rc) < heap.get(min)){
            min = rc;
           }

           if(min == pi){
            break;
           }
           swap(min,pi);
           pi = min;
        }
    

        }
        heap.set(0,last);
        // heapify(0);
        // return ans;
    }
    public boolean isEmpty(){
        return heap.size() == 0;

    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        return heap.get(0);
    }
    //now making function 
    public void insert(int data){
        heap.add(data);
        int ci = heap.size()-1;
        while(ci > 0 && heap.get(ci) < heap.get(parent(ci))){
            //now we need to do the swapping work 
                swap(ci,parent(ci));
                ci = parent(ci);
        }

    }
    public static void main(String args[]){
        heap h = new heap();
        h.insert(50);
        h.insert(40);
        h.insert(30);
        h.insert(20);
        h.insert(10);
        h.insert(102);

        System.out.println(h.heap);
    }
}
