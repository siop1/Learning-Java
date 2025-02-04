/*
You learned from the previous chapter that private variables can only be accessed within the same class (an outside class has no access to it). However, it is possible to access them if we provide public get and set methods.The get method returns the variable value, and the set method sets the value.

For the demonstration, follow these steps
Step1: Compile PersonMain.java
Step2: Compile and run this program
*/




public class _02_PersonSecond {
  public static void main(String[] args) {
    PersonMain myObj = new PersonMain();
     // Two commented statements below produces error because we are directly trying to access private attributes of another class. 
    // myObj.name = "John";
    // System.out.println(myObj.name);

    // This will work
    myObj.setName("Aryan"); // Set the value of the name variable to "Aryan"
    System.out.println(myObj.getName());
  }
}

                  



