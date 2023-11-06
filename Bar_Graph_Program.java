/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.in.java;
import java.util.Scanner;
/**
 *
 * @author Khushkuro
 */
public class Bar_Graph_Program {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int array[]=new int[5];
        for(int i=0;i<array.length;i++){
            System.out.println("Enter Today's Sale for store : "+(i+1));
            array[i]=input.nextInt();
        }
        for(int i=0;i<array.length;i++){
            System.out.print("Store:"+(i+1)+" ");
           for(int j=0;j<array[i]/100;j++){
               System.out.print("*");
           }
            System.out.println("");
        }
    }
}
