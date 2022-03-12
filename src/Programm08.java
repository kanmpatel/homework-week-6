/*calculate the area of a triangle.
* (base * height)/2
* */
import java.util.Scanner;
public class Programm08 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter Base for triangle :");
        float b = userInput.nextFloat();
        System.out.print("Enter height for triangle :");
        float h = userInput.nextFloat();
        System.out.println("Area of triangle is (" + b + " * "+ h + ")/2 = " + ((b*h/2)));
    }
}
