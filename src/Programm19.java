//Java program to convert a given string into lowercase.
import java.util.Scanner;

public class Programm19 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("sample Input : ");
        String sent = userInput.nextLine();
        String result;
        result = sent.toLowerCase();
        System.out.println("output of lowercase is : " + result);


        /*String name = "THE QUICK BROWN FOR JUMBS OVER THE LASY DOG";
        System.out.println(name.toLowerCase());*/

    }

}
