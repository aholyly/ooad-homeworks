import java.util.*;

public class Graph<T> {

    private int numOfNodes;
    private Set<T> nodes;
    private Map<T,List<Edge>> adj;
    private boolean isFull = false;

    public Graph(int numOfNodes) {
        this.numOfNodes = numOfNodes;
        nodes = new HashSet<>();
    }

    public boolean addNode(T node) {
        boolean retVal = nodes.add(node);

        if(nodes.size() == numOfNodes && isFull == false){
            isFull = true;
            adj = new HashMap<>();

            Iterator it = nodes.iterator();

            while (it.hasNext()) {
                adj.put((T)it.next(),new ArrayList<>());
            }
        }
        return retVal;
    }

    public boolean addEdge(Edge edge) {
        T start = (T) edge.getStartNode();
        T end = (T) edge.getEndNode();

        if(nodes.contains(start) == true && nodes.contains(end) == true) {
            adj.get(start).add(edge);

            return true;
        }
        else
            return false;
    }

    public int getNumOfNodes() {
        return numOfNodes;
    }

    public Map<T, List<Edge>> getAdj() {
        return adj;
    }

    @Override
    public String toString() {
        String str = "";
        for ( T key : adj.keySet() ) {
            str += "Node: " + key + '\n';
            for (Edge edge: adj.get(key)) {
                str += "\t-" + edge.getStartNode() + " --> " + edge.getEndNode() + " : " + edge.getWeight() + '\n';
            }
        }

        return str;
    }
}
