import java.util.Scanner;
// WAP to find greater element from an Integer array and print 
// their index.
public class SumOfDigits {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter an integer: ");
    long n = input.nextLong();
    System.out.println("The sum of the digits is: " + sumDigits(n));

  }

  public static int sumDigits(long n) {
    int sum = 0;
    while (n != 0) {
      sum += n % 10;
      n /= 10;
    }
    return sum;
  }
}