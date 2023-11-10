
package arrays.in.java;
import java.lang.String;
public class Time_Hour_Conversion {
    public static String timeConversion(String time) {
        if(time.substring(time.length() - 2).equalsIgnoreCase("am")){
            time=time.replace("am","");
        }
        else{
            time=time.replace("pm","");
        }
         String hoursString = time.substring(0, 2);
         int convert=Integer.parseInt(hoursString)+12;
         String string=Integer.toString(convert);
         time=time.replace(hoursString,string);
         return time;
    }
    public static void main(String[] args) {
        String time="07:05:45am";
        System.out.println(timeConversion(time));
        
        
        
       
    }
}
