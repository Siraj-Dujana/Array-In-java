
package arrays.in.java;

public class Declare_array {
    public static void main(String[] args) {
        //Declaring an Array
        int array[]=new int[5];
        //Initialize the Array 
        array[0]=10;
        array[1]=20;
        array[2]=30;
        array[3]=40;
        array[4]=50;
        //traversing the Array
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
        
    }
}
