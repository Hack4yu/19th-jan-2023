// Q1 - Write a Java program to convert a decimal number to binary 
// number
import java.util.Scanner;

class DecimalToBinary {
  public static void main(String arg[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a decimal number");
    int n = sc.nextInt();
    System.out.print("Binary number is : ");
    binary(n);

  }

  static void binary(int dec_num) {
    int i = 0;
    int bin[] = new int[100];
    bin[0] = 0;
    while (dec_num > 0) {
      bin[i++] = dec_num % 2;
      dec_num = dec_num / 2;
    }
    for (int j = i - 1; j >= 0; j--) {
      System.out.print(bin[j]);
    }
  }
}