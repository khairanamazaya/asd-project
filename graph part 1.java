 import java.util.*;


 // Compiler version JDK 11.0.2

public class GraphPresent{
  String [][] adjacencyMatrix;
  String [][] cek;
  
  public GraphPresent(int n){
    adjacencyMatrix = new int [n][n];
  }
  
  // public void addEdge(int src, int dest){
  //   adjacencyMatrix[src][dest] ;
  //   adjacencyMatrix[dest][src] ;
  // }


  public static void main(String[]args){
    Bolean cekNama ;
    Scanner sc = new Scannner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    sc.nextLine;
    GraphPresent graph = new GraphPresent(m);
    GraphPresent graphCek = new GraphPresent(m);
     for(int i = 0; i < n; i++){
        String[] hubungan = sc.nextLine().split(" ");
        String src = hubungan[0];
        String dest = hubungan[2];
        for(int j = 0; j < m; j++){
            if(src == adjacencyMatrix[0][j]){
               cekNama = true;
            }
            else if(dest == adjacencyMatrix[0][j]){
              cekNama = true;
            }
            else{
              cekNama = false; 
            }
        }
     }
    
  }
  // graph.addEdge(0,2);
    // graph.addEdge(1,2);
    // graph.addEdge(3,1);
    // graph.addEdge(3,4);
    // graph.addEdge(4,0);
    
    // graph.printGraph();
  
  // public void deleteEdge(int src, int dest){
  //   adjacencyMatrix[src][dest] = 0;
  //   adjacencyMatrix[dest][src] = 0;
  // }
  // public void printGraph(){
  //   System.out.println("adjacency Matrix;");
  //   System.out.print(" ");
    
  //   for (int i = 0; i < v; i++){
  //     System.out.printf(" %c", 65 + i);
  //   }
    
  //   System.out.println(" ");
    
  //   for (int i = 0; i < v; i++){
  //     System.out.printf("%c ", 65 + i);
  //     for (int j = 0; j < v; j++){
  //       System.out.print(adjacencyMatrix[i][j] + " ");
  //     }
  //     System.out.println("");
  //   }
  // }
  
  
}