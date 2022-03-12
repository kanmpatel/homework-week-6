//create instance variables and instance methods
public class Programm01 {
    //two instance variables
    String myName = "Devid John";
    int age = 25;
    // instance method display1
    public void display1(){
        System.out.println("Instance method is display1");
        System.out.println(myName);
        System.out.println(age);
    }
    // instance method display2
    public void display2(){
        System.out.println("Instance method is display2");
        System.out.println(myName);
        System.out.println(age);

    }
    // main method
    public static void main(String[] args) {
           Programm01 obj = new Programm01(); //create new Object
           obj.display1();  //calling instance method via object
           obj.display2();  //calling instance method via object
    }
}
