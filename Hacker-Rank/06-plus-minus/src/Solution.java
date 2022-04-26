import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        // Write your code here
        // 1. total number of values
        int total = arr.size();
        // 2. number of plus
        int totalPlus = 0;
        // 3. number of minus
        int totalMinus = 0;
        // 4. number of zeros
        int totalZeros = 0;
        for (int i = 0; i < total; i++) {
            if (arr.get(i) > 0) {
                totalPlus++;
            } else if (arr.get(i) < 0) {
                totalMinus++;
            } else {
                totalZeros++;
            }
        }
        // 5. plusRatio
        double plusRatio = (double) totalPlus / total;
        // 6. minusRatio
        double minusRatio = (double) totalMinus / total;
        // 7. zeorRation
        double zeroRatio = (double) totalZeros / total;
        // 8. printf - 6 decimals
        System.out.printf("%7.6f%n", plusRatio);
        System.out.printf("%7.6f%n", minusRatio);
        System.out.printf("%7.6f%n", zeroRatio);

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
