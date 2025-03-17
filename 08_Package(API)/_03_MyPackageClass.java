/*
User-defined Packages:
To create your own package, you need to understand that Java uses a file system directory to store them. Just like folders on your computer:
Example:
└── root
  └── mypack
    └── MyPackageClass.java
To create a package, use the package keyword:
Let's understand through example:
*/
package mypack;
class _03_MyPackageClass {
  public static void main(String[] args) {
    System.out.println("This is my package!");
  }
}

/*
Now, save and compile this file using the command:
javac _03_MyPackageClass.java

Then compile the package:
javac -d . _03_MyPackageClass.java
This forces the compiler to create the "mypack" package.
The -d keyword specifies the destination for where to save the class file. You can use any directory name, like c:/user (windows), or, if you want to keep the package within the same directory, you can use the dot sign ".", like in the example above.
Note: The package name should be written in lower case to avoid conflict with class names.

When we compiled the package in the example above, a new folder was created, called "mypack".
To run the MyPackageClass.java file, write the following:
java mypack._03_MyPackageClass

The output will be:
This is my package!

*/