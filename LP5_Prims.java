// Experiment – 5 
// Program to find Minimum Cost Spanning Tree of a given connected undirected graph  using Prim's algorithm.
import java.util.*; 
public class LP5_Prims{ 
    public static void main(String[] args){
        int a[][]=new int[10][10],n,i,j,source,sum; 
        LP5_Prims p=new LP5_Prims(); 
        Scanner nt=new Scanner(System.in); 
        System.out.println("\nEnter the number of nodes:");
        n=nt.nextInt(); 

        System.out.println("\nEnter the cost adjacency matrix:");
        for(i=0;i<n;i++) 
            for(j=0;j<n;j++) 
                a[i][j]=nt.nextInt(); 
        System.out.println ("\nEnter the source node:");
        source=nt.nextInt(); 
        sum=p.prims(a,n,source); 
        System.out.println("\nThe cost of the minimum spanning  tree="+sum); 
    }//end of main
        
    int prims(int a[][],int n ,int source){ 
        int s[]=new int[10],d[]=new int[10];
        int i,j,u=0,v=0,min,sum=0; 
        for(i=0;i<n;i++){ 
            s[i]=0; 
            d[i]=a[source][i]; 
        }
        s[source]=1; 
        for(i=0;i<n-1;i++){ 
            min=999; 
            for(j=0;j<n;j++)
                if(s[j] == 0)

            if(d[j]<min){
                min=d[j]; 
                u=j; 
            } 
            s[u]=1; 
            sum=sum+d[u]; 
            for(v=0;v<n;v++) 
                if(s[v]==0) 

            if(d[v]>a[u][v]) 
                d[v]=a[u][v]; 
        } 
      return sum; 
    }//end of prims method 
}//end of class
