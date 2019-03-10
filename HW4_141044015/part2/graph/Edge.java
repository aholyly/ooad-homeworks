public class Edge<T> {
    private T startNode;
    private T endNode;
    private int weight;

    public Edge(T startNode, T endNode, int weight) {
        this.startNode = startNode;
        this.endNode = endNode;
        this.weight = weight;
    }

    public T getStartNode() {
        return startNode;
    }

    public void setStartNode(T startNode) {
        this.startNode = startNode;
    }

    public T getEndNode() {
        return endNode;
    }

    public void setEndNode(T endNode) {
        this.endNode = endNode;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "startNode=" + startNode +
                ", endNode=" + endNode +
                ", weight=" + weight +
                '}';
    }
}
