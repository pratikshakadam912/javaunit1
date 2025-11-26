import java.util.Scanner;

class VolumeCalculator {

    // Volume of cube
    static double volume(double side) {
        return side * side * side;
    }

    // Volume of cylinder
    static double volume(double radius, double height) {
        return Math.PI * radius * radius * height;
    }

    // Volume of sphere
    static double volumeSphere(double radius) {
        return (4.0 / 3.0) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("------ VOLUME CALCULATOR ------");
        System.out.println("1. Cube");
        System.out.println("2. Cylinder");
        System.out.println("3. Sphere");
        System.out.print("Choose shape: ");
        int ch = sc.nextInt();

        double result = 0;

        if (ch == 1) {
            System.out.print("Enter side: ");
            double s = sc.nextDouble();
            result = volume(s);

        } else if (ch == 2) {
            System.out.print("Enter radius and height: ");
            double r = sc.nextDouble();
            double h = sc.nextDouble();
            result = volume(r, h);

        } else if (ch == 3) {
            System.out.print("Enter radius: ");
            double r = sc.nextDouble();
            result = volumeSphere(r);

        } else {
            System.out.println("Invalid option!");
            sc.close();
            return;
        }

        System.out.println("Volume = " + result);
        sc.close();
    }
}
