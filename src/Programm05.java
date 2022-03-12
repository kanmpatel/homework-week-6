//addition, subtraction, multiplication and division via methods
import java.util.Scanner;

public class Programm05 {
    //instance method addition
    public void addition(int a, int b){
        System.out.println("addition of two number is : " + (a+b));
    }
    //instance method subtraction
    public void subtraction(int a, int b){
        System.out.println("subtraction of two number is : " + (a-b));
    }
    //static method multiplication
    public static void multiplication(int a, int b){
        System.out.println("multiplication of two number is : " + (a*b));
    }
    //static method division
    public static void division(int a, int b){
        System.out.println("division of two number is : " + (a/b));
    }


   //main method
    public static void main(String[] args) {
        //input the value in console
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter the value of a :");
        int x = userInput.nextInt();
        System.out.print("Enter the value of b :");
        int y = userInput.nextInt();
        //create new object
        Programm05 obj = new Programm05();
        //calling instance method via object
        obj.addition(x,y);
        obj.subtraction(x,y);
        // call static methods
        multiplication(x,y);
        division(x,y);




    }


}
