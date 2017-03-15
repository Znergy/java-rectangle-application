import java.io.Console;

public class App {

  public static void main(String[] args) {

    Console myConsole = System.console();
    System.out.println("Enter a length");
    int length = Integer.parseInt(myConsole.readLine());
    System.out.println("Enter a width");
    int width = Integer.parseInt(myConsole.readLine());

    Rectangle rectangle = new Rectangle(length, width);
    boolean isSquare = rectangle.isSquare();
    System.out.println("Is your rectangle a square? " + isSquare);
    
  }
}
