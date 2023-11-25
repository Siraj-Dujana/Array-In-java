package arrays.in.java;
import java.util.Arrays;
import java.util.Scanner;
public class Reverse_array {
    int[] reverse(int array[]){
        int reversed[]=new int[array.length];
        int inc=0;
        for(int i=array.length-1;i>=0;i--){
            reversed[inc]=array[i];//
            inc++;
        }
        return reversed;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Reverse_array obj=new Reverse_array();
        int size=input.nextInt();//size of array
        int array[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.println("Enter a number :");
            array[i]=input.nextInt();
        }
        System.out.println(array.length);
        System.out.println(Arrays.toString(obj.reverse(array)));
    }
}
