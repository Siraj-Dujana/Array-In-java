
package arrays.in.java;

public class traversing_elements_of_2d_array_using_foreach_loop {
    public static void main(String[] args) {
        int array[][]={{1,2,3},{4,5,6},{7,8,9}};
        for(int col[]:array){
            for(int item:col){
                System.out.print(item+" ");
            }
            System.out.println("");
        }
    }
}
