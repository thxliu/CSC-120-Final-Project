import java.util.Scanner;

public class Input {

  public static final Scanner scanner = new Scanner(System.in);

  public static Scanner getScanner() {
    return scanner;
  }

  public static void closeScanner() {
    scanner.close();
  }

}