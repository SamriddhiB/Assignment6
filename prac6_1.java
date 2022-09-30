/* 
 Write a program to create thread which display “Hello World”
message.
    A. by extending Thread class
    B. by using Runnable interface.
 */
class Thread1 extends Thread {
     public void run() {
          System.out.println("Hello World");
     }
}

public class prac6_1 implements Runnable {
     public void run() {
          System.out.println("Hello World");
     }

     public static void main(String args[]) {
          Thread1 obj = new Thread1();
          obj.start();
          prac6_1 t = new prac6_1();
          Thread t1 = new Thread(t);
          t1.start();
     }
}