class Main {
  public static void main(String[] args) {

    Graph g1 = new Graph(4);
    g1.addEdge(0, 1, 1);
    g1.addEdge(1, 0, 1);
    g1.addEdge(0, 3, 1);
    g1.addEdge(3, 0, 1);
    // g1.addEdge(3, 4, 1);// warning

    System.out.println("\n---G1 graph---");
    System.out.println("node 0, degree =  " + g1.degree(0));
    System.out.println("node 1, degree = " + g1.degree(1));
    System.out.println("node 2, degree = " + g1.degree(2));
    System.out.println("node 3, degree = " + g1.degree(3));

    System.out.println("\n---G1 graph---");
    System.out.println(g1);

    System.out.println("\n---G1 graph---");
    System.out.println("this is highes degree: " + g1.highestDegree());
    System.out.println("this is lowest degree: " + g1.lowestDegree());
    System.out.println("this is complemnt graph:\n" + g1.complement());
    System.out.println("this is density of the graph: " + g1.density());

    Graph g2 = new Graph(4);
    g2.addEdge(0, 1, 1);
    // g2.addEdge(1, 2, 1);
    // g2.addEdge(2, 3, 1);
    // g2.addEdge(3, 0, 1);

    System.out.println("\n---G2 graph---");
    System.out.println(g2);

    System.out.println("\nG2 is sub graph of G1? " + g1.subGraph(g2) + "\n");

  }
}