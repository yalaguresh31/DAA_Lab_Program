//Experiment - 3
// Program to sort a given set of n integer elements using Merge Sort method.
import java.util.*; 
public class LP3_MergeSort  { 
  void mergesort(int a[], int low, int high){ 
    int mid; 
    if(low<high){ 
      mid=(low+high)/2; 
      mergesort(a,low,mid); 
      mergesort(a,mid+1,high); 
      merge(a,low,mid,high); 
    }//end of if 
  }//end of mergesort

 void merge(int a[],int low,int mid,int high){ 
    int c[]=new int[100000]; 
    int i,j,k; 
    i=low; 
    j=mid+1; 
    k=low; 
    while((i<=mid)&&(j<=high)){ 
      if(a[i]<a[j]){ 
        c[k]=a[i];
        i++; k++; 
      }//end of if
      else{ 
        c[k]=a[j]; 
        j++; k++; 
      }//end of else
    }//end of while

    while(i<=mid){ 
      c[k]=a[i]; 
      i++; k++; 
    }//end of while

    while(j<=high){ 
      c[k]=a[j]; 
      j++; k++; 
    }//end of while

    for(i=low;i<=high;i++)  
      a[i]=c[i]; 
  }//end of merge method
 
 public static void main(String args[]){ 
    int n,i; 
    LP3_MergeSort m=new LP3_MergeSort(); 
    Scanner s=new Scanner(System.in);
    Random r=new Random(); 
  
    System.out.println("Enter the no. of elements");
    n=s.nextInt(); 

    int a[]=new int[n]; 
    System.out.println("Array elements are\n"); 
    for(i=0;i<n;i++){
      a[i]= r.nextInt(50000);
    // a[i] = s.nextInt(); 
    System.out.println(a[i]); 
    }

    long start=System.nanoTime(); 
    m.mergesort(a,0,n-1); 
    long end=System.nanoTime();

    long execution=end-start; 

    System.out.println("\n Sorted elements are\n"); 
    for(i=0;i<n;i++) 
      System.out.print(a[i]+" "); 
    System.out.println("\n Execution time:"+execution+"ns"); 
  }//end of main
}//end of class

