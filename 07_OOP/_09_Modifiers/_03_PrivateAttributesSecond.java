/* 
This program is connected to _02_PrivateAttributesMain.java
This program should produce error while accessing private attributes of _02_PrivateAttributesMain 
by _03_PrivateAttributesSecond class 
*/
public class _03_PrivateAttributesSecond{
    public static void main(String[] args){
        _02_PrivateAttributesMain myObj=new _02_PrivateAttributesMain();
        System.out.println("Name: " + myObj.fname + " " + myObj.lname);
        System.out.println("Email: " + myObj.email);
        System.out.println("Age: " + myObj.age);
    }
}

/*
To demonstrate this error, follow the steps
Step1: Compile _02_PrivateAttributeMain.java program
Step2: Compile and run this program
*/