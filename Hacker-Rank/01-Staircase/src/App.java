import java.util.Date;

public class App {
  public static void main(String[] args) {
    // System.out.printf("Hello %s%n", "World");

    // System.out.printf("%10s", "Hello");
    // System.out.printf("%-10s", "Hello");
    // boolean
    // System.out.printf("%b%n", false);
    // System.out.printf("%B%n", true);
    // System.out.printf("%s%n", "hello");
    // System.out.printf("%S%n", "hello");

    // System.out.printf("%2.2s", "Hi there!");

    Date date = new Date();
    System.out.printf("%1$tA, %1$tB %1$tY %n", date);
  }

}
