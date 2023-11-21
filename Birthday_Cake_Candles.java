package arrays.in.java;
public class Birthday_Cake_Candles {
    int birthdayCakeCandles(int candle[]) {
       int n=candle.length;
       int max=candle[0];
    for(int i=0;i<n;i++){
        if(candle[i]>max){
            max=candle[i];
        }
    }
    int count=0;
    for(int i=0;i<n;i++){
        if(candle[i]==max){
            count++;
        }
    }
    return count;
    
    }
    public static void main(String[] args) {
        int candles[]={4,4,1,3};
        Birthday_Cake_Candles obj=new Birthday_Cake_Candles();
        System.out.println(obj.birthdayCakeCandles(candles));
    }
}
