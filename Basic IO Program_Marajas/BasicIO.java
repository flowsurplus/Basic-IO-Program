// Michael Jay Marajas Basic IO Program
// COP 2800C 
// 1/22/2020
// Purpose: To showcase user input and ability to perform mathematical functions using the input
import java.util.Scanner;

class BasicIO {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Enter in 3 numbers followed by an Enter:");

    // User input for 3 Numerical Values
    
    int firstNumber = myObj.nextInt();
    int secondNumber = myObj.nextInt();
    int thirdNumber = myObj.nextInt();

    int sum = firstNumber + secondNumber + thirdNumber;
    double avg = (firstNumber + secondNumber + thirdNumber) / 3;
    
    // Output input by user
    
    System.out.println("Sum: " + sum);
    System.out.println("Average: " + avg);
  }
}
