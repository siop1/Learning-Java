//The finally statement lets you execute code, after try...catch, regardless of the result:
import java.lang.*;
import java.util.Scanner;

public class _03_TryCatchFinally{
    public static void main(String[] args){
        try{
        int[] num={10,50,14,70};
        System.out.println(num[10]);
        }
        catch(Exception e){
            System.out.println("Something went wrong");
        }
        finally{
            System.out.println("The 'try catch' is finished."); 
        }
    }
}