/*Find the area of circle
* Area = PI * Redius * Redius
* */
import java.util.Scanner;
public class Programm06 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the value of Radius :");
        double r = userInput.nextDouble();
        // double c = 3.14 * r * r;
        double c = Math.PI * r * r;
        System.out.println("area of circle is : " + c);

    }
}
