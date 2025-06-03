Java Threads
    Threads allows a program to operate more efficiently by doing multiple things at the same time.
    Threads can be used to perform complicated tasks in the background without interrupting the main program.
Steps to use thread in Java
    1. Creating a thread (2 ways)
    2. Runing the thread

1. Creating a thread
    There are two ways to create a thread.
        a. It can be created by extending the Thread class and overriding its run() method:
        Extend Syntax
            public class Main extends Thread {
            public void run() {
                System.out.println("This code is running in a thread");
            }
            }

        b. Another way to create a thread is to implement the Runnable interface:
        Implement Syntax
            public class Main implements Runnable {
            public void run() {
                System.out.println("This code is running in a thread");
            }
            }


2. Running Threads
    a. If the class extends the Thread class, the thread can be run by creating an instance of the class and call its start() method:
    b. If the class implements the Runnable interface, the thread can be run by passing an instance of the class to a Thread object's constructor and then calling the thread's start() method:




