// Private attributes, methods and constructor are only accessible within declared class
public class _02_PrivateAttributesMain {
  private String fname = "John";
  private String lname = "Doe";
  private String email = "john@doe.com";
  private int age = 24;
  
  public static void main(String[] args) {
    _02_PrivateAttributesMain myObj = new _02_PrivateAttributesMain();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Email: " + myObj.email);
    System.out.println("Age: " + myObj.age);
  }
}

/* But if we try to access it from another class then it will produce error.
To demonstrate this error, let's create a file named _03_PrivateAttributesSecond.java
Step1: Compile _02_PrivateAttributeMain.java program
Step2: Compile and run _03_PrivateAttributesSecond.java
*/
