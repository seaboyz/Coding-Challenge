public class Main {
  public static void main(String[] args) {
    int a = 1;
    int b = 6;
    double result = (double) a / 6;
    // %[flags][width][.precision]conversion-character
    // %n - line seperator
    // %10.6f
    // 10 - total width
    // 6 - decimal
    System.out.printf("%10.6f%n", result);
  }
}
