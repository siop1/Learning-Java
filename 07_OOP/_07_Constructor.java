/*
A constructor is a special method that is automatically called when an object of a class is created.
It can be used to set initial values for object attributes:
*/

public class _07_Constructor{
   int x;  // Create a class attribute

  // Create a constructor for the _07_Constructor class
  public _07_Constructor() {
    x = 5;  // Set the initial value for the class attribute x
  }

  public static void main(String[] args) {
    _07_Constructor myObj = new _07_Constructor(); // Create an object of class _07_Constructor (This will call the constructor)
    System.out.println(myObj.x); // Print the value of x
  }
}

// Note that the constructor name must match the class name, and it cannot have a return type (like void). 

//All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.