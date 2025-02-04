public class _03_ReturnValue{
    static int myMethod(int a,int b){
        return a+b;
    }
    public static void main(String[] args){
        int sum=myMethod(10,20); 
        System.out.println("Sum is: " + sum); // Sum is: 30
    }
}

/*
Previously, we have used void to indicate function myMethod() doesnot return any value.
If you want the method to return a value, you can use a primitive data type (such as int, char, etc.) instead of void, and use the return keyword inside the method:
*/