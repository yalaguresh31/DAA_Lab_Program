import java.util.*;

public class LP7_Dijkstra {
    void dijkstra(int a[][], int n, int source) {
        int i, j, u = 0, v, min;
        int s[] = new int[10];
        int d[] = new int[10];
        for (i = 1; i <= n; i++) {
            s[i] = 0;
            d[i] = a[source][i];
        }
        for (i = 1; i <= n; i++) {
            min = 999;
            for (j = 1; j <= n; j++) {
                if (s[j] == 0)
                    if (min > d[j]) {
                        min = d[j];
                        u = j;
                    }
            }
            s[u] = 1;
            for (v = 1; v <= n; v++) {
                if (s[v] == 0)
                    if (d[v] >= d[u] + a[u][v]) {
                        d[v] = d[u] + a[u][v];
                    }
            }
        }
        System.out.println("\n Shortest path from vertex " + source + " to other vertices as follows\n");
        for (i = 1; i <= n; i++)
            System.out.println(source + "-->" + i + "=" + d[i]);
    }

    public static void main(String args[]) {
        LP7_Dijkstra d = new LP7_Dijkstra();
        Scanner s = new Scanner(System.in);
        int n, i, j, source;
        int a[][] = new int[10][10];
        System.out.println("Enter the Number of Vertex");
        n = s.nextInt();
        System.out.println("Enter the values of Adjacency weight Matrix");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                a[i][j] = s.nextInt();
        System.out.println("Enter the Source vertex");
        source = s.nextInt();
        d.dijkstra(a, n, source);
    }
}
