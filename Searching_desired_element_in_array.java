
package arrays.in.java;

public class Searching_desired_element_in_array {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5};
        int item=9;
        boolean flag=false;
        for(int i=0;i<array.length;i++){
            if(array[i]==item){
                flag=true;
            }
        }
        if(flag){
            System.out.println("found");
        }
        else
        {
            System.out.println("Not found");   
        }
    }
}
