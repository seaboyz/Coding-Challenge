import java.util.List;

public class App {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int primary = 0;
        int secondary = 0;
        int maxLength = Math.max(arr.size(), arr.get(0).size());

        // i - col
        // j - row
        for (int j = 0; j < arr.size(); j++) {
            for (int i = 0; i < arr.get(j).size(); i++) {
                if (j == i) {
                    primary = primary + arr.get(j).get(i);
                }
                // not use else if, because there are items belong to both primary and secondary
                if (j + i == maxLength - 1) {
                    secondary = secondary + arr.get(j).get(i);
                }
            }

        }
        return Math.abs(primary - secondary);
    }

}
