import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

 

  public static String timeConversion(String s) {
    // Write your code here
    // 12-hour -> 24-hour
    // 12:01:00PM -> 12:01:00
    // 12:01:00AM -> 00:01:00
    // s 12-hour String
    // 12:01:00PM
    // 0123456789
    // use s.substring(begin,end) to get hh, mm, ss, amPm;
    String hh = s.substring(0, 2);
    String mm = s.substring(3, 5);
    String ss = s.substring(6, 8);
    String amPm = s.substring(8);
    // if pm.equals("PM") hh = arr[0] + 12
    if (amPm.equals("PM")) {
      int n = Integer.parseInt(hh);
      // n = 1; 01 -> 13;
      if (n != 12) {
        n = n + 12;
      }
      // if hh == 24; 24 -> 00; 25 -> 01
      n = n >= 24 ? n - 24 : n;
      hh = String.format("%-2d", n);
    }
    if (amPm.equals("AM")) {
      int n = Integer.parseInt(hh);
      if (n == 12) {
        hh = "00";
      }
    }
    return hh + ":" + mm + ":" + ss;

  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    String s = bufferedReader.readLine();

    String result = Result.timeConversion(s);

    bufferedWriter.write(result);
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
  }
}
