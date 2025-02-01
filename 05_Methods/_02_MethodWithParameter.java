public class _02_MethodWithParameter{
    static void myMethod(int a,int b){
        int sum=a+b;
        System.out.println("Sum is: " + sum);
    }
    public static void main(String[] args){
        myMethod(10,20); // Sum is: 30
        myMethod(100,8); // Sum is: 108
    }
}