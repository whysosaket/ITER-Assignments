import java.util.ArrayDeque;

public class Question5 {
    public static void main(String[] args) {

        int [][] graph = {
            {0,1,1,0,0,0},
            {1,0,0,1,1,0},
            {1,0,0,0,1,0},
            {0,1,0,0,1,1},
            {0,1,1,1,0,1},
            {0,0,0,1,1,0}
        };

        bfs(graph, 0);
        
    }

    // traverse a graph using bfs using ArrayDequeue
    public static void bfs(int [][] graph, int start) {
        boolean [] visited = new boolean[graph.length];
        ArrayDeque<Integer> queue = new ArrayDeque<Integer>();
        queue.add(start);
        visited[start] = true;
        while(!queue.isEmpty()) {
            int node = queue.remove();
            System.out.print(node + " ");
            for(int i=0;i<graph.length;i++) {
                if(graph[node][i] == 1 && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
    
}
