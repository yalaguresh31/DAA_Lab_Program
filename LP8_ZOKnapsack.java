import java.util.*;

public class LP8_ZOKnapsack {
    void knapsack(int w[], int p[], int n, int m) {
        int i, j, k, g;
        int v[][] = new int[25][25];

        for (i = 0; i <= n; i++)
            for (j = 0; j <= m; j++)
                v[i][j] = 0;
        for (i = 1; i <= n; i++)
            for (j = 1; j <= m; j++)
                if (w[i] > j) {
                    k = i - 1;
                    v[i][j] = v[k][j];
                } else {
                    k = i - 1;
                    g = j - w[i];
                    v[i][j] = Math.max(v[k][j], v[k][g] + p[i]);
                }
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= m; j++) {
                System.out.print(v[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\nMaximum Profit earned is " + v[n][m]);
        System.out.print("\nOptimal solution is {");
        i = n;
        j = m;
        while (i >= 1 && j >= 1) {
            if (v[i][j] != v[i - 1][j]) {
                System.out.print(" " + i);
                j = j - w[i];
            }
            i = i - 1;
        }

        System.out.println(" }");

    }

    public static void main(String args[]) {
        int i, j, m, n;
        LP8_ZOKnapsack k = new LP8_ZOKnapsack();
        Scanner s = new Scanner(System.in);
        int w[] = new int[10];
        int p[] = new int[10];
        System.out.println("Enter the number of items");
        n = s.nextInt();
        System.out.println("Enter the capacity of Knapsack");
        m = s.nextInt();
        System.out.println("Enter the weights of items");
        for (i = 1; i <= n; i++)
            w[i] = s.nextInt();
        System.out.println("Enter the value of profit of each item");
        for (i = 1; i <= n; i++)
            p[i] = s.nextInt();
        k.knapsack(w, p, n, m);
    }
}
