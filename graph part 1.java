import java.util.*;

public class GraphPresent{
 String [][] adjacencyMatrix;
  
  public GraphPresent(int n){
  adjacencyMatrix = new String [n][n];
  }

  public static void main(String[]args){
      Scanner sc = new Scanner(System.in);
        int m,n;
        do{
            m = sc.nextInt(); 
            if(m <= 1 || m > 300){
                System.out.println("harus lebih dari 1 atau kurang dari samadengan 300");
            }
        }while(m <= 1 || m > 300);
        do{
            n = sc.nextInt(); 
            if(n <= 1 || n > 200){
                System.out.println("harus lebih dari 1 atau kurang dari samadengan 200");
            }
        }while(n <= 1 || n > 200);  
          
        sc.nextLine();
   
    GraphPresent graph = new GraphPresent(m);

   String[] names = new String[m];
        int index = 0;

        for (int i = 0; i < n; i++) {
            String[] hubungan = sc.nextLine().split(" ");
            String src = hubungan[0];
            String dest = hubungan[2];

            if (!contains(names, src)) {
                names[index++] = src;
            }

            if (!contains(names, dest)) {
                names[index++] = dest;
            }

            int srcIndex = getIndex(names, src);
            int destIndex = getIndex(names, dest);

            graph.adjacencyMatrix[srcIndex][destIndex] = dest;
            graph.adjacencyMatrix[destIndex][srcIndex] = src; 
        }
        boolean[] visited = new boolean[m];
        int familyCount = 0;
   
          for (int i = 0; i < m; i++) {
            if (!visited[i] && names[i] != null) {
                dfsIterative(graph.adjacencyMatrix, visited, i, m);
                familyCount++;
            }
        }

        System.out.println(familyCount);
    }

 public static void dfsIterative(String[][] matrix, boolean[] visited, int start, int size) {
        Stack<Integer> stack = new Stack<>();
        stack.push(start);
        visited[start] = true;

        while (!stack.isEmpty()) {
            int v = stack.pop();
            for (int i = 0; i < size; i++) {
                if (matrix[v][i] != null && !visited[i]) {
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }

    public static boolean contains(String[] array, String value) {
        for (String s : array) {
            if (s != null && s.equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static int getIndex(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].equals(value)) {
                return i;
            }
        }
        return -1; 
    }
}
