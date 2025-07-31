import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int binary = 0;
        int place = 1;  // for storing binary digits in correct position

        while (num > 0) {
            int remainder = num % 2;       // get last binary digit
            binary = binary + remainder * place; // add to result
            place = place * 10;            // move to next place (10, 100, 1000...)
            num = num / 2;                 // divide number by 2
        }

        System.out.println("Binary number: " + binary);
        sc.close();
    }
}
