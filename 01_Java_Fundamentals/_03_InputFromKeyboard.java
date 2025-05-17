import java.lang.*;
import java.util.Scanner;

public class _03_InputFromKeyboard{
    public static void main(String[] args){
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String a=scObj.nextLine();
        System.out.println("Enter an integer: ");
        int b=scObj.nextInt();
        System.out.println("Enter a float: ");
        float c=scObj.nextFloat();
        System.out.println("String is "+a);
        System.out.println("Integer is "+b);
        System.out.println("Float is "+c);

    }
}

/*
Input Types
_____________       ________________________________
|__Method___|      |_________Description____________|
nextBoolean() 	    Reads a boolean value from the user
nextByte() 	        Reads a byte value from the user
nextDouble() 	    Reads a double value from the user
nextFloat() 	    Reads a float value from the user
nextInt() 	        Reads a int value from the user
nextLine() 	        Reads a String value from the user
nextLong() 	        Reads a long value from the user
nextShort() 	    Reads a short value from the user
*/  