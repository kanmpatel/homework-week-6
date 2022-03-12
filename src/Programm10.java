//multiplication table of given input number
import java.util.Scanner;
public class Programm10 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input the number for multiplication table : ");
        int a = userInput.nextInt();
        for(int i = 1; i<=10;i++){
            System.out.println(a + " * " + i + " = " + (a * i));
        }

    }
}
