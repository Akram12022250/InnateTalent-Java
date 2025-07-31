import java.util.Scanner;

public class ProductOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // Input number

        int product = 1;

        while (number != 0) {
            int digit = number % 10;   // Get last digit
            product = product * digit; // Multiply with product
            number = number / 10;      // Remove last digit
        }

        System.out.println(product);   // Print result
    }
}
