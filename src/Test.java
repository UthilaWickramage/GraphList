public class Test {
    public static void main(String[] args) {
        GraphList graph = new GraphList(8);
        graph.addEdge(1,2);
        graph.addEdge(1,6);
        graph.addEdge(2,3);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(4,6);
        graph.addEdge(4,7);
        graph.addEdge(5,7);
        graph.addEdge(6,7);
graph.traverse(1);
    }
}
