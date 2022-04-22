import java.io.IOException;
import java.util.Scanner;

class Result {

    /*
     * Complete the 'caesarCipher' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     * 1. STRING s
     * 2. INTEGER k
     */

    public static String caesarCipher(String s, int k) {

        // Write your code here
        String result = "";
        k = k % 26;

        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);

            if (character >= 'a' && character <= 'z') {
                if (character + k > 'z') {
                    character = (char) ('a' + (character + k - 'z') - 1);
                } else {
                    character = (char) (character + k);
                }

            } else if (character >= 'A' && character <= 'Z') {
                if (character + k > 'Z') {
                    character = (char) ('A' + (character + k - 'Z') - 1);
                } else {
                    character = (char) (character + k);
                }
            }
            result = result + character;
        }

        return result;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        int k = Integer.parseInt(scanner.nextLine());

        String result = Result.caesarCipher(s, k);

        System.out.println(result);

        scanner.close();
    }
}
