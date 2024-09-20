import java.util.*;

public class DFSTraversal {
    List<List<Integer>> adjList;

    DFSTraversal(int v) {
        adjList = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void convertToAdjList(int edges[][]) {
        int n = edges.length;
        for (int i = 0; i < n; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            adjList.get(v).add(u);

        }
    }

    public List<Integer> dfs(List<List<Integer>> adjList, int v) {
        boolean visited[] = new boolean[v];
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            if (!visited[i]) {
                dfsRec(adjList, i, visited, res);
            }
        }
        return res;

    }

    public void dfsRec(List<List<Integer>> adjList, int curNode, boolean[] visited, List<Integer> list) {
        visited[curNode] = true;
        list.add(curNode);
        for (int neighbour : adjList.get(curNode)) {
            if (!visited[neighbour]) {
                dfsRec(adjList, neighbour, visited, list);
            }
        }
    }

    public static void main(String[] args) {
        int edges[][] = { { 0, 1 }, { 1, 4 }, { 2, 3 }, { 0, 2 }, { 1, 3 }, { 3, 4 } };
        DFSTraversal graph = new DFSTraversal(5);
        graph.convertToAdjList(edges);
        List<Integer> result = graph.dfs(graph.adjList, 5);
        System.out.println("DFS Traversal of Graph is: ");
        System.out.println(result);
    }
}
