// Experiment - 4 
// Program to solve Knapsack problem using Greedy method 
// import java.util.*; 
// public class LP4_GreedyKnapsack{ 
//     void knapsack(int n,int m,float w[],float p[]){ 
//         int i=1; 
//         float x=0,mp=0; 
//         System.out.println("\nOptimal solution is"); 
//         while(m>0 && i<=n){  
//             if(w[i]<m){ 
//                 x=1; 
//                 System.out.println("Item "+i+" is included"); 
//             }//end of if 
//             else{ 
//                 x=(float)m/w[i]; 
//                 System.out.println("From Item "+i+" "+x*w[i]+" Kg is included"); 
//             }//end of else

//             System.out.println("Profit gained is "+x*p[i]); 
//             mp=mp+p[i]*x; 
//             m=(int)(m-w[i]*x); 
//             i++; 
//         }//end of while

//         System.out.println("\nMaximum profit is "+mp); 
//     }//end of knapsack method

//     void orderitems(int n,float w[],float p[]){ 
//         int i,j; 
//         float r[]=new float[10]; 
//         for(i=1;i<=n;i++) 
//             r[i]=(float)p[i]/w[i]; 
//         for(i=1;i<=n-1;i++) 
//             for(j=1;j<=n-i;j++) 
//                 if(r[j]<r[j+1]){ 
//                     swap(j,j+1,r); 
//                     swap(j,j+1,p); 
//                     swap(j,j+1,w); 
//                 } 
//         System.out.println("Based on the profit per Kg, items and their profit are sorted"); 
//         System.out.print("Profit per Kg: "); 
//         for(i=1;i<=n;i++) 
//             System.out.print(r[i]+" "); 
//         System.out.print("\nItem Weight: "); 
//             for(i=1;i<=n;i++) 
//                 System.out.print(w[i]+" "); 
//         System.out.print("\nItem Profit: "); 
//             for(i=1;i<=n;i++) 
//                 System.out.print(p[i]+" "); 
//     }//end of orderitems method

//     void swap(int i,int j,float a[]){ 
//         float t=a[i]; 
//         a[i]=a[j]; 
//         a[j]=t; 
//     }//end of swap method 
//     public static void main(String args[]){ 
//         LP4_GreedyKnapsack gkp=new LP4_GreedyKnapsack(); 
//         Scanner s=new Scanner(System.in);

//         float w[]=new float[10]; 
//         float p[]=new float[10]; 
//         int i,n,m; 
//         System.out.println("Enter the Number of Items");
//         n=s.nextInt(); 
//         System.out.println("Enter the Knapsack Capacity");
//         m=s.nextInt(); 
//         System.out.println("Enter the Weight of items");
//         for(i=1;i<=n;i++) 
//             w[i]=s.nextInt(); 
//         System.out.println("Enter the profit of items");
//         for(i=1;i<=n;i++) 
//             p[i]=s.nextInt();

//         gkp.orderitems(n,w,p); 
//         gkp.knapsack(n,m,w,p); 
//     }
// }

import java.util.*;

public class LP4_GreedyKnapsack {
    void knapsack(int n, int m, float w[], float p[]) {
        int i = 1;
        float mp = 0;
        float x[] = new float[10];

        while (0<m && i<=n) {
            if (w[i] < m)
                x[i] = 1;
            else
                x[i] = m / w[i];

            mp = mp + p[i] * x[i];
            m = (int) (m - w[i] * x[i]);
            i++;
        }
        System.out.println("\nOptimal solution is");
        System.out.print("{");
        for (i = 1; i <= n; i++)
            System.out.print(x[i] + " ");
        System.out.println("}");
        System.out.println("\nMaximum profit is " + mp);
    }

    void orderitems(int n, float w[], float p[]) {
        int i, j;
        float r[] = new float[10];
        for (i = 1; i <= n; i++)
            r[i] = (float) p[i] / w[i];

        for (i = 1; i <= n - 1; i++)
            for (j = 1; j <= n - i; j++)
                if (r[j] < r[j + 1]) {
                    swap(j, j + 1, r);
                    swap(j, j + 1, p);
                    swap(j, j + 1, w);
                }
        System.out.println("Object's weights and profits are  listed in non-increasing order of Pi/Wi");
        System.out.println("Profit\tWeight\tp[i]/w[i]");
        for (i = 1; i <= n; i++)
            System.out.print(p[i] + "\t" + w[i] + "\t" + r[i] + "\n");
    }

    void swap(int i, int j, float x[]) {
        float t = x[i];
        x[i] = x[j];
        x[j] = t;
    }

    public static void main(String args[]) {
        LP4_GreedyKnapsack gkp = new LP4_GreedyKnapsack();
        Scanner s = new Scanner(System.in);

        float w[] = new float[10];
        float p[] = new float[10];
        int i, n, m;

        System.out.println("Enter the Number of Items");
        n = s.nextInt();
        System.out.println("Enter the Knapsack Capacity");
        m = s.nextInt();
        System.out.println("Enter the Weight of items");
        for (i = 1; i <= n; i++)
            w[i] = s.nextInt();
        System.out.println("Enter the profit of items");
        for (i = 1; i <= n; i++)
            p[i] = s.nextInt();
            
        gkp.orderitems(n, w, p);
        gkp.knapsack(n, m, w, p);
    }
}
