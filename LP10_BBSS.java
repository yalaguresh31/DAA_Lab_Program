import java.util.*;

public class LP10_BBSS {
    public static int[] w = new int[10];
    public static int[] x = new int[10];
    public static int d, total = 0;

    void subset(int s, int k, int r) {
        int i = 0;
        x[k] = 1;
        if (s + w[k] == d) {
            System.out.print("Sum of subset is (");
            for (i = 1; i <= k; i++) {
                if (x[i] == 1)
                    System.out.print(" " + w[i]);
            }
            System.out.println(" )");
        } else if ((s + w[k] + w[k + 1]) <= d) {
            subset(s + w[k], k + 1, r - w[k]);
        }
        if ((s + r - w[k]) >= d && (s + w[k + 1]) <= d) {
            x[k] = 0;
            subset(s, k + 1, r - w[k]);
        }
    }

    public static void main(String[] args) {
        LP10_BBSS s1 = new LP10_BBSS();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        int n = s.nextInt();
        System.out.println("Enter " + n + " Elements :");
        for (int i = 1; i <= n; i++) {
            w[i] = s.nextInt();
            total += w[i];
        }
        System.out.println("Enter the sum to be obtained: ");
        d = s.nextInt();
        if (total < d) {
            System.out.println("No possible subsets!!!");
            System.exit(1);
        }
        s1.subset(0, 1, total);
    }
}
