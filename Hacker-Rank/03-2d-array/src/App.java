import java.util.List;

public class App {
    public static int hourglassSum(List<List<Integer>> arr) {
        int result = Integer.MIN_VALUE;

        // loop throgh the 2d array
        // alway col first
        // col-j, row-i
        for (int j = 1; j <= arr.size() - 2; j++) {
            for (int i = 1; i <= arr.get(j).size() - 2; i++) {
                // get sum of each hourglass
                int sum = arr.get(j - 1).get(i - 1) + arr.get(j - 1).get(i) + arr.get(j - 1).get(i + 1)
                        + arr.get(j).get(i)
                        + arr.get(j + 1).get(i - 1) + arr.get(j + 1).get(i) + arr.get(j + 1).get(i + 1);
                if (sum > result) {
                    result = sum;
                }
            }
        }

        return result;
    }
}
