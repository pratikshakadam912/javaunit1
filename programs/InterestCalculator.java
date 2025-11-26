import java.util.Scanner;

class InterestCalculator {

    // Simple Interest: P * R * T / 100
    static double simpleInterest(double p, double r, double t) {
        return (p * r * t) / 100;
    }

    // Compound Interest: P(1 + r/100)^t - P
    static double compoundInterest(double p, double r, double t) {
        return p * Math.pow((1 + r / 100), t) - p;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ INTEREST CALCULATOR ------");
        System.out.println("1. Simple Interest");
        System.out.println("2. Compound Interest");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();

        System.out.print("Enter Principal Amount: ");
        double p = sc.nextDouble();

        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();

        System.out.print("Enter Time (years): ");
        double t = sc.nextDouble();

        double result = 0;

        switch (ch) {
            case 1:
                result = simpleInterest(p, r, t);
                break;

            case 2:
                result = compoundInterest(p, r, t);
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Final Interest = " + result);
        sc.close();
    }
}
