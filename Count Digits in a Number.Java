import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();  // Input number
        int count = 0;

        while (number != 0) {
            count++;             // Increase count for each digit
            number = number / 10; // Remove last digit
        }

        System.out.println(count); // Print result
    }
}
