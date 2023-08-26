import java.util.*;

public class LP9_Floyd {
    void floyd(int a[][], int n) {
        int k, i, j;
        for (k = 1; k <= n; k++)
            for (i = 1; i <= n; i++)
                for (j = 1; j <= n; j++)
                    a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
        System.out.println("Shortest path is");
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        LP9_Floyd f = new LP9_Floyd();
        Scanner s = new Scanner(System.in);
        int i, j, n;
        int a[][] = new int[10][10];
        System.out.println("Enter the number of vertices");
        n = s.nextInt();
        System.out.println("Enter the adjacency weight matrix");
        for (i = 1; i <= n; i++)
            for (j = 1; j <= n; j++)
                a[i][j] = s.nextInt();
        f.floyd(a, n);
    }
}
