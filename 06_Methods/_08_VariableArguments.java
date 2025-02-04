//Variable Arguments (Varargs) in Java is a method that takes a variable number of arguments. 
public class _08_VariableArguments{
    static void myMethod(int ...arr){
        int sum=0;
        for(int e :arr){
            sum=sum+e;
        }
        System.out.println("Sum is: " + sum);
    }
    public static void main(String[] args){
        myMethod(10,20); // Sum is: 30
        myMethod(100,8,10); // Sum is: 118
        myMethod(100,8,13,6); // Sum is: 127
        myMethod(100,8,10,7, 9); // Sum is: 134
    }
}