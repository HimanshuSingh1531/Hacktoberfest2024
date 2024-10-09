import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        if (isPrime(num)) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // 1 is not a prime number
        if (num <= 1) {
            return false;
        }
        
        // Check from 2 to sqrt(num)
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false; // Not a prime number if divisible by i
            }
        }
        return true; // Prime number if no divisors found
    }
}
