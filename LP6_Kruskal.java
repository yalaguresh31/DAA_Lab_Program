// Program to find Minimum Cost Spanning Tree of a given connected undirected graph using  Kruskal's algorithm.

import java.util.Scanner;
public class LP6_Kruskal{ 
    void kruskal(int c[][],int n){ 
        int i,j,ne=0,mcost=0,u=0,v=0,a=0,b=0,min; 
        int p[]=new int[10]; 
        for(i=1;i<=n;i++) 
            p[i]=0; 
        while(ne!=n-1){ 
            min=999; 
            for(i=1;i<=n;i++) 
                for(j=1;j<=n;j++){ 
                    if(c[i][j]<min){ 
                        min=c[i][j];
                        a=u=i;
                        b=v=j;
                    } 
                } 

            while(p[u]!=0)
                u=p[u];
            while(p[v]!=0)
                v=p[v]; 
            if(u!=v){ 
                System.out.println(a+"--->"+b+"="+min);  p[v]=u; 
                ne=ne+1; 
                mcost=mcost+min; 
            } 
            c[a][b]=c[b][a]=999; 
        } 
        System.out.println("Minimum cost is "+mcost); 
    }//end of kruskal method 
    public static void main(String args[]){ 
        LP6_Kruskal k=new LP6_Kruskal(); 
        Scanner s=new Scanner(System.in); 
        int n,i,j; 
        int c[][]=new int[10][10]; 
        System.out.println("Enter the Number of Vertices"); 
        n=s.nextInt(); 
        System.out.println("Enter the values of Adjacency Matrix");
        for(i=1;i<=n;i++) 
            for(j=1;j<=n;j++) 
                c[i][j]=s.nextInt(); 
        k.kruskal(c,n); 
    } 
}

