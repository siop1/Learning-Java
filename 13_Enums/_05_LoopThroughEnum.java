/*
The enum type has a values() method, which returns an array of all enum constants. 
This method is useful when you want to loop through the constants of an enum:
*/
enum Level {
  LOW,
  MEDIUM,
  HIGH
}

public class _05_LoopThroughEnum { 
  public static void main(String[] args) { 
    for (Level myVar : Level.values()) {
      System.out.println(myVar);
    }
  } 
}

/*
The output will be:
LOW
MEDIUM
HIGH 
*/

/*

Difference between Enums and Classes
==> An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final (unchangeable - cannot be overridden).
==> An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces).

Why And When To Use Enums?
==> Use enums when you have values that you know aren't going to change, like month days, days, colors, deck of cards, etc.
*/
