// package Lecture11(Word Search)(30Oct).Sudoko Solver;

public class sudoko {
    public static void main(String args[]) {
        int[][] board = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0,6 ,0 ,0 ,5 ,0 ,7 ,8 ,4},
            {2 ,8 ,7 ,4 ,1 ,9 ,3 ,5 ,6},
            {3 ,4 ,5 ,2 ,8 ,6 ,1 ,9 ,7}
        };

        //the basic logic is if row == 9 then col =-
        solveSudoku(board);
        printBoard(board);
    }
    private static void solve(char[][] board, int row, int col){
        if(col == 9){
            row++;
            col =0;
        }
        if(row == 9){
            return; //this means that the sudoko is solved
        }
        //now also ..if there is no previous number..then we need to fill it there 
        ///so..
        if(board[row][col] != '.'){
            solve(board,row,col+1);
        }
        else{
            for(int val =1; val<=9;val++){
                if(issafe(board,row,col,(char)(val + 48)) == true){
                    board[row][col] = (char)(val + 48);
                    if(solve(board,row,col)){
                        return true;
                    }
                    board[row][col] = '.';
                }
            }
        }
    }

    private static boolean issafe(char[][] board, int row, int col, char val){
        // Check the row
        int r = row;
        int c = col;
        //for row 

        for(int i=0;i<=9;i++){
            if(board[r][i] == val)return false;
        }

        //for column
         for(int i =0;i<=9;i++){
            if(board[i][c] == ch)return false;

         }

         r = row - row % 3;
         c = col - col % 3;
         
         for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
            if(board[i][j] == val)return false;
            }
         }
    }
}
