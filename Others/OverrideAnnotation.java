/*
Compiler Assistance:
The primary function of @Override is to instruct the compiler to verify that the method is 
indeed overriding a method from the superclass. If the method doesn't match any method in 
the superclass, the compiler will issue an error.
Error Prevention:
By using @Override, you can catch potential errors, such as typos in method 
names or incorrect parameter types, during compile time rather than runtime.

NOTE: It is optional but it is a good practice to use it.
*/
class Animal {
    public void makeSound() {
        System.out.println("Generic animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

public class OverrideAnnotation{
    public static void main(String[] args){
        Dog d=new Dog();
        d.makeSound();
    }
}

/*
OverrideAnnotation.java:8: error: method does not override or implement a method from a supertype
    @Override
    ^
1 error
*/