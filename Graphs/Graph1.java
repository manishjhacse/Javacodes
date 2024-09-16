import java.util.*;

public class Graph1 {
    // Pair class for weighted graph to show in list
    class Pair {
        int node;
        int weight;

        Pair(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "(" + node + "," + weight + ")";
        }
    }

    int adjMatrix[][];
    List<List<Integer>> adjList;
    List<List<Pair>> adjListWighted;

    Graph1(int v) {
        adjMatrix = new int[v][v];
        adjList = new ArrayList<>();
        adjListWighted = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
            adjListWighted.add(new ArrayList<>());
        }
    }

    // add edges in matrix
    public void addEdgesInMatrix(int edges[][], boolean isDirected) {
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjMatrix[u][v] = 1;
            if (!isDirected)
                adjMatrix[v][u] = 1;
        }
    }

    // add edges in List
    public void addEdgesInList(int edges[][], boolean isDirected) {
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            adjList.get(u).add(v);
            if (!isDirected)
                adjList.get(v).add(u);
        }
    }

    // add wighted edge in Matrix
    public void addWeightedEdgesInMatrix(int edges[][], boolean isDirected) {
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            adjMatrix[u][v] = w;
            if (!isDirected)
                adjMatrix[v][u] = w;
        }
    }

    // add weighted edge in List
    public void addWeightedEdgesInList(int edges[][], boolean isDirected) {
        for (int i = 0; i < edges.length; i++) {
            int u = edges[i][0];
            int v = edges[i][1];
            int w = edges[i][2];
            if (isDirected) {
                Pair pair = new Pair(v, w);
                adjListWighted.get(u).add(pair);
            } else {
                Pair pair1 = new Pair(v, w);
                Pair pair2 = new Pair(u, w);
                adjListWighted.get(u).add(pair1);
                adjListWighted.get(v).add(pair2);
            }

        }
    }

    // print list
    public void printList() {
        for (int i = 0; i < adjList.size(); i++) {
            System.out.print(i + " -->");
            System.out.print("[");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.err.print(adjList.get(i).get(j));
                if (j != adjList.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    // print wwighted graph list
    public void printWeightedList() {
        for (int i = 0; i < adjListWighted.size(); i++) {
            System.out.print(i + " -->");
            System.out.print("[");
            for (int j = 0; j < adjListWighted.get(i).size(); j++) {
                System.err.print(adjListWighted.get(i).get(j));
                if (j != adjListWighted.get(i).size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            System.out.println();
        }
    }

    // print matrix
    public void printMatrix() {
        for (int i = 0; i < adjMatrix.length; i++) {
            System.err.print("Row " + i + "--> ");
            for (int j = 0; j < adjMatrix.length; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // get undirected graph degree
    public void getDegree(int edges[][], int nodes) {
        int degree[] = new int[nodes];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            degree[from]++;
            degree[to]++;
        }
        for (int i = 0; i < nodes; i++) {
            System.out.println("degree of " + i + " --> " + degree[i]);
        }
    }

    // get directed graph in and out degree
    public void getDirectedGraphDegree(int edges[][], int nodes) {
        int inDegree[] = new int[nodes];
        int outDegree[] = new int[nodes];
        for (int[] edge : edges) {
            int from = edge[0];
            int to = edge[1];
            inDegree[from]++;
            outDegree[to]++;
        }
        for (int i = 0; i < nodes; i++) {
            System.out.println("indegree of " + i + " --> " + inDegree[i] + " and outdegree is --> " + outDegree[i]);
        }
    }

    public static void main(String[] args) {
        Graph1 undirectedGraph = new Graph1(5);
        Graph1 directedGraph = new Graph1(5);
        int edges[][] = { { 0, 1 }, { 1, 2 }, { 3, 4 } };
        undirectedGraph.addEdgesInMatrix(edges, false);
        directedGraph.addEdgesInMatrix(edges, true);
        System.out.println("undirected Graph: ");
        undirectedGraph.printMatrix();
        System.out.println("directed Graph: ");
        directedGraph.printMatrix();
        Graph1 weightedUndirectedGraph = new Graph1(5);
        Graph1 weightedDirectedGraph = new Graph1(5);
        int weightedEdges[][] = { { 0, 1, 10 }, { 1, 2, 20 }, { 3, 4, 13 } };
        weightedUndirectedGraph.addWeightedEdgesInMatrix(weightedEdges, false);
        weightedDirectedGraph.addWeightedEdgesInMatrix(weightedEdges, true);
        System.out.println("Weighted undirected Graph: ");
        weightedUndirectedGraph.printMatrix();
        System.out.println("weighted directed Graph: ");
        weightedDirectedGraph.printMatrix();

        Graph1 g1 = new Graph1(5);
        System.out.println("Undirected Graph List: ");
        g1.addEdgesInList(edges, false);
        g1.printList();
        Graph1 g2 = new Graph1(5);
        g2.addEdgesInList(edges, true);
        System.out.println("Directed Graph List: ");
        g2.printList();

        Graph1 weightedUndirectedList = new Graph1(5);
        Graph1 weightedDirectedList = new Graph1(5);
        weightedUndirectedList.addWeightedEdgesInList(weightedEdges, false);
        weightedDirectedList.addWeightedEdgesInList(weightedEdges, true);
        System.out.println("Weighted undirected Graph List: ");
        weightedUndirectedList.printWeightedList();
        System.out.println("weighted directed Graph List: ");
        weightedDirectedList.printWeightedList();

        undirectedGraph.getDegree(edges, 5);
        directedGraph.getDirectedGraphDegree(edges, 5);        
    }
}