public class Test {

    public static void main(String[] args) {
        int[][] conn = { { 0, 4, 0, 0, 5 },
                { 4, 0, 3, 6, 1 },
                { 0, 3, 0, 6, 2 },
                { 0, 6, 6, 0, 7 },
                { 5, 1, 2, 7, 0 },
        };

        Graph G = new Graph(conn);

        G.Prim();
    }
}