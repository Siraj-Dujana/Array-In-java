package arrays.in.java;

public class Integer_to_String {
    static String array[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    static void convert(int number){
        if(number!=0){
            int n=number%10;
            number=number/10;
            convert(number);
            System.out.println(array[n]);
        }
    }
    public static void main(String[] args) {
        Integer_to_String obj=new Integer_to_String();
        convert(321);
    }
}
