/*
import java.lang.*;
import java.util.Scanner;

public class _02_TryCatchDemo{
    public static void main(String[] args){
        int[] num={10,50,14,70};
        System.out.println(num[10]); // This will generate error because num[10] doesnot exist
    }
}

The output will be something like this:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 10
        at Main.main(Main.java:4)
Note: ArrayIndexOutOfBoundsException occurs when you try to access an index number that does not exist.
 */

//If an error occurs, we can use try...catch to catch the error and execute some code to handle it:
import java.lang.*;
import java.util.Scanner;

public class _02_TryCatchDemo{
    public static void main(String[] args){
        try{
        int[] num={10,50,14,70};
        System.out.println(num[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
    }
}
