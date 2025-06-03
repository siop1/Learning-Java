import java.lang.*;
import java.util.Scanner;

public class shift_cipher{
    static String encrypt(String plainText){
        for(char character:plainText){
            System.out.println(character);
            return "";
        }

    }
    public static void main(String[] args){
        Scanner scObj=new Scanner(System.in);
        System.out.print("Enter the plain text: ");
        String plainText=scObj.nextLine();
        System.out.println(encrypt(plainText));
    }
}