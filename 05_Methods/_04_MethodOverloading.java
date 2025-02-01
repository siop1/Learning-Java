/*
Method overloading is a programming technique that allows multiple methods to have the same name but different parameters.
*/

public class _04_MethodOverloading{
    static void sum(int a,int b){
        int sum=a+b;
        System.out.println("Int Sum is: " + sum); 
    }

    static void sum(double a,double b){
        double sum= a+b;
        System.out.println("Double Sum is: " + sum); 
    }
    public static void main(String[] args){
        sum(10,20); // Int Sum is: 30
        sum(10.5,5.8); // Double Sum is: 16.3
        sum(10.5,5); // Double Sum is: 15.5
        
    }

}

