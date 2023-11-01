/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quadraVALL;
import java.util.Scanner;

public class QuadraVALL {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        double a = input.nextDouble();
        System.out.print("Enter the value of b: ");
        double b = input.nextDouble();
        System.out.print("Enter the value of c: ");
        double c = input.nextDouble();

        double discriminant = b * b - 4 * a * c;
        double root1, root2;

        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.format("The roots are real and distinct: %.2f and %.2f\n", root1, root2);
        } else if (discriminant == 0) {
            root1 = root2 = -b / (2 * a);
            System.out.format("The roots are real and equal: %.2f\n", root1);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("The roots are complex and distinct: %.2f + %.2fi and %.2f - %.2fi\n", realPart, imaginaryPart, realPart, imaginaryPart);
        }

        System.out.print("Enter the value of x: ");
        double x = input.nextDouble();
        double fx = a * x * x + b * x + c;
        System.out.format("The value of f(%.2f) is: %.2f\n", x, fx);

    }
}


