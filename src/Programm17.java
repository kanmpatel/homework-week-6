//convert a decimal number to binary number.
import java.util.Scanner;
public class Programm17 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input a Decimal Number : ");
        int a = userInput.nextInt();
        System.out.println("Binary number is : " + Integer.toBinaryString(a)); // use binary conversation method
        System.out.print("Input a binary Number : ");
        String b = userInput.next();
        System.out.println("Decimal number is : " + Integer.parseInt(b,2)); // use decimal conversation number
    }
}
