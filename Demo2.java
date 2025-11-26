import java.util.Scanner;

class Demo2 {

    // Method to check if a number is prime
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to calculate factorial
    static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to display Fibonacci series up to n
    static void fibonacci(int n) {
        System.out.print("Fibonacci series up to " + n + ": ");
        int a = 0, b = 1;
        while (a <= n) {
            System.out.print(a + " ");
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPrime(num))
            System.out.println(num + " is a Prime number");
        else
            System.out.println(num + " is NOT a Prime number");

        System.out.println("Factorial of " + num + " is: " + factorial(num));
        fibonacci(num);

        sc.close();
    }
}
