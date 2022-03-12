/**Write a Java program to print the sum (addition),
 * multiply, subtract, divide and remainder of two numbers.
 */
import java.util.Scanner;

public class Programm18 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input First Number : ");
        int a = userInput.nextInt();
        System.out.print("Input Second Number : ");
        int b = userInput.nextInt();
        System.out.println(a +" + "+ b + "=" + (a+b));
        System.out.println(a +" - "+ b + "=" + (a-b));
        System.out.println(a +" * "+ b + "=" + (a*b));
        System.out.println(a +" / "+ b + "=" + (a/b));
        System.out.println(a +" mod "+ b + "=" + (a%b));


    }
}
