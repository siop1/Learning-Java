/*
We already are familiar with methods in previous 05_Methods codes
Now, we will be learn the difference between static and public methods:
Static Method: It can be called without creating objects. It belongs to class itself rather than object.
Public Method: It must be called by creating objects
*/
public class _06_StaticVsPublicMethod{
// Static method
  static void myStaticMethod() {
    System.out.println("Static methods can be called without creating objects");
  }

  // Public method
  public void myPublicMethod() {
    System.out.println("Public methods must be called by creating objects");
  }

  // Main method
  public static void main(String[] args) {
    myStaticMethod(); // Call the static method
    // myPublicMethod(); This would compile an error

    _06_StaticVsPublicMethod myObj = new _06_StaticVsPublicMethod(); // Create an object of Main
    myObj.myPublicMethod(); // Call the public method on the object
  }
}

// Note: static and public keywords can also be used with attributes(variable of class) in the same way as in methods and it will behave similar i.e. static attributes can be accessed directly without making object but public attributes requires object to be created for accessing them.