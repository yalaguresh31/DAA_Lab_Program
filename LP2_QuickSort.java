// Experiment - 2 
// Program to sort a given set of n integer elements using Quick Sort method. 
import java.util.*; 
public class LP2_QuickSort{ 
    int partition(int a[],int low,int high){
        int p,i,j,temp; 
        p=a[low]; 
        i=low; 
        j=high+1; 
        while(i<=j){ 
            do{ 
             i++; 
            }while(p>=a[i] && (i<=high));

            do{
             j--; 
            }while(p<a[j] && (j>=low)); 

            if(i<j){ 
            temp=a[i]; 
            a[i]=a[j]; 
            a[j]=temp; 
            }//end of if
        }//end of while loop
        temp=a[j]; 
        a[j]=a[low]; 
        a[low]=temp; 
      return j; 
    }//end of partition method

void quickSort(int a[],int low,int high){ 
        int k; 
        if(low<high){ 
        k=partition(a,low,high); 
        quickSort(a,low,k-1); 
        quickSort(a,k+1,high); 
        }//end of if
    } //end of quickSort method
public static void main(String args[]){ 
    int n,i; 
    LP2_QuickSort q=new LP2_QuickSort(); 
    Scanner s=new Scanner(System.in); 
    Random rand=new Random();

    System.out.println("Enter the Number of Elements");
    n=s.nextInt(); 

    int a[]=new int[n]; 

    System.out.println("\n Array Elements are \n"); 
    for(i=0;i<n;i++){
        a[i]=rand.nextInt(50000); 
        System.out.println(a[i]); 
    }//end of for loop
    

    long start = System.nanoTime(); 
    q.quickSort(a,0,n-1); 
    long end = System.nanoTime(); 


    long execution = end - start; 
    
    System.out.println("\n Sorted Elements are \n"); 
    for(i=0;i<n;i++) 
        System.out.println(a[i]+" "); 

    System.out.println("Execution time: " + execution + " nanoseconds"); 
    }//end of main
}//end of class

