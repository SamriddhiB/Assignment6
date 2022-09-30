/*Write a program to create three threads ‘FIRST’, ‘SECOND’,
‘THIRD’. Set the priority of the ‘FIRST’ thread to 3, the ‘SECOND’
thread to 5(default) and the ‘THIRD’ thread to 7. */

public class prac6_4 extends Thread {
    public void run() {
        System.out.println("!!!!!!!!!");
    }

    public static void main(String args[]) {

        prac6_4 FIRST = new prac6_4();
        prac6_4 SECOND = new prac6_4();
        prac6_4 THIRD = new prac6_4();

        FIRST.setPriority(4);
        SECOND.setPriority(7);

        System.out.println("Priority of thread FIRST is: " + FIRST.getPriority());
        System.out.println("Priority of thread SECOND is: " + SECOND.getPriority());
        System.out.println("Priority of thread THIRD is: " + THIRD.getPriority());

        FIRST.start();
    }
}