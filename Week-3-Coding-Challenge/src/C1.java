import java.util.Arrays;
import java.util.Scanner;

public class C1 {

  public static int rearrangeTheDigits(int N) {

    // this is default OUTPUT. You can change it

    int result = -404;

    // WRITE YOUR LOGIC HERE:

    // greatest possible number

    // single integer represent the largest number

    // 1. convert int to int[];

    // 2. sort the int[];

    // 3. reverse the int[];

    // 4. convert the int[] to String;

    // 5. convert string to interger.

    String numStr = String.valueOf(N);

    char[] chArr = new char[numStr.length()];

    for (int i = 0; i < numStr.length(); i++) {
      chArr[i] = numStr.charAt(i);
    }
    Arrays.sort(chArr);

    String newNumStr = "";
    for (char c : chArr) {
      newNumStr = c + newNumStr;
    }

    result = Integer.parseInt(newNumStr);

    return result;

  }

  public static void main(String[] args) {

    // INPUT [uncomment & modify if required]

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    // OUTPUT [uncomment & modify if required]

    System.out.print(rearrangeTheDigits(N));

    sc.close();

  }

}