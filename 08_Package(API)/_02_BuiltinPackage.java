/*
Built-in Packages
The Java API is a library of prewritten classes, that are free to use, included in the Java Development Environment.
The library contains components for managing input, database programming, and much much more. The complete list can be found at Oracles website: https://docs.oracle.com/javase/8/docs/api/.
The library is divided into packages and classes. Meaning you can either import a single class (along with its methods and attributes), or a whole package that contain all the classes that belong to the specified package.

To use a class or a package from the library, you need to use the import keyword:
import package.name.Class;   // Import a single class
import package.name.*;   // Import the whole package

Let's understand through example:
Scanner class is used to take input from user. It contains different methods to input int, float, etc.
*/
import java.util.Scanner; //java.util is a package, while Scanner is a class of the java.util package.
import java.util.Scanner;

class _02_BuiltinPackage {
  public static void main(String[] args) {
    Scanner myObj = new Scanner(System.in);
    System.out.println("Enter username");

    String userName = myObj.nextLine();
    System.out.println("Username is: " + userName);
  }
}

/*
There are many packages to choose from. In the above example, we used the Scanner class from the java.util package. This package also contains date and time facilities, random-number generator and other utility classes.

To import a whole package, end the sentence with an asterisk sign (*). The following example will import ALL the classes in the java.util package:
import java.util.*;
*/