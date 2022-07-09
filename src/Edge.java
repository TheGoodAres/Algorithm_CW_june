public class Edge {
    private Vertex to;
    private double weight;

    public Edge(Vertex to, double weight) {
        super();
        this.to = to;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public Vertex getTo() {
        return to;
    }
}
