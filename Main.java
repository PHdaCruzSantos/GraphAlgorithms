class Main {
  public static void main(String[] args) {
    Graph g1 = new Graph(8);
    g1.addEdgeUnoriented(6, 3, 1);
    g1.addEdgeUnoriented(6, 7, 1);
    g1.addEdgeUnoriented(6, 1, 1);
    g1.addEdgeUnoriented(3, 4, 1);
    g1.addEdgeUnoriented(7, 0, 1);
    g1.addEdgeUnoriented(1, 2, 1);
    g1.addEdgeUnoriented(0, 5, 1);
    System.out.println(g1.dfs(2));
    // g1.addEdge(0, 1, 1);
    // g1.addEdge(1, 0, 1);
    // g1.addEdge(0, 3, 1);
    // g1.addEdge(3, 0, 1);
    // System.out.println(g1);
    // g1.degree(0); // 2
    // g1.degree(1); // 1
    // g1.degree(2); // 0
    // g1.degree(3); // 1
    // System.out.println(g1.highestDegree()); // 2
    // System.out.println(g1.lowestDegree()); // 0
    // System.out.println(g1.complement());
    // System.out.println(g1.oriented());
  }
}