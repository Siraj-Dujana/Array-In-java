
package arrays.in.java;
import java.util.Scanner;
public class Dynamic_size_of_Array {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the size of array : ");
        int size_of_array=input.nextInt();
        int array[]=new int[size_of_array];
        //take input of the array
        for(int i=0;i<array.length;i++){
            array[i]=input.nextInt();
        }
        
        //traversing the elements of array
        for(int j=0;j<array.length;j++){
            System.out.println(array[j]);
        }
    }
}
