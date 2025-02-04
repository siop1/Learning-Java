/* An abstract method belongs to an abstract class, and it does not have a body. 
The body is provided by the subclass: */

// This program is part of _04_AbstractClassSecond.java program and it has no purpose of its own.
// abstract class
abstract class AbstractClassMain {
  public String fname = "John";
  public int age = 24;
  public abstract void study(); // abstract method
}

// Subclass (inherit from AbstractClassMain)
class Student extends AbstractClassMain {
  public int graduationYear = 2018;
  public void study() { // the body of the abstract method is provided here
    System.out.println("Studying all day long");
  }
}


