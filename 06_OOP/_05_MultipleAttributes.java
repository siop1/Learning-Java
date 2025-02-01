//You can specify as many attributes as you want:
public class _05_MultipleAttributes {
  String fname = "Aryan";
  String lname = "Khatri";
  int age = 24;

  public static void main(String[] args) {
    _05_MultipleAttributes myObj = new _05_MultipleAttributes();
    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
    System.out.println("Age: " + myObj.age);
  }
}
