/*
Unlike a "regular" class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private:
 */

class OuterClass {
  int x = 10;

  private class InnerClass {
    int y = 5;
  }
}

public class _02_PrivateInnerClass {
  public static void main(String[] args) {
    OuterClass myOuter = new OuterClass();
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
    System.out.println(myInner.y + myOuter.x);
  }
}

/*
If you try to access a private inner class from an outside class, an error occurs:
Main.java:13: error: OuterClass.InnerClass has private access in OuterClass
    OuterClass.InnerClass myInner = myOuter.new InnerClass();
              ^ 
 */