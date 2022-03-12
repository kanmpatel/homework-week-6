//Java program to swap two variables.
import java.util.Scanner;
public class Programm15 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("value of a :");
        int a = userInput.nextInt();
        System.out.print("value of b :");
        int b = userInput.nextInt();
        System.out.println("after swapping the value");
        int c = a; // store value of a into c
        a = b;     // store value of b into a
        b = c;    // store value of c into b
        System.out.println("value of a : " + a);
        System.out.println("value of b : " + b);



    }
}
