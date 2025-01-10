import java.util.ArrayList;
import java.util.List;

public class M_Colouring63 {
    public static boolean graphColoring(int v, List<int[]> edges, int m) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            adj.get(0).add(1);
            adj.get(1).add(0);
        }
        int[] color = new int[v];
        return solve(0, adj, v, m, color);
    }

    public static boolean solve(int node, List<List<Integer>> adj, int v, int m, int[] color) {
        if (node == v) {
            return true;
        }
        for (int i = 1; i <= m; i++) {
            if (IsSafe(node, adj, v, m, color, i)) {
                color[node] = i;
                if (solve(node + 1, adj, v, m, color)) {
                    return true;
                }
                color[node] = 0;
            }
        }

        return false;
    }

    private static boolean IsSafe(int node, List<List<Integer>> adj, int v, int m, int[] color, int col) {
        for (int i : adj.get(node)) {
            if (color[i] == col) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // Initialize the edges as a List of int arrays (edges)
        List<int[]> edges = new ArrayList<>();
        edges.add(new int[] { 0, 1 });
        edges.add(new int[] { 1, 2 });
        edges.add(new int[] { 2, 3 });
        edges.add(new int[] { 3, 0 });
        edges.add(new int[] { 0, 2 });
        int v = 4;
        int m = 2;
        System.out.println(graphColoring(v, edges, m));
    }
}