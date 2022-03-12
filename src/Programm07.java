/*temperature value in degree Fahrenheit
*convert to degree Celsius ((F − 32) × 5/9 = 0°C).
* */

import java.util.Scanner;
public class Programm07   {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Enter temperature value in Fahrenheit :");
        float f = userInput.nextFloat();
        float c = (f - 32) * 5 / 9;
        //System.out.println((f - 32.0) * 5.0/9.0);
       System.out.println(f +"F Converted to Celsius "+ c + "C");

    }

}
