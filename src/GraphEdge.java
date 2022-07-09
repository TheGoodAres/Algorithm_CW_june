public class GraphEdge {
    private Vertex from;
    private Vertex to;
    private double weight;

    GraphEdge(Vertex from, Vertex to, double weight) {
        this.from = from;
        this.to = to;
        this.weight = weight;
    }
}
