import java.io.Console;

public class Mario {
  static boolean isValidNumber(String value) {
    // Loop over all characters in the String.
    // ... If isDigit is false, this method too returns false.
    for (int i = 0; i < value.length(); i++) {
        if (!Character.isDigit(value.charAt(i))) {
          return false;
        }
    }
    return true;
  }

  public static void main(String[] varArgs) {
    System.out.println("Hi, My name is Mario. Please build me a wall.");

    Console c = System.console();
    int n = 0;

    do {

      String s = c.readLine("Enter the number of lines: ");
      
      if (isValidNumber(s)) {
        n = Integer.parseInt(s);
      } else {
        System.out.println(s + " is not a positive number. Please try again.");
      }
      
    } while (n <= 0);
    
    String line = "";

    for (int i = n; i > 0; i--) {
      int j;
      for (j = 0; j < (i - 1); j++) {
        line += " ";
      }
      for (int k = 0; k < (n - j + 1) ; k++) {
        line += "#";
      }
      System.out.println(line);
      line = "";
    }

  }
}