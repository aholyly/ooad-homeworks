import java.util.Scanner;

public class GraphUI {

    private Graph graph;

    public GraphUI() {
        getGraphInfo();
    }

    public void getGraphInfo() {
        Scanner sc = new Scanner(System.in);
        String temp = null;

        System.out.print("Number of nodes: ");
        temp = sc.nextLine();
        graph = new Graph(Integer.parseInt(temp));

        for (int i = 0; i < graph.getNumOfNodes(); i++) {
            System.out.print("Add node: ");
            temp = sc.nextLine();

            if(graph.addNode(temp) == false) {
                System.out.println("Failed to add, try again!");
                --i;
            }
        }

        System.out.print("Number of edges: ");
        String numOfEdges = sc.nextLine();

        for (int i = 0; i < Integer.parseInt(numOfEdges); i++) {
            System.out.println("Add edge:");
            System.out.print("-Enter start node: ");
            String start = sc.nextLine();
            System.out.print("-Enter end node: ");
            String end = sc.nextLine();
            System.out.print("-Enter weight between nodes: ");
            String weight = sc.nextLine();
            Edge edge = new Edge(start,end,Integer.parseInt(weight));
            graph.addEdge(edge);
        }
    }

    @Override
    public String toString() {
        return graph.toString();
    }
}
