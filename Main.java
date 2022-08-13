class Main {
  public static void main(String[] args) {

    Graph g1 = new Graph(4);
    g1.addEdge(0, 1, 1);
    g1.addEdge(1, 0, 1);
    g1.addEdge(0, 3, 1);
    g1.addEdge(3, 0, 1);
    g1.addEdge(3, 4, 1);// warning

    System.out.println("node 0, degree =  " + g1.degree(0));
    System.out.println("node 1, degree = " + g1.degree(1));
    System.out.println("node 2, degree = " + g1.degree(2));
    System.out.println("node 3, degree = " + g1.degree(3));

    System.out.println(g1);

    System.out.println("this is highes degree: " + g1.highestDegree());
    System.out.println("this is lowest degree: " + g1.lowestDegree());

    
    System.out.println("\nthis is complemnt graph:\n" + g1.complement());
  }
}