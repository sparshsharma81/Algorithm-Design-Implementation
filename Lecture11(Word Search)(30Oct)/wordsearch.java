// package Lecture11(Word Search)(30Oct);

public class wordsearch {
    public static void main(String args[]){
        String word = "SEE";
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
        };
        boolean visited[][] = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == word.charAt(0)){
                    solve(board,i,j,word,0,visited);
                }
            }
        }
    }
    private static boolean solve(char[][] board, int row , int col, String word, int idx , boolean visited[][]){
        if(idx == word.length())return true;
        if(row< 0 || col <0 || row >=board.length || col >= board[0].length )return false;
            // return false; // Out of bounds, already visited, or character mismatch
        // }

        if(word.charAt(idx) != board[row][col])return false;

        int[] r = {0,1,0,-1};
        int[] c = {1,0,-1,0};

        for(int i=0;i<c.length;i++){
            if(visited[row][col])return false;
            
        }
    }

    // private static boolean solve(char[][] board, String word, int row, int col, int index, boolean[][] visited) {
    //     if (index == word.length()) return true; // All characters matched
    //     if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
    //         return false; // Out of bounds or character mismatch
    //     }

    //     char temp = board[row][col]; // Store the current character
    //     board[row][col] = '#'; // Mark as visited

    //     // Explore all four directions
    //     boolean found = solve(board, word, row + 1, col, index + 1) ||
    //                     solve(board, word, row - 1, col, index + 1) ||
    //                     solve(board, word, row, col + 1, index + 1) ||
    //                     solve(board, word, row, col - 1, index + 1);

    //     board[row][col] = temp; // Restore the character
    //     return found;
    // }
    // private static boolean issol(char[][] board, String word) {
    //     for (int i = 0; i < board.length; i++) {
    //         for (int j = 0; j < board[0].length; j++) {
    //             if (board[i][j] == word.charAt(0)) { // Start search from matching character
    //                 if (solve(board, word, i, j, 0)) {
    //                     return true; // Word found
    //                 }
    //             }
    //         }
    //     }
    //     return false; // Word not found
    // }
}
