

import java.util.Scanner;

class AreaCalculator {

    // Method to calculate area of square
    static double areaOfSquare(double side) {
        return side * side;
    }

    // Method to calculate area of rectangle
    static double areaOfRectangle(double length, double breadth) {
        return length * breadth;
    }

    // Method to calculate area of triangle
    static double areaOfTriangle(double base, double height) {
        return 0.5 * base * height;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Square\n2. Rectangle\n3. Triangle");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        double area = 0;

        switch (choice) {
            case 1:
                System.out.print("Enter side of square: ");
                double side = sc.nextDouble();
                area = areaOfSquare(side);
                break;

            case 2:
                System.out.print("Enter length and breadth of rectangle: ");
                double length = sc.nextDouble();
                double breadth = sc.nextDouble();
                area = areaOfRectangle(length, breadth);
                break;

            case 3:
                System.out.print("Enter base and height of triangle: ");
                double base = sc.nextDouble();
                double height = sc.nextDouble();
                area = areaOfTriangle(base, height);
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        System.out.println("Area = " + area);
        sc.close();
    }
}