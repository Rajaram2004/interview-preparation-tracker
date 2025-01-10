import java.util.ArrayList;
import java.util.List;

public class RatinaMaze {
    public static void solve(int i, int j, int[][] maze, boolean[][] visit, String path, List<String> ans, int n) {
        if (i == n - 1 && j == n - 1) {
            ans.add(path);
            System.out.println(path);
            return;
        }
        downsolve(i + 1, j, maze, visit, path, ans, n);

        leftsolve(i, j - 1, maze, visit, path, ans, n);

        rightsolve(i, j + 1, maze, visit, path, ans, n);

        upsolve(i - 1, j, maze, visit, path, ans, n);
    }

    public static void upsolve(int i, int j, int[][] maze, boolean[][] visit, String path, List<String> ans, int n) {
        if (i >= 0 && visit[i][j] == false && maze[i][j] == 1) {
            visit[i][j] = true;
            solve(i, j, maze, visit, path + "D -> ", ans, n);
            visit[i][j] = false;
        }

    }

    public static void rightsolve(int i, int j, int[][] maze, boolean[][] visit, String path, List<String> ans, int n) {
        if (j < n && visit[i][j] == false && maze[i][j] == 1) {
            visit[i][j] = true;
            solve(i, j, maze, visit, path + "R -> ", ans, n);
            visit[i][j] = false;
        }
    }

    public static void leftsolve(int i, int j, int[][] maze, boolean[][] visit, String path, List<String> ans, int n) {
        if (j >= 0 && visit[i][j] == false && maze[i][j] == 1) {
            visit[i][j] = true;
            solve(i, j, maze, visit, path + "L -> ", ans, n);
            visit[i][j] = false;
        }
    }

    public static void downsolve(int i, int j, int[][] maze, boolean[][] visit, String path, List<String> ans, int n) {
        if (i < n && visit[i][j] == false && maze[i][j] == 1) {
            visit[i][j] = true;
            solve(i, j, maze, visit, path + "D -> ", ans, n);
            visit[i][j] = false;
        }

    }

    public static void main(String[] args) {
        int n = 4;
        int[][] maze = { { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        List<String> ans = new ArrayList<String>();
        boolean[][] visit = new boolean[n][n];
        for (int i = 0; i < visit.length; i++) {
            for (int j = 0; j < visit[0].length; j++) {
                visit[i][j] = false;
            }
        }
        String path = "";
        solve(0, 0, maze, visit, path, ans, n);
    }
}