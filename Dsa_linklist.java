
package dsa_linklist;
import java.util.Scanner;
public class Dsa_linklist {

    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    
    Node head=null;
    void creation(){
        Scanner input=new Scanner(System.in);
     int data,n;
     do{
         System.out.println("Enter data");
         data=input.nextInt();
         Node new_node=new Node(data);
         if(head==null){
             head=new_node;
         }
         else{
             System.out.println("Insert 1. to insert in begining 2. in the end 3. in between 4. delete in begining  5. delete in end");
             int x=input.nextInt();
             switch(x){
                 case 1:
                     new_node.next=head;
                     head=new_node;
                 break;
                 case 2:
                     Node temp=head;
                            while(temp.next!=null){
                                temp=temp.next;
                            }
                            temp.next=new_node;
                 break;
                     
                 case 3: 
                     System.out.println("insert the position ");
                     Node temp1=head;
                     int y=input.nextInt();
                     for(int i=0;i<(y-1);i++){
                         temp1=temp1.next;
                     }
                     new_node.next=temp1.next;
                     temp1.next=new_node;
                 break;
                 case 4:
                     Node temp3=head;
                     temp3=temp3.next;
                     head=temp3;
                break;
                 case 5:
                     Node temp4=head;
                     Node ptr=temp4.next;
                     while(ptr.next!=null){
                         temp4=ptr;
                         ptr=ptr.next;
                     }
                     temp4.next=null;
                 break;
                 case 6:
                     System.out.println("pos");
                     int pos1=input.nextInt();
                     Node temp5=head;
                     Node ptr1=temp5.next;
                     for(int i=0;i<(pos1-1);i++){
                         
                         temp=ptr1;
                         ptr1=ptr1.next;
                     }
                     
                     temp5.next=ptr1.next;
                     break;
             }
         }
         System.out.println("Enter again");
         n=input.nextInt();
     }while(n==1);
    }
    void display(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
       Dsa_linklist obj=new Dsa_linklist();
        obj.creation();
        obj.display();
    }
    
}
