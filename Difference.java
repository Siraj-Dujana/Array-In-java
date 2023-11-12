
package arrays.in.java;

public class Difference {
    public static void main(String[] args) {
        int x[]={1, 2, 3, 4};
        int y[]={1, 4, 5, 9};
       
        int count=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(x[i]==y[j]){
                    count++;
                }
            }
        }
        int z[]=new int[count];
        count=0;
        for(int i=0;i<x.length;i++){
            for(int j=0;j<x.length;j++){
                if(x[i]==y[j]){
                    z[count]=x[i];
                    count++;
                }
            }
        }
        for(int item:z){
            System.out.print(item);
        }
        
    }
}
