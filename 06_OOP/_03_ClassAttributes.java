public class _03_ClassAttributes{
    // class attributes are variables within a class:
    // Here, x is attribute(field) of this class
    int x=10;
    public static void main(String[] args){
        //Accessing Attributes: You can access attributes by creating an object of the class, and by using the dot syntax (.):
        _03_ClassAttributes myObj= new _03_ClassAttributes();
        System.out.println(myObj.x); // 10

        myObj.x =25; // Modifying attribute
        System.out.println(myObj.x); // 20
    }
}