/*
To demonstrate concept of abstract method, this program is designed:
Follow the steps below:
Step1: Compile the AbstractClassMain.java program
Step2: Compile and run this program.
 */
class AbstractClassSecond {
  public static void main(String[] args) {
    // create an object of the Student class (which inherits attributes and methods from Main)
    Student myObj = new Student();

    System.out.println("Name: " + myObj.fname);
    System.out.println("Age: " + myObj.age);
    System.out.println("Graduation Year: " + myObj.graduationYear);
    myObj.study(); // call abstract method
  }
}