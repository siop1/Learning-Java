public class _02_VariableAndConstant{
    public static void main(String[] args){
        int a=10;
        System.out.println("Variable a is " + a);
        a=20;
        System.out.println("Variable a is changed now which is " + a);

        final int b=10; // b is constant
        System.out.println("Constant b is " + b);
        b=20; // You get error because constant value cannot be changed.
    }
}