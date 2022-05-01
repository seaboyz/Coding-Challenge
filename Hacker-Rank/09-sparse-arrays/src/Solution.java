import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

class Result {

    /*
     * Complete the 'matchingStrings' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     * 1. STRING_ARRAY strings
     * 2. STRING_ARRAY queries
     */

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        // double loop
        // s - index of the search array
        // q - index of the query array
        // record each of the frequency of each query string
        ArrayList<Integer> result = new ArrayList();
        for (int i = 0; i < queries.size(); i++) {
            result.add(0);
        }
        for (int s = 0; s < strings.size(); s++) {
            for (int q = 0; q < queries.size(); q++) {
                if (strings.get(s).equals(queries.get(q))) {
                    result.set(q, result.get(q) + 1);
                }
            }

        }
        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int stringsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> strings = new ArrayList<>();

        for (int i = 0; i < stringsCount; i++) {
            String stringsItem = bufferedReader.readLine();
            strings.add(stringsItem);
        }

        int queriesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> queries = new ArrayList<>();

        for (int i = 0; i < queriesCount; i++) {
            String queriesItem = bufferedReader.readLine();
            queries.add(queriesItem);
        }

        List<Integer> res = Result.matchingStrings(strings, queries);

        for (int i = 0; i < res.size(); i++) {
            bufferedWriter.write(String.valueOf(res.get(i)));

            if (i != res.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
