/*
 * write a program to find the transpose of a 2Darray.
 * mohamed ahmed elsayed elfikey
 * id 1900306
 */
package lab2_task2_transpose_array;
import java.util.Scanner;


public class Lab2_task2_transpose_array {
    

   
    public static void main(String[] args) {
        int [][] array_2d ={{1,2,3},{4,5,6}};
        
         int[][] transposed_array = new int[array_2d[0].length][array_2d.length]; //define 2d array that cotain transposed array
        // to do transposation of array
         for(int i = 0; i < array_2d.length; i++) {
            for (int j = 0; j < array_2d[0].length; j++) {
                transposed_array[j][i] = array_2d[i][j];
            }
        }  
        print_array(transposed_array);
                  
    
    }
    public static void print_array(int [][] array) // function to print 2d array
    {
        for (int i=0;i<array.length;i++)
        {
            for (int j=0;j<array[0].length;j++)
            {
                System.out.print (array[i][j]+" ");
            }
            System.out.println ();
                        
                        
        }
    }
   
}
