
package arrays.in.java;

public class Product_of_all_elements_of_array {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int product=1;
        for(int i=0;i<array.length;i++){
            product*=array[i];
        }
        System.out.println("Product of all elements of array : "+product);
        
    }
}
