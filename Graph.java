public class Graph {
  private int countNodes;
  private int countEdges;
  private int[][] adjMatrix;

  public Graph(int countNodes) {
    this.countNodes = countNodes;
    this.adjMatrix = new int[countNodes][countNodes];
  }

  public int getCountNodes() {
    return this.countNodes;
  }

  public int getCounEdges() {
    return this.countEdges;
  }

  public int[][] getAdjMatix() {
    return this.adjMatrix;
  }

  public String toString() {
    String str = "";
    for (int i = 0; i < this.adjMatrix.length; i++) {
      for (int j = 0; j < this.adjMatrix[i].length; j++) {
        str += this.adjMatrix[i][j] + "\t";
      }
      str += "\n";
    }
    return str;
  }

  public void addEdge(int source, int sink, int weight) {
    if (source < 0 || source > this.countNodes - 1
        || sink < 0 || sink > this.countNodes - 1
        || weight <= 0) {
      System.out.println("Invalid value fir source, sink or weight {" + source + " " + sink + " " + weight + "}");
      return;
    }

    this.adjMatrix[source][sink] = weight;
    this.countEdges++;
  }

  public int degree(int node) {
    if (node < 0 || node > this.countNodes - 1) {
      System.out.println("Invalide node");
    }
    int count = 0;
    for (int i = 0; i < this.adjMatrix.length; i++) {
      if (this.adjMatrix[node][i] > 0) {
        count++;
      }
    }
    return count;
  }

  public int highestDegree() {
    int adjMatrixRange = this.adjMatrix.length;
    int returnDegree;
    int highest = 0;
    for (int i = 0; i < adjMatrixRange; i++) {
      returnDegree = degree(i);
      if (returnDegree > highest) {
        highest = returnDegree;
      }
    }
    return highest;
  }

  public int lowestDegree() {
    int adjMatrixRange = this.adjMatrix.length;
    int returnDegree;
    int lowest = adjMatrixRange;
    for (int i = 0; i < adjMatrixRange; i++) {
      returnDegree = this.degree(i);
      if (returnDegree < lowest) {
        lowest = returnDegree;
      }
    }
    return lowest;
  }

  public Graph complement() {
    // return the complement of the current graph
    Graph complementGraph = new Graph(this.adjMatrix.length);
    for (int i = 0; i < this.adjMatrix.length; i++) {
      for (int j = 0; j < this.adjMatrix[i].length; j++) {
        if (this.adjMatrix[i][j] == 0 && i != j)
          complementGraph.addEdge(i, j, 1);
      }
    }
    return complementGraph;
  }

  public float density() {
    // d = |e| / |v| * |v| -1
    float d;
    d = ((float) this.getCounEdges()) / (((float) (this.getCountNodes() * this.getCountNodes())) - 1.0f);
    return d;
  }

  public boolean subGraph(Graph g2) {
    // return true if g2 is a subgraph of the current graph
    boolean isSubGraph = false;
    if (!(g2.getCountNodes() > this.getCountNodes())) {
      for (int i = 0; i < this.adjMatrix.length; i++) {
        for (int j = 0; j < this.adjMatrix[i].length; j++) {
          if (this.adjMatrix[i][j] == 1 && g2.adjMatrix[i][j] == 1)
            isSubGraph = true;
        }
      }
    } else {
      isSubGraph = false;
      System.out.println("g2 cannot be greater than g1");
    }
    return isSubGraph;
  }

}