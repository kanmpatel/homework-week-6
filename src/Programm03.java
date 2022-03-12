/* one static variables
* one instance variables
* one static methods
* one instance methods */

public class Programm03 {
    String compName = "XYZ"; //instance variable
    static int eid = 5;     //static variable
    //instance method display1
    public void display1(){
        System.out.println("method display1");
        System.out.println(compName);
        System.out.println(eid);
    }
    //static method display1
    public static void display2(){
        System.out.println("method display2");
        Programm03 d1 = new Programm03(); //create new object
        System.out.println(d1.compName);  // calling instance variable method via object
        System.out.println(eid);
    }
    //main method
    public static void main(String[] args) {
        Programm03 obj = new Programm03(); //create new object
        obj.display1();                    // calling instance method via object
        display2();                        // call static method
    }
}
