// To check vowel and consonant
import java.lang.*;
import java.util.Scanner;

public class Vowel{
    public static void main(String[] args){
        char a;
        Scanner scObj=new Scanner(System.in);
        a=scObj.nextLine().toLowerCase().charAt(0);
        System.out.println(a);
        if(a=='a' || a=='e' || a=='i' || a=='o' || a=='u'){
            System.out.println(a + " is vowel letter");
        }
        else{
            System.out.println(a + " is consonant letter");
        }
    }
}