// package Lecture10(CountPath)(29Oct);

public class Countpaths {
    public static void main(String args[]){
        int n = 3;
        int m = 3;
        int[][] arr = new int[3][3];
        int t = solve(arr,0,0);
        System.out.println(t);


    }
    private static int solve(int[][]arr , int row, int col){
        if(row == 2 && col == 2){
            return 1;
        }
        if(row > 2 || col > 2){
            return 0;
        }
        int a = solve(arr,row+1,col);
        int b = solve(arr,row,col+1);
        return a+b;

    }
    private static void print(int[][] arr, int row, int col, String path){
        if(row == 2 && col ==2 ){
            System.out.println(path);
            return;
        }
        if(row > 2 || col > 2){
            return;
        }
        print(arr,row+1,col,path+"D");
        print(arr,row,col+1,path+"R");
    }
}
