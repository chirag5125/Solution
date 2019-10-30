import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        char ar[]=s.toCharArray();
        String temp=s.substring(0,2);
        int time=Integer.parseInt(temp);
        if(ar[8]=='A' && time==12)
        {
            time=00;
        }
        else if(ar[8]=='P' && time!=12)
        {
            time=time+12;
        }
        else{}
        String time1=Integer.toString(time);
        String temp1=time1.concat(s.substring(2,8));

        return temp1;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
