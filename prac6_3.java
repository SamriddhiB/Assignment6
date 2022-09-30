/*Write a program to increment the value of one variable by one and
display it after one second using thread using sleep() method. */
import java.io.*;
import java.lang.Thread;

class prac6_3 extends Thread {

    public void run() {
        try {
            int i = 2;
            i++;

            Thread.sleep(1000);
        }

        catch (Exception e) {

            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        prac6_3 obj = new prac6_3();
        obj.start();
    }
}
