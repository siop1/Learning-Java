public class _01_MethodDemo{
static void myMethod() {
    System.out.println("Hello Friends");
  }

  public static void main(String[] args) {
    myMethod();
    // method can be called multiple times
    myMethod();
    myMethod();
    myMethod();
  }
  }

/*
Example Explained

  myMethod() is the name of the method
  static means that the method belongs to the Main class and not an object of the Main class. You will learn more about objects and how to access methods through objects later in this tutorial.
  void means that this method does not have a return value. You will learn more about return values later in this chapter
*/