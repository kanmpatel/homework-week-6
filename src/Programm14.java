/*print the area and perimeter of a rectangle.
*Area is 5.6 * 8.5 = 47.60
* Perimeter is 2 * (5.6 + 8.5) = 28.20
* */

import java.util.Scanner;
public class Programm14 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("width of rectangle :");
        float a = userInput.nextFloat();
        System.out.print("height of rectangle :");
        float b = userInput.nextFloat();
        System.out.println("area of rectangle is " + a + " * " + b + " = " + (a*b));
        System.out.println("Perimeter is 2 * (" + a + " + " + b + ") = " + (2*(a+b)));

        }
}
