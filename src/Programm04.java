/* two static variables
 * two instance variables
 * one static methods
 * one instance methods */

public class Programm04 {
    //Two instance variables
    int a = 200;
    String name = "devid";

    //Two static variables
    static int b = 300;
    static String name1 = "john";

    //instance method
    public void display1(){
        System.out.println("instance method display1");
        System.out.println(a);
        System.out.println(name);
        System.out.println(b);
        System.out.println(name1);

    }

    //static method
    public static void display2(){
        System.out.println("static method display1");
        Programm04 dis1 = new Programm04();   //create new object
        System.out.println(dis1.a);           // calling instance variable method via object
        System.out.println(dis1.name);        // calling instance variable method via object
        System.out.println(b);
        System.out.println(name1);

    }

    public static void main(String[] args) {
        Programm04 obj = new Programm04();  //create new object
        obj.display1();                     // calling instance method via object
        display2();                         // call static method
    }

}
