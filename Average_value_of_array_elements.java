package arrays.in.java;

public class Average_value_of_array_elements {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        int count=0;
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
            count++;
        }
        System.out.println("Average value of array elements : "+(sum/count));
    }
}
