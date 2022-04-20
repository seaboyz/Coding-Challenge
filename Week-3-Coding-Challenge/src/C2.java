import java.util.Scanner;

public class C2 {

  public static int favorite(int L, int R, int N, int A[]) {

    int result = 0;

    // Write Your Logic Here:

    // numbers

    // range L and R;

    // find The number of favoriate elements;

    // L = 20, R = 72;

    // N = 4 size of array;

    // A int[] the elements of the array

    for (int i = 0; i < A.length; i++) {
      int n = A[i];
      if (n >= L && n <= R) {
        result++;
      }
    }

    return result;

  }

  public static void main(String[] args) {

    // INPUT [uncomment & modify if required]

    Scanner sc = new Scanner(System.in);

    int L = sc.nextInt();

    int R = sc.nextInt();

    int N = sc.nextInt();

    int A[] = new int[N];

    for (int i = 0; i < N; i++) {

      A[i] = sc.nextInt();

    }

    // OUTPUT [uncomment & modify if required]

    System.out.print(favorite(L, R, N, A));

    sc.close();

  }

}
