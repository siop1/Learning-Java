/*
If the class extends the Thread class, the thread can be run by creating 
an instance of the class and call its start() method:
*/
public class _02_ThreadWithExtend extends Thread {
  public static void main(String[] args) {
    _02_ThreadWithExtend thread = new _02_ThreadWithExtend();
    thread.start();
    System.out.println("This code is outside of the thread");
  }
  public void run() {
    System.out.println("This code is running in a thread");
  }
}