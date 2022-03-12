//Calulate three number and average of those three numbers
import java.util.Scanner;
public class Programm13 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter First number :");
        int a = userInput.nextInt();
        System.out.print("Enter secound number :");
        int b = userInput.nextInt();
        System.out.print("Enter Third number :");
        int c = userInput.nextInt();
        double sum = a + b+ c; // culate of three numbers
        System.out.println("sum of three number is : "+ sum);
        System.out.println("Average of this three number is : "+ (sum/3)); // average of three numbers


    }


}
