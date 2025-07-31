import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // Input number
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;   // Extract last digit
            sum = sum + digit;         // Add digit to sum
            number = number / 10;      // Remove last digit
        }

        System.out.println(sum);       // Print result
    }
}
