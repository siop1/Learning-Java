import java.lang.*;
import java.util.Scanner;

public class InputFromKeyboard{
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