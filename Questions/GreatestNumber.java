import java.lang.*;
import java.util.Scanner;

public class GreatestNumber{
    public static void main(String[] args){
        float a,b;
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        a=scObj.nextFloat();
        b=scObj.nextFloat();
        System.out.println(a +" "+b);
        if(a>b){
            System.out.println(a + " is greatest");
        }
        else if(b>a){
            System.out.println(b + " is greatest");
        }
        else{
            System.out.println("Both are equal");
        }

    }
}