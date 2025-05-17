/*
1. A year is a leap year if it's divisible by 400 (century year condition).
2. If it's not divisible by 400, it must be divisible by 4 but not divisible by 100.
*/
import java.lang.*;
import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args){
        int year;
        Scanner scObj=new Scanner(System.in);
        System.out.print("Enter a year: ");
        year=scObj.nextInt();
        // century year condition
        if(year%400==0){
            System.out.println( year + " is leap year");
        }
        else{
            // remaining condition
            if(year%4==0 && year%100!=0){
            System.out.println(year+ " is leap year");
            }
            else{
            System.out.println( year + " is not leap year");
            }
        }
        
    }
}