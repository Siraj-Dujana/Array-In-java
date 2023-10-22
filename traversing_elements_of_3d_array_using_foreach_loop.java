
package arrays.in.java;

public class traversing_elements_of_3d_array_using_foreach_loop {
    public static void main(String[] args) {
        int array[][][]={
            {{1,2},{3,4}},
            {{5,6},{7,8}},
        };
        for(int col1[][]:array){
            for(int col2[]:col1){
                for(int item:col2){
                    System.out.print(item+" ");
                }
                System.out.println("");
            }
            System.out.println("");
        }
    }
}
