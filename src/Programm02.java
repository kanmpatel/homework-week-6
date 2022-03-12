//create static variables and static methods
public class Programm02 {
    //Declare two static variables
    static String sen = "Java is Object Oriented Programming language";
    static String sen1 = "Java is Platform Independent";
    //static method feature1
    public static void feature1(){
        System.out.println("method feature1");
        System.out.println(sen);
        System.out.println(sen1);
    }
    //static method feature1
    public static void feature2(){
        System.out.println("method feature2");
        System.out.println(sen);
        System.out.println(sen1);
    }
    // main method
    public static void main(String[] args) {
        feature1(); //call static method
        feature2(); //call static method
    }

}
