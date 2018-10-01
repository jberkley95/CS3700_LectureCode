package Lecture3;

/**
 * @author John Berkley
 * CPP Class: <Insert Class Here>
 * Date Created: Oct 01, 2018
 */
public class HelloRunnable implements Runnable {
    public void run() {
        System.out.println("Hello from a thread!");
    }


    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
    }

}
