import java.util.Iterator;
import java.util.LinkedList;

public class GraphList {
    private int vertices;
    private LinkedList<Integer> adjList[];

    GraphList(int v) {
        this.vertices = v;
        adjList = new LinkedList[v];
        for (int i = 0; i < vertices; i++) {
            adjList[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v1, int v2) {
        adjList[v1].add(v2);
    }

    public void traverse(int v){
        boolean[] visited = new boolean[vertices];
        LinkedList<Integer> linkedList = new LinkedList<>();

        visited[v] = true;
        linkedList.add(v);

        while (!linkedList.isEmpty()){
            v= linkedList.poll();
            System.out.print(v+" ");

            Iterator<Integer> it = adjList[v].listIterator();
            while (it.hasNext()){
                int i  = it.next();
                if(!visited[i]){
                    visited[i] = true;
                    linkedList.add(i);
                }
            }
        }
        System.out.println();
    }
}
