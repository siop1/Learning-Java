import java.lang.*;
import java.util.Scanner;

public class percentGrade{
    public static void main(String[] args){
        float a,b,c,d,e;
        Scanner scObj=new Scanner(System.in);
        System.out.println("Enter marks of five subjects");
        a=scObj.nextFloat();
        b=scObj.nextFloat();
        c=scObj.nextFloat();
        d=scObj.nextFloat();
        e=scObj.nextFloat();
        float p=(a+b+c+d+e)/5;
        char grade;

        if(p>=90){
            grade='A';
        }
        else if(p>=80){
            grade='B';
        }else if(p>=70){
            grade='C';
        }else if(p>=60){
            grade='D';
        }else if(p>=50){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.println("Percentage is " + p);
        System.out.println("Grade is " + grade);

    }
}