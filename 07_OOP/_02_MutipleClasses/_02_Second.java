/* The concept of this program is to demonstrate that one class can accessed from another class.
For this demonstration, follow these steps
Step1: Compile Main.java
Step2: Compile and run this program
*/
class _02_Second {
  public static void main(String[] args) {
    //Accessing Main class of Main.java from this program
    Main myObj = new Main();
    System.out.println(myObj.x);
  }
}
