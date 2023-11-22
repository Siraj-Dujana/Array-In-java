package arrays.in.java;
import java.util.Arrays;
import java.util.Scanner;
public class Breaking_the_records {
    int[] Breakingreocords(int score[]){
        int count_high=0,count_low=0,min=score[0],max=score[0];
        
        for(int i=0;i<score.length;i++){
            if(score[i]>max){
                count_high++;
                max=score[i];
            }
            if(score[i]<min){
                min=score[i];
                count_low++;
            }
        }
            int breakrecord[]={count_high,count_low};
            return breakrecord;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Breaking_the_records obj=new Breaking_the_records();
        int num_games;
        System.out.println("Enter Number of Games");
        num_games=input.nextInt();
        int Scores[]=new int[num_games];
        for(int i=0;i<num_games;i++){
            System.out.println("Enter Score of game no : "+i+1);
            Scores[i]=input.nextInt();
        }
        System.out.println(Arrays.toString(obj.Breakingreocords(Scores)));
    }
}
