import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Vertex {
    //Station Name
    private String name;
    private HashSet<Edge> edgeSet;

    public Vertex(String name) {
        this.name = name;
        this.edgeSet = new HashSet<>();
    }
    public String getName() {
        return name;
    }
    public Set<Edge> getEdgeSet() {
        return edgeSet;
    }
    public void addEdge(Edge edge) {
        this.edgeSet.add(edge);
    }

}
