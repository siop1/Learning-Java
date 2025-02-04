/*
It's very obvious that methods can have any number of parameter or cannot have at all depending upon our need.
Since, constructor is also special methods so, it can have parameter too.
*/

public class _08_ConstructorWithParameter {
  int x;

  public _08_ConstructorWithParameter(int y) {
    x = y;
  }

  public static void main(String[] args) {
    _08_ConstructorWithParameter myObj = new _08_ConstructorWithParameter(5);
    System.out.println(myObj.x);
  }
}