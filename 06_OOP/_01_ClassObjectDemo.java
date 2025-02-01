
// Creating class _01_ClassObjectDemo which is same as filename of this program
public class _01_ClassObjectDemo {

    int x = 10;

    public static void main(String[] args) {
        // Creating an object of the  class _01_ClassObjectDemo
        _01_ClassObjectDemo myObj = new _01_ClassObjectDemo();
        System.out.println(myObj.x);

        // We can also create multiple objects of same class as below:
        _01_ClassObjectDemo myObj1 = new _01_ClassObjectDemo();
        _01_ClassObjectDemo myObj2 = new _01_ClassObjectDemo();
        System.out.println(myObj1.x);
        System.out.println(myObj2.x);
    }
}
