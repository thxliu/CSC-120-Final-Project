import java.util.Scanner;

/** 
 * Represents a scanner 
 */
public class Input {

  public static Scanner scanner = new Scanner(System.in);

  /** Creates Scanner object. */
  // public Input() {
  //   Scanner scanner = new Scanner(System.in);
  // }

  /** Accessor for scanner. */
  public static Scanner getScanner() {
    return scanner;
  }

  /** Closes scanner. */
  public static void closeScanner() {
    scanner.close();
  }
}