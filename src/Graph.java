import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Graph {
    private int count = 0;
    private HashSet<Vertex> vertices;

    public Graph() {
        vertices = new HashSet<>();
    }
    public List<Vertex> getVertices() {
        return (List<Vertex>) vertices;
    }
    public void addVertex(Vertex vertex) {
        vertices.add(vertex);
        count++;
    }
    public void all() {
        for (Vertex v : vertices) {
            System.out.printf("-----%s-------\n",v.getName());
            for (Edge e: v.getEdgeSet()) {
                System.out.printf(" %s -> %f -> %s\n",v.getName(), e.getWeight(),e.getTo().getName());
            }
        }
    }
    public boolean containsVertex(Vertex vertex) {
        boolean contains = false;
        for(Vertex v :vertices){
            if (v.getName() == vertex.getName()) {
                contains = true;

            }
        }
        count++;
        System.out.println(count);
        return contains;
    }
    public Vertex findVertex(String vertexName) {
        for (Vertex v : vertices){
            if(v.getName().equals(vertexName)) {
                return v;
            }
        }
        return null;
    }
}
