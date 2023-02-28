package algorithms.graph;

import java.util.*;

public class Graph {

    private int v;
    private LinkedList<Integer> graph[];

    public Graph(int v) {
        this.v = v;
        graph = new LinkedList[v];

        for (int i = 0; i < v; i++){
            graph[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w){
        graph[v].add(w);
    }


    // *******DFS***********

    List<Integer> dfsIterative(int v){
        List<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        stack.push(v);

        while (!stack.isEmpty()){
            v = stack.pop();
            if (!visited[v]){
                result.add(v);
                visited[v] = true;
            }
            LinkedList<Integer> neighbours = graph[v];
            for (int i = 0; i < neighbours.size(); i++ ){
                v = neighbours.get(i);
                if (!visited[v]){
                    stack.push(v);
                }
            }
        }
        return result;
    }

    //**********BFS***********
    List<Integer> bfsIterative(int v){
        List<Integer> result = new ArrayList<>();

        boolean[] visited = new boolean[v];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(v);

        while (!queue.isEmpty()){
            v = queue.poll();
            if (!visited[v]){
                result.add(v);
                visited[v] = true;
            }
            LinkedList<Integer> neighbours = graph[v];
            for (int i = 0; i < neighbours.size(); i++ ){
                v = neighbours.get(i);
                if (!visited[v]){
                    queue.add(v);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Graph graph1 = new Graph(5);
        graph1.addEdge(0,1);
        graph1.addEdge(0,2);
        graph1.addEdge(0,3);
        graph1.addEdge(1,0);
        graph1.addEdge(1,2);
        graph1.addEdge(2,0);
        graph1.addEdge(2,4);
        graph1.addEdge(3,0);
        graph1.addEdge(4,2);

        System.out.println(graph1.bfsIterative(1));
        //System.out.println(graph1.dfsIterative(0));
    }
}
