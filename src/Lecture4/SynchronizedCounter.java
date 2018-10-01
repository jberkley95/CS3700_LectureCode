package Lecture4;

/**
 * @author John Berkley
 * CPP Class: <Insert Class Here>
 * Date Created: Oct 01, 2018
 */
public class SynchronizedCounter {

    private int c = 0;



    public synchronized void increment() {

        c++;

    }



    public synchronized void decrement() {

        c--;

    }



    public synchronized int value() {

        return c;

    }

}
