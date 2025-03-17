/*
The final Keyword
If you don't want other classes to inherit from a class, use the final keyword:
*/
final class Vehicle {
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
If you try to access a final class, Java will generate an error:
The output will be something like this:
Main.java:9: error: cannot inherit from final Vehicle
class Main extends Vehicle {
                  ^
1 error) 
 */