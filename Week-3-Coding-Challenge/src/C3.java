import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class C3 {

  public static void deleteDuplicate(int N, int A[]) {

    // this is default OUTPUT. You can change it

    int result = -404;

    // WRITE YOUR LOGIC HERE:

    // array A[]

    // size N

    // delete duplacate numbers

    // print size of the array

    // sorted to assending order

    // 1. remove duplacate of a array

    // if (N ==0 || N == 1) {

    // result = N;

    // }

    HashSet<Integer> set = new HashSet<>();

    for (int i = 0; i < N; i++) {
      set.add(A[i]);
    }

    System.out.println(set);

    int size = set.size();

    A = new int[size];

    int j = 0;
    for (int n : set) {
      A[j] = n;
      j++;
    }

    // 2. sorted

    Arrays.sort(A);

    result = size;

    // For optimizing code, You are free to make changes to "return type",
    // "variables" and "Libraries".

    System.out.println(result);

    for (int i = 0; i < size; i++) {
      System.out.print(A[i] + " ");
    }

  }

  public static void main(String[] args) {

    // INPUT [uncomment & modify if required]

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();

    int A[] = new int[N];

    for (int i = 0; i < N; i++) {

      A[i] = sc.nextInt();

    }

    // OUTPUT [uncomment & modify if required]

    deleteDuplicate(N, A);

    sc.close();

  }

}