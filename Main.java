import java.util.Scanner;
/**
 * This program asks the user for a letter grade and will ouput what percentage range that would be
 * @author David Toma
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // import scanner for user inputs
    Scanner input = new Scanner(System.in);

    // ask user to enter a letter grade
    System.out.println("Please enter a letter grade:");
    String letterGrade = input.nextLine();

    switch ( letterGrade ) {
      case "A":
        System.out.println("This is between 80% and 100%");
        break;
      case "B":
        System.out.println("This is between 70% and 79%");
        break;
      case "C":
        System.out.println("This is between 60% and 69%");
        break;
      case "D":
        System.out.println("This is between 50% and 59%");
        break;
      case "F":
        System.out.println("This is between 0% and 49%");
        break;
      

    }    
  }
}
