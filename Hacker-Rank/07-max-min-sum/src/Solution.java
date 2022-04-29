import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

  /*
   * Complete the 'miniMaxSum' function below.
   *
   * The function accepts INTEGER_ARRAY arr as parameter.
   */

  public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
    /*
     * 5 positive integers int[5]
     * sum of 4 integers
     * min
     * max
     * print min max
     */
    // 1. sum all 5;
    long sum = 0;
    for (int i : arr) {
      sum = sum + i;
    }
    // 4. max = Interger.MAX min = Interger.MIN
    long max = 0;
    long min = sum;
    // 2. loop though each time minus the one
    for (int j : arr) {
      // 3. get the new sum.
      long temp = sum - j;
      // 5. compile result with min and max, update the min and max
      if (temp > max) {
        max = temp;
      }
      if (temp < min) {
        min = temp;
      }
    }
    // 6. print min max
    // System.out.printf(min + " " + max);
    System.out.printf("%d %d", min, max);
  }

}

public class Solution {
  public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    List<Integer> arr = new ArrayList<>();

    for (int i = 0; i < 5; i++) {
      int arrItem = Integer.parseInt(arrTemp[i]);
      arr.add(arrItem);
    }

    Result.miniMaxSum(arr);

    bufferedReader.close();
  }
}
