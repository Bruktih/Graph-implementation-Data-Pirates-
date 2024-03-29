import java.util.*;

public class Test {
    public static void main(String arg[]) {
        int V = 6;
        int source = 0;
        List<List<Node>> adj_list = new ArrayList<List<Node>>();
        for (int i = 0; i < V; i++) {
            List<Node> item = new ArrayList<Node>();
            adj_list.add(item);
        }
        adj_list.get(0).add(new Node(1, 5));
        adj_list.get(0).add(new Node(2, 3));
        adj_list.get(0).add(new Node(3, 2));
        adj_list.get(0).add(new Node(4, 3));
        adj_list.get(0).add(new Node(5, 3));
        adj_list.get(2).add(new Node(1, 2));
        adj_list.get(2).add(new Node(3, 3));
     Dijkastra dpq = new Dijkastra(V);
        dpq.algo_dijkstra(adj_list, source);
        System.out.println("The shorted path from source node to other nodes:");
        System.out.println("Source\t\t" + "Node#\t\t" + "Distance");
        for (int i = 0; i < dpq.dist.length; i++)
            System.out.println(source + " \t\t " + i + " \t\t " + dpq.dist[i]);
    }
}