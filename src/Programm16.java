//Java program to add two binary numbers.
import java.util.Scanner;

public class Programm16 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        // enter the binary value
        System.out.print("Binary first number is : ");
        String a = userInput.next();
        System.out.print("Binary second number is ");
        String b = userInput.next();
        // conver the binary value to decimal value1
        int b1 = Integer.parseInt(a,2);
        int b2 = Integer.parseInt(b,2);
        int ans = b1 + b2; // sum of two decimal numbers
        // sum of decimal value are again convert into bianry value
        System.out.println("Sum of to binary number is : " + Integer.toBinaryString(ans));

    }

}
