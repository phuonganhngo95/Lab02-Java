// Bài 4
import java.util.Scanner;

public class PhuongTrinhB2 {
    // Function to solve linear equation (degree 1)
    public static void solveLinearEquation(float a, float b) {
        if (a == 0) {
            if (b == 0) {
                System.out.println("The equation has infinitely many solutions.");
            } else {
                System.out.println("The equation has no solution.");
            }
        } else {
            float x = -b / a;
            System.out.printf("The solution is: x = %.1f\n", x);
        }
    }

    // Function to solve quadratic equation (degree 2)
    public static void solveQuadraticEquation(float a, float b, float c) {
        if (a == 0) {
            solveLinearEquation(b, c); // Reuse existing function for linear case
        } else {
            float delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("The equation has no real solutions.");
            } else if (delta == 0) {
                float x = -b / (2 * a);
                System.out.printf("The equation has a double root: x = %.1f\n", x);
            } else {
                double x1 = (-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (-b + Math.sqrt(delta)) / (2 * a);
                System.out.println("The equation has two distinct solutions:");
                System.out.printf("x1 = %.1f\n", x1);
                System.out.printf("x2 = %.1f\n", x2);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        float a = sc.nextFloat();
        System.out.print("Enter b: ");
        float b = sc.nextFloat();
        System.out.print("Enter c: ");
        float c = sc.nextFloat();

        solveQuadraticEquation(a, b, c);
        sc.close();
    }
}
