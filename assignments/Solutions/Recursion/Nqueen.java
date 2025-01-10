import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Nqueen {
    public static List<List<String>> solvequeen(int n){
        List<List<String>> ans=new ArrayList<>();
        char[][] board=new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j]='.';
            }
        }
        int[] left=new int[n];
        int[] topleft=new int[n*2-1];
        int[] bottomleft = new int[n*2-1];
        solve(0,board,ans,left,topleft,bottomleft);
        return ans;
    }
    public static void solve(int col,char[][] board ,List<List<String>> ans,int[] left,int[] topleft,int[] bottomleft){
        if(col==board.length){
           ans.add(construct(board));
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if(left[row]==0 && topleft[col+row]==0 && bottomleft[board.length-1 +col-row]==0){
                board[row][col]='Q';
                left[row]=1; 
                topleft[col+row]=1;
                bottomleft[board.length-1 +col-row]=1;
                solve(col+1,board,ans,left,topleft,bottomleft);
                board[row][col] = '.';
                left[row]=0; 
                topleft[col+row]=0;
                bottomleft[board.length-1 +col-row]=0;

            }
        }
    }
    public static List<String> construct(char[][] board){
        List<String> res = new LinkedList<String>();
        for (int i = 0; i < board.length; i++) {
           String s = new String(board[i]);
             res.add(s);
         }
         return res;
    }



     public static void main(String[] args) {
        int n=4;
        List<List<String>> queen=solvequeen(n);
        int counter=1;
        for(List<String> it : queen){
            System.err.println("Arrangement "+counter);
            for(String i : it){
                System.err.println(i);
            }
            counter++;
        }
     }
}




//Brute force time complexity N^3
// import java.util.ArrayList;
// import java.util.LinkedList;
// import java.util.List;

// public class Nqueen {
//     public static List<List<String>> solvequeen(int n) {
//         char[][] board = new char[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = '-';
//             }
//         }
//         List<List<String>> ans = new ArrayList<>();
//         dfs(0, board, n, ans);
//         return ans;
//     }

//     public static List<String> construct(char[][] board) {
//         List<String> res = new LinkedList<String>();
//         for (int i = 0; i < board.length; i++) {
//             String s = new String(board[i]);
//             res.add(s);
//         }
//         return res;
//     }

//     public static void dfs(int col, char[][] board, int n, List<List<String>> ans) {

//         if (board.length == col) {
//             ans.add(construct(board));
//             return;
//         }
//         for (int row = 0; row < n; row++) {
//             if(validate(row, col, board)) {
//                 board[row][col] = 'Q';
//                 dfs(col + 1, board, n, ans);
//                 board[row][col] = '-';
//             }
//         }

//     }

//     public static boolean validate(int row, int col, char[][] board) {
//         int dupcol = col;
//         int duprow = row;
//         // center to top left back digonal (\)
//         while (row >= 0 && col >= 0) {
//             if (board[row][col] == 'Q'){
//                 return false;
//             }
//             row--;
//             col--;
//         }
//         col = dupcol;
//         row = duprow;

//         // left check
//         while (col >= 0) {
//             if (board[row][col] == 'Q')
//                 return false;
//             col--;
//         }
//         col = dupcol;
//         row = duprow;

//         // center to bottom left digonal (/)
//         while (col >= 0 && row < board.length) {
//             if (board[row][col] == 'Q')
//                 return false;
//             col--;
//             row++;
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         int n = 4;
//         List<List<String>> queen = solvequeen(n);
//         int i = 1;
//         for (List<String> it : queen) {
//             System.out.println("Arrangement " + i);
//             for (String s : it) {
//                 System.out.println(s);
//             }
//             i++;
//         }
//     }
// }