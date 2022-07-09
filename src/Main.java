import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menu();
        Graph graph = new Graph();
        addData(graph, "csv_stations.csv");
        graph.all();

    }
    public static void menu() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.printf("Enter 1 to list all tube stations\n" +
                    "Enter 2 to choose 2 stations and get the shortest path\n" +
                    "Enter 3 to close the program.");
            String input_string = in.next();
            if (input_string.regex)
        }

    }
    public static void addData(Graph graph, String file){
        try {
            Scanner in = new Scanner(new File(file));
            while(in.hasNext()) {
                String line = in.nextLine();
                String[] componentsLine = line.split(",");
                Double weight = Double.valueOf(componentsLine[2]);
                Vertex v1 = new Vertex(componentsLine[0]);
                Vertex v2 = new Vertex(componentsLine[1]);

                Vertex v1_graph = graph.findVertex(v1.getName());
                Vertex v2_graph = graph.findVertex(v2.getName());
                if(v1_graph == null && v2_graph == null){
                    v1.addEdge(new Edge(v2, weight));
                    v2.addEdge(new Edge(v1, weight));
                    graph.addVertex(v1);
                    graph.addVertex(v2);
                }else {
                    if (v1_graph == null) {
                        v1.addEdge(new Edge(v2_graph, weight));
                        graph.addVertex(v1);
                    } else {
                        v1 = graph.findVertex(v1.getName());
                        v1.addEdge(new Edge(v2, weight));
                    }
                    if (v2_graph == null) {
                        v2.addEdge(new Edge(v1_graph, weight));
                        graph.addVertex(v2);
                    } else {
                        v2 = graph.findVertex(v2.getName());
                        v2.addEdge(new Edge(v1, weight));
                    }

                }

            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}