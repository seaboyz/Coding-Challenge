package Array;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static int maxPoss(int N, int K, int P, int[] A) {

    Arrays.sort(A);

    int result = 0;

    while (N > 0) {
      // loop P times
      for (int i = 0; i < P; i++) {
        if (N - 1 < 0)
          break;
        result = result + A[N - 1];
        N--;
      }
      // loop K times
      for (int i = 0; i < K; i++) {
        if (N < 0)
          break;
        if (N < K)
          break;
        N--;
      }

    }

    return result;
  }

  public static void main(String[] args) {
    // INPUT [uncomment & modify if required]
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int K = sc.nextInt();
    int P = sc.nextInt();
    int[] A = new int[N];
    for (int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }
    sc.close();

    // OUTPUT [uncomment & modify if required]
    System.out.println(maxPoss(N, K, P, A));

  }
}