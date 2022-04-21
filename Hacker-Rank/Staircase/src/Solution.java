import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        // Write your code here
        // for loop frint n #
        // use printf ("'6s' %n",)
        String format = "%" + n + "s %n";
        for (int i = 0; i < n; i++) {
            String s = "";
            char c = '#';
            for (int j = 0; j <= i; j++) {
                s = s + c;
            }
            System.out.printf(format, s);
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
