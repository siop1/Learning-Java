/*
In the example below, the Car class (subclass) inherits the attributes and methods from the Vehicle class (superclass):
*/
class Vehicle {
  protected String brand = "Ford";
  public void honk() {
    System.out.println("Tuut, tuut!");
  }
}

class Car extends Vehicle {
  private String modelName = "Mustang";
  public static void main(String[] args) {
    Car myFastCar = new Car();
    myFastCar.honk();
    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
  }
}

/*


Did you notice the protected modifier in Vehicle?
We set the brand attribute in Vehicle to a protected access modifier. If it was set to private, the Car class would not be able to access it.

Why And When To Use "Inheritance"?
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

Tip: Also take a look at the next chapter, Polymorphism, which uses inherited methods to perform different tasks.

 */