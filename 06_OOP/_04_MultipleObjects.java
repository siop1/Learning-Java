// If you create multiple objects of one class, you can change the attribute values in one object, without affecting the attribute values in the other:

public class _04_MultipleObjects {
  int x = 5;

  public static void main(String[] args) {
    _04_MultipleObjects myObj1 = new _04_MultipleObjects();  // Object 1
    _04_MultipleObjects myObj2 = new _04_MultipleObjects();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
