// Experiment - 1 
// Program to sort a given set of n integer elements using Selection Sort method.  
import java.util.Scanner; 
import java.util.Random; 
public class LP1_SelectionSort{ 
    public static void main(String[] args){  
        Scanner s = new Scanner(System.in); 
        Random rand = new Random(); 

        System.out.println("Enter the size of the array"); 
        int size = s.nextInt(); 
        
        int numbers[] = new int[size]; 

        System.out.println("Array Elements are:");
        for(int i=0;i<size;i++){ 
            numbers[i] = rand.nextInt(50000); 
            System.out.println(numbers[i]); 
        } //end of for

        long start = System.nanoTime(); 

        for(int i = 0;i<size - 1; i++){ 
            int min = i; 
            for(int j = i + 1;j<size; j++){ 
                if(numbers[min] > numbers[j]) 
                    min = j; 
            }//end of j loop        
            if(min != i){ 
            int temp = numbers[i]; 
            numbers[i] = numbers[min]; 
            numbers[min] = temp; 
            } //end of if
        } //end of i loop

        long end = System.nanoTime(); 
        
        long execution = end - start; 

        System.out.println("After sorting, the numbers are:"); 
        for(int i=0;i<size;i++)
            System.out.println(numbers[i]);

        System.out.println("Execution time: " + execution + " nanoseconds");
 
    }//end of main
} //end of class


