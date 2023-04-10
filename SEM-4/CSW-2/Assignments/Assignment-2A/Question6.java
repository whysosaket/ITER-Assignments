import java.util.Stack;

public class Question6 {
    public static void main(String[] args) {

        int[][] graph = {
                { 0, 1, 1, 0, 0, 0 },
                { 1, 0, 0, 1, 1, 0 },
                { 1, 0, 0, 0, 1, 0 },
                { 0, 1, 0, 0, 1, 1 },
                { 0, 1, 1, 1, 0, 1 },
                { 0, 0, 0, 1, 1, 0 }
        };

        dfs(graph, 0);

    }

    // tarverse a graph using dfs using Stack
    public static void dfs(int[][] graph, int start) {
        boolean[] visited = new boolean[graph.length];
        Stack<Integer> stack = new Stack<Integer>();
        stack.push(start);
        visited[start] = true;
        while (!stack.isEmpty()) {
            int node = stack.pop();
            System.out.print(node + " ");
            for (int i = 0; i < graph.length; i++) {
                if (graph[node][i] == 1 && !visited[i]) {
                    stack.push(i);
                    visited[i] = true;
                }
            }
        }
    }
}
